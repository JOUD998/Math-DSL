package com.company.ui;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class JsonToDot {

    public static AtomicInteger counter = new AtomicInteger(0);

    public static String convert(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);

        StringBuilder nodesSb = new StringBuilder();
        StringBuilder edgesSb = new StringBuilder();

        nodesSb.append("digraph AST {\n");
        edgesSb.append("\n");

        buildDot(root, nodesSb, edgesSb, null);

        nodesSb.append(edgesSb); // نلحق الوصلات بعد العقد
        nodesSb.append("}\n");
        return nodesSb.toString();
    }

    public static void buildDot(JsonNode node, StringBuilder nodesSb, StringBuilder edgesSb, String parentId) {
        String nodeId = "node" + counter.getAndIncrement();
        String label = node.has("type") ? node.get("type").asText() : node.toString();

        // قسم العقد
        nodesSb.append(nodeId).append(" [label=\"").append(label).append("\"];\n");

        // قسم الوصلات
        if (parentId != null) {
            edgesSb.append(parentId).append(" -> ").append(nodeId).append(";\n");
        }

        // iterate over fields
        Iterator<String> fieldNames = node.fieldNames();
        while (fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            if (fieldName.equals("type")) continue; // نتجاهل type لأنه label
            JsonNode child = node.get(fieldName);

            if (child.isObject()) {
                buildDot(child, nodesSb, edgesSb, nodeId);
            } else if (child.isArray()) {
                for (JsonNode arrChild : child) {
                    if (arrChild.isObject()) {
                        buildDot(arrChild, nodesSb, edgesSb, nodeId);
                    } else {
                        String leafId = "node" + counter.getAndIncrement();
                        nodesSb.append(leafId).append(" [label=\"").append(arrChild.toString()).append("\"];\n");
                        edgesSb.append(nodeId).append(" -> ").append(leafId).append(";\n");
                    }
                }
            } else {
                String leafId = "node" + counter.getAndIncrement();
                nodesSb.append(leafId).append(" [label=\"").append(child.toString()).append("\"];\n");
                edgesSb.append(nodeId).append(" -> ").append(leafId).append(";\n");
            }
        }
    }
}
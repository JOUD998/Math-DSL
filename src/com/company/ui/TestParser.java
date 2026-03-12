package com.company.ui;

import com.company.core.ast.ASTBuilder;
import com.company.core.model.ASTNode;
import com.company.core.semantic.SemanticAnalyzer;
import com.company.grammar.MathDSLLexer;
import com.company.grammar.MathDSLParser;

import org.antlr.v4.runtime.*;

public class TestParser {

    public static void main(String[] args) throws Exception {

        // مثال: متغيرات عامة + دالة

//        String input = "fun testFun(x:m,y:m,z:m) = 2+1; testFun(10m,20m,30m);";

        String input = "let a:m = 5; a(10m);";

        System.out.println("INPUT:");
        System.out.println(input);
        System.out.println("-------------");

        // 1️⃣ Lexer
        CharStream charStream = CharStreams.fromString(input);
        MathDSLLexer lexer = new MathDSLLexer(charStream);

        // 2️⃣ Tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 3️⃣ Parser
        MathDSLParser parser = new MathDSLParser(tokens);
        MathDSLParser.ProgContext tree = parser.prog();

        System.out.println("Parsing done.");
        System.out.println("-------------");

        // 4️⃣ AST
        ASTBuilder astBuilder = new ASTBuilder();
        ASTNode ast = astBuilder.visitProg(tree);

        System.out.println("AST built.");
//        System.out.println("AST in JSON format:" + ast.toJson());
        System.out.println("-------------");

        // 5️⃣ Semantic Analysis
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        ast.accept(analyzer);

        System.out.println("-------------");
        System.out.println("Symbol table after analysis:" );
        analyzer.currentScope.printTree();
        System.out.println(analyzer.currentScope.getSymbols().size());




    }
}
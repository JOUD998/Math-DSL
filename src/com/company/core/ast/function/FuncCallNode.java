package com.company.core.ast.function;

import com.company.core.ast.ASTNode;
import com.company.core.ast.IdNode;
import com.company.core.semantic.ASTVisitor;

import java.util.List;

public class FuncCallNode extends ASTNode implements FunctionNode {

    public IdNode funcId;
    public List<ASTNode> args;

    public FuncCallNode(IdNode funcId, List<ASTNode> args){
        this.funcId = funcId;
        this.args = args;
    }

    @Override
    public IdNode getName() {
        return funcId;
    }

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ \"type\": \"FunctionCall\", ");
        sb.append("\"name\": \"").append(funcId.name).append("\", ");
        sb.append("\"args\": [");
        for (int i = 0; i < args.size(); i++){
            sb.append(args.get(i).toJson());
            if (i < args.size()-1) sb.append(",");
        }
        sb.append("] }");
        return sb.toString();
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitFuncCallNode(this);
    }
}

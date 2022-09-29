// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarArr extends VarDeclaration {

    private String varArrName;

    public VarDeclarArr (String varArrName) {
        this.varArrName=varArrName;
    }

    public String getVarArrName() {
        return varArrName;
    }

    public void setVarArrName(String varArrName) {
        this.varArrName=varArrName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarArr(\n");

        buffer.append(" "+tab+varArrName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarArr]");
        return buffer.toString();
    }
}

// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class MethodT extends MethodTypeName {

    private Type Type;
    private String nameMeth;

    public MethodT (Type Type, String nameMeth) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.nameMeth=nameMeth;
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getNameMeth() {
        return nameMeth;
    }

    public void setNameMeth(String nameMeth) {
        this.nameMeth=nameMeth;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodT(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+nameMeth);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodT]");
        return buffer.toString();
    }
}

// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarations implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Type Type;
    private ConstDeclaration ConstDeclaration;
    private ConstDeclarationCh ConstDeclarationCh;

    public ConstDeclarations (Type Type, ConstDeclaration ConstDeclaration, ConstDeclarationCh ConstDeclarationCh) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstDeclaration=ConstDeclaration;
        if(ConstDeclaration!=null) ConstDeclaration.setParent(this);
        this.ConstDeclarationCh=ConstDeclarationCh;
        if(ConstDeclarationCh!=null) ConstDeclarationCh.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstDeclaration getConstDeclaration() {
        return ConstDeclaration;
    }

    public void setConstDeclaration(ConstDeclaration ConstDeclaration) {
        this.ConstDeclaration=ConstDeclaration;
    }

    public ConstDeclarationCh getConstDeclarationCh() {
        return ConstDeclarationCh;
    }

    public void setConstDeclarationCh(ConstDeclarationCh ConstDeclarationCh) {
        this.ConstDeclarationCh=ConstDeclarationCh;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.accept(visitor);
        if(ConstDeclarationCh!=null) ConstDeclarationCh.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.traverseTopDown(visitor);
        if(ConstDeclarationCh!=null) ConstDeclarationCh.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstDeclaration!=null) ConstDeclaration.traverseBottomUp(visitor);
        if(ConstDeclarationCh!=null) ConstDeclarationCh.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarations(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclaration!=null)
            buffer.append(ConstDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclarationCh!=null)
            buffer.append(ConstDeclarationCh.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarations]");
        return buffer.toString();
    }
}

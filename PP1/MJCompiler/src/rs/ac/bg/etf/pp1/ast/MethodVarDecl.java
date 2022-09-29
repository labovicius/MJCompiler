// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class MethodVarDecl extends MethodVarDeclaration {

    private MethodVarDeclaration MethodVarDeclaration;
    private VarDeclarations VarDeclarations;

    public MethodVarDecl (MethodVarDeclaration MethodVarDeclaration, VarDeclarations VarDeclarations) {
        this.MethodVarDeclaration=MethodVarDeclaration;
        if(MethodVarDeclaration!=null) MethodVarDeclaration.setParent(this);
        this.VarDeclarations=VarDeclarations;
        if(VarDeclarations!=null) VarDeclarations.setParent(this);
    }

    public MethodVarDeclaration getMethodVarDeclaration() {
        return MethodVarDeclaration;
    }

    public void setMethodVarDeclaration(MethodVarDeclaration MethodVarDeclaration) {
        this.MethodVarDeclaration=MethodVarDeclaration;
    }

    public VarDeclarations getVarDeclarations() {
        return VarDeclarations;
    }

    public void setVarDeclarations(VarDeclarations VarDeclarations) {
        this.VarDeclarations=VarDeclarations;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodVarDeclaration!=null) MethodVarDeclaration.accept(visitor);
        if(VarDeclarations!=null) VarDeclarations.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodVarDeclaration!=null) MethodVarDeclaration.traverseTopDown(visitor);
        if(VarDeclarations!=null) VarDeclarations.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodVarDeclaration!=null) MethodVarDeclaration.traverseBottomUp(visitor);
        if(VarDeclarations!=null) VarDeclarations.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodVarDecl(\n");

        if(MethodVarDeclaration!=null)
            buffer.append(MethodVarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclarations!=null)
            buffer.append(VarDeclarations.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodVarDecl]");
        return buffer.toString();
    }
}

// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class OptionArgs extends OptArgs {

    private Type Type;
    private String optPar;
    private ConstTypeDeclaration ConstTypeDeclaration;

    public OptionArgs (Type Type, String optPar, ConstTypeDeclaration ConstTypeDeclaration) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.optPar=optPar;
        this.ConstTypeDeclaration=ConstTypeDeclaration;
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getOptPar() {
        return optPar;
    }

    public void setOptPar(String optPar) {
        this.optPar=optPar;
    }

    public ConstTypeDeclaration getConstTypeDeclaration() {
        return ConstTypeDeclaration;
    }

    public void setConstTypeDeclaration(ConstTypeDeclaration ConstTypeDeclaration) {
        this.ConstTypeDeclaration=ConstTypeDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstTypeDeclaration!=null) ConstTypeDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionArgs(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+optPar);
        buffer.append("\n");

        if(ConstTypeDeclaration!=null)
            buffer.append(ConstTypeDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionArgs]");
        return buffer.toString();
    }
}

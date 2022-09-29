// generated with ast extension for cup
// version 0.8
// 15/8/2022 17:59:7


package rs.ac.bg.etf.pp1.ast;

public class FormParamCh extends FormalParamCh {

    private FormalParamCh FormalParamCh;
    private FormPar FormPar;

    public FormParamCh (FormalParamCh FormalParamCh, FormPar FormPar) {
        this.FormalParamCh=FormalParamCh;
        if(FormalParamCh!=null) FormalParamCh.setParent(this);
        this.FormPar=FormPar;
        if(FormPar!=null) FormPar.setParent(this);
    }

    public FormalParamCh getFormalParamCh() {
        return FormalParamCh;
    }

    public void setFormalParamCh(FormalParamCh FormalParamCh) {
        this.FormalParamCh=FormalParamCh;
    }

    public FormPar getFormPar() {
        return FormPar;
    }

    public void setFormPar(FormPar FormPar) {
        this.FormPar=FormPar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalParamCh!=null) FormalParamCh.accept(visitor);
        if(FormPar!=null) FormPar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalParamCh!=null) FormalParamCh.traverseTopDown(visitor);
        if(FormPar!=null) FormPar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalParamCh!=null) FormalParamCh.traverseBottomUp(visitor);
        if(FormPar!=null) FormPar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParamCh(\n");

        if(FormalParamCh!=null)
            buffer.append(FormalParamCh.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormPar!=null)
            buffer.append(FormPar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParamCh]");
        return buffer.toString();
    }
}

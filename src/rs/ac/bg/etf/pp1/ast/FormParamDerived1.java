// generated with ast extension for cup
// version 0.8
// 20/7/2024 16:25:58


package rs.ac.bg.etf.pp1.ast;

public class FormParamDerived1 extends FormParam {

    private Type Type;
    private String name;
    private Brackets Brackets;
    private OtherFormParamsList OtherFormParamsList;

    public FormParamDerived1 (Type Type, String name, Brackets Brackets, OtherFormParamsList OtherFormParamsList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.name=name;
        this.Brackets=Brackets;
        if(Brackets!=null) Brackets.setParent(this);
        this.OtherFormParamsList=OtherFormParamsList;
        if(OtherFormParamsList!=null) OtherFormParamsList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Brackets getBrackets() {
        return Brackets;
    }

    public void setBrackets(Brackets Brackets) {
        this.Brackets=Brackets;
    }

    public OtherFormParamsList getOtherFormParamsList() {
        return OtherFormParamsList;
    }

    public void setOtherFormParamsList(OtherFormParamsList OtherFormParamsList) {
        this.OtherFormParamsList=OtherFormParamsList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(Brackets!=null) Brackets.accept(visitor);
        if(OtherFormParamsList!=null) OtherFormParamsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(Brackets!=null) Brackets.traverseTopDown(visitor);
        if(OtherFormParamsList!=null) OtherFormParamsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(Brackets!=null) Brackets.traverseBottomUp(visitor);
        if(OtherFormParamsList!=null) OtherFormParamsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParamDerived1(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        if(Brackets!=null)
            buffer.append(Brackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OtherFormParamsList!=null)
            buffer.append(OtherFormParamsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParamDerived1]");
        return buffer.toString();
    }
}
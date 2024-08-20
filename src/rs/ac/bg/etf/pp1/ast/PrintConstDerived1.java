// generated with ast extension for cup
// version 0.8
// 20/7/2024 16:25:58


package rs.ac.bg.etf.pp1.ast;

public class PrintConstDerived1 extends PrintConst {

    private Integer num;

    public PrintConstDerived1 (Integer num) {
        this.num=num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num=num;
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
        buffer.append("PrintConstDerived1(\n");

        buffer.append(" "+tab+num);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PrintConstDerived1]");
        return buffer.toString();
    }
}
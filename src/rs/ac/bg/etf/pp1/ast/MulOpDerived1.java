// generated with ast extension for cup
// version 0.8
// 19/7/2024 23:37:24


package rs.ac.bg.etf.pp1.ast;

public class MulOpDerived1 extends MulOp {

    public MulOpDerived1 () {
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
        buffer.append("MulOpDerived1(\n");

        buffer.append(tab);
        buffer.append(") [MulOpDerived1]");
        return buffer.toString();
    }
}
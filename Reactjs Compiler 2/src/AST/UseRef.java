package AST;

public class UseRef {
    private String name;
    InsideUseRef insideUseRef;
    public UseRef(String name, InsideUseRef insideUseRef){
        this.name = name;
        this.insideUseRef = insideUseRef;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInsideUseRef(InsideUseRef insideUseRef) {
        this.insideUseRef = insideUseRef;
    }
    public String getName() {
        return name;
    }
    public InsideUseRef getInsideUseRef() {
        return insideUseRef;
    }
    @Override
    public String toString(){
        return "const " + name + " = useRef(" + insideUseRef + ")";
    }
}

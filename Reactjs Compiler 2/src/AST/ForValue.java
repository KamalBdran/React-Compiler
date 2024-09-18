package AST;

public class ForValue {
    private ForVar forVar;

    public ForValue(ForVar forVar) {
        this.forVar = forVar;
    }

    public void setForVar(ForVar forVar) {
        this.forVar = forVar;
    }

    public ForVar getForVar() {
        return forVar;
    }

    @Override
    public String toString() {
        return "{" + forVar + "}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(forVar.toJavascript());
        return jsBuilder.toString();
    }
}

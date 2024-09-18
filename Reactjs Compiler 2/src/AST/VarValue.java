package AST;

public class VarValue {
    private String varName;

    public VarValue(String varName) {
        this.varName = varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public String toString() {
        return "{" + varName + "}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(".textContent = ").append(varName).append("\n");
        return jsBuilder.toString();
    }
}

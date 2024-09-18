package AST;

public class Toggle {
    private String varToToggle;
    private String var;

    public Toggle(String varToToggle, String var) {
        this.varToToggle = varToToggle;
        this.var = var;
    }

    public void setVarToToggle(String varToToggle) {
        this.varToToggle = varToToggle;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getVarToToggle() {
        return varToToggle;
    }

    public String getVar() {
        return var;
    }

    @Override
    public String toString() {
        return varToToggle + "(!" + var + ")";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(var).append(" = !").append(var).append("\n");
        return jsBuilder.toString();
    }

}

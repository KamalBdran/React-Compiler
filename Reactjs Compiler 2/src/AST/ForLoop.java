package AST;

public class ForLoop {
    private String var;
    private int varValue;
    private String compareValue;
    private InsideFor insideFor;

    public ForLoop(String var, int varValue, String compareValue, InsideFor insideFor) {
        this.var = var;
        this.varValue = varValue;
        this.compareValue = compareValue;
        this.insideFor = insideFor;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void setVarValue(int varValue) {
        this.varValue = varValue;
    }

    public void setCompareValue(String compareValue) {
        this.compareValue = compareValue;
    }

    public void setInsideFor(InsideFor insideFor) {
        this.insideFor = insideFor;
    }

    public String getVar() {
        return var;
    }

    public int getVarValue() {
        return varValue;
    }

    public String getCompareValue() {
        return compareValue;
    }

    public InsideFor getInsideFor() {
        return insideFor;
    }

    @Override
    public String toString() {
        return "for(" + var + " = " + varValue + "; " + var + "<" + compareValue + "; " + var + "++){ \n" + insideFor
                + "\n }";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("for(").append(var).append(" = ").append(varValue).append("; ")
                .append(var).append("<").append(compareValue).append("; ").append(var).append("++){\n")
                .append(insideFor.toJavascript()).append("} \n");
        return jsBuilder.toString();
    }
}

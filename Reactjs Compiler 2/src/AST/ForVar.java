package AST;

public class ForVar {
    private String var;
    private String counter;
    private String var2;

    public ForVar(String var, String counter, String var2) {
        this.var = var;
        this.counter = counter;
        this.var2 = var2;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar() {
        return var;
    }

    public String getCounter() {
        return counter;
    }

    public String getVar2() {
        return var2;
    }

    @Override
    public String toString() {
        return var + "[" + counter + "]." + var2;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(var).append("[").append(counter).append("].").append(var2).append("\n");
        return jsBuilder.toString();
    }
}

package AST;

public class UpdateVarIntValue {
    private String name;
    private int newValue;
    private ForVar forVar = null;

    public UpdateVarIntValue(String name, int newValue) {
        this.name = name;
        this.newValue = newValue;
    }

    public UpdateVarIntValue(String name, ForVar forVar) {
        this.name = name;
        this.forVar = forVar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewValue(int newValue) {
        this.newValue = newValue;
    }

    public void setForVar(ForVar forVar) {
        this.forVar = forVar;
    }

    public String getName() {
        return name;
    }

    public int getNewValue() {
        return newValue;
    }

    public ForVar getForVar() {
        return forVar;
    }

    @Override
    public String toString() {
        if (forVar != null) {
            return name + " = " + forVar;
        }
        return name + " = " + newValue;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        if (forVar != null) {
            jsBuilder.append(name).append(" = ").append(forVar.toJavascript()).append("\n");
            return jsBuilder.toString();
        }
        jsBuilder.append(name).append(" = ").append(newValue).append("\n");
        return jsBuilder.toString();
    }
}

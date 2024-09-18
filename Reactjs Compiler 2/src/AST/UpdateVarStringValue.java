package AST;

public class UpdateVarStringValue {
    private String name;
    private String newValue;
    private ForVar forVar = null;

    public UpdateVarStringValue(String name, String newValue) {
        this.name = name;
        this.newValue = newValue;
    }

    public UpdateVarStringValue(String name, ForVar forVar) {
        this.name = name;
        this.forVar = forVar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public void setForVar(ForVar forVar) {
        this.forVar = forVar;
    }

    public String getName() {
        return name;
    }

    public String getNewValue() {
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
        jsBuilder.append(name).append(" = ").append(newValue);
        return jsBuilder.toString();
    }
}

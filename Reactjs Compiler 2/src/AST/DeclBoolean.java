package AST;

public class DeclBoolean {
    private String type;
    private String name;
    private boolean value;

    public DeclBoolean(String type, String name, boolean value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + " " + name + " = " + value;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(type).append(" ").append(name).append(" = ").append(value).append("\n");
        return jsBuilder.toString();
    }
}

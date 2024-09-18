package AST;

public class DeclString {
    private String type;
    private String name;
    private String value;

    public DeclString(String type, String name, String value) {
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

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + " " + name + " = " + value;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(type).append(" ").append(name).append(" = '").append(value).append("'\n");
        return jsBuilder.toString();
    }
}

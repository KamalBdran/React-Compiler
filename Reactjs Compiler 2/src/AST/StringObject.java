package AST;

public class StringObject {
    private String name;
    private String value;

    public StringObject(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " : " + '"' + value + '"' + ",";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(name).append(" : '").append(value).append("', \n");
        return jsBuilder.toString();
    }
}

package AST;

public class DeclArray {
    private String type;
    private String name;

    public DeclArray(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return type + " " + name + " = []";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(type).append(" ").append(name).append(" = [] \n");
        return jsBuilder.toString();
    }
}

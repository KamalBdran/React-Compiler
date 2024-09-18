package AST;

public class NumObject {
    private String name;
    private int value;

    public NumObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " : " + value + ",";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(name).append(" : ").append(value).append(", \n");
        return jsBuilder.toString();
    }
}

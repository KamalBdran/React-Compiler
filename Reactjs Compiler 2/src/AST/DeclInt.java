package AST;

public class DeclInt {
    private String type;
    private String name;
    private int value;
    private ArrayLength arrayLength = null;

    public DeclInt(String type, String name, int value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public DeclInt(String type, String name, ArrayLength arrayLength) {
        this.type = type;
        this.name = name;
        this.arrayLength = arrayLength;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setArrayLength(ArrayLength arrayLength) {
        this.arrayLength = arrayLength;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public ArrayLength getArrayLength() {
        return arrayLength;
    }

    @Override
    public String toString() {
        if (arrayLength != null) {
            return type + " " + name + " = " + arrayLength.toString();
        }

        return type + " " + name + " = " + value;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        if (arrayLength != null) {
            jsBuilder.append(type).append(" ").append(name).append(" = ").append(arrayLength.toJavascript());
            return jsBuilder.toString();
        }
        jsBuilder.append(type).append(" ").append(name).append(" = ").append(value).append("\n");
        return jsBuilder.toString();
    }
}

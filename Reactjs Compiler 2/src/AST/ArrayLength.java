package AST;

public class ArrayLength {
    private String arrayName;

    public ArrayLength(String arrayName) {
        this.arrayName = arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public String getArrayName() {
        return arrayName;
    }

    @Override
    public String toString() {
        return arrayName + ".length";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(arrayName).append(".length\n");
        return jsBuilder.toString();
    }

}

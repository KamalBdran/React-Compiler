package AST;

public class PropsValue {
    private String propsName;

    public PropsValue(String propsName) {
        this.propsName = propsName;
    }

    public void setPropsName(String propsName) {
        this.propsName = propsName;
    }

    public String getPropsName() {
        return propsName;
    }

    @Override
    public String toString() {
        return "{props." + propsName + "}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("data.").append(propsName).append("\n");
        return jsBuilder.toString();
    }
}

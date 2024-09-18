package AST;

public class PropsAtt {
    private String attName;
    private PropsValue propsValue;

    public PropsAtt(String attName, PropsValue propsValue) {
        this.attName = attName;
        this.propsValue = propsValue;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public void setPropsValue(PropsValue propsValue) {
        this.propsValue = propsValue;
    }

    public String getAttName() {
        return attName;
    }

    public PropsValue getPropsValue() {
        return propsValue;
    }

    @Override
    public String toString() {
        return attName + " = " + propsValue;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(".setAttribute('").append(attName).append("', ").append(propsValue.toJavascript())
                .append(")\n");
        return jsBuilder.toString();
    }
}

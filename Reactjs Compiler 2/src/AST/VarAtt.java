package AST;

public class VarAtt {
    private String attName;
    private String attValue;

    public VarAtt(String attName, String attValue) {
        this.attName = attName;
        this.attValue = attValue;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public void setAttValue(String attValue) {
        this.attValue = attValue;
    }

    public String getAttName() {
        return attName;
    }

    public String getAttValue() {
        return attValue;
    }

    @Override
    public String toString() {
        return attName + " = { " + attValue + " }";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(".setAttribute('").append(attName).append("', '").append(attValue)
                .append("')\n");
        return jsBuilder.toString();
    }
}

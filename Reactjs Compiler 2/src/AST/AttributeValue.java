package AST;

public class AttributeValue {
    private String valueOfTheAttribute;

    public AttributeValue(String valueOfTheAttribute) {
        this.valueOfTheAttribute = valueOfTheAttribute;
    }

    public void setValueOfTheAttribute(String valueOfTheAttribute) {
        this.valueOfTheAttribute = valueOfTheAttribute;
    }

    public String getValueOfTheAttribute() {
        return valueOfTheAttribute;
    }

    @Override
    public String toString() {
        return '"' + valueOfTheAttribute + '"';
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(valueOfTheAttribute);
        return jsBuilder.toString();
    }
}

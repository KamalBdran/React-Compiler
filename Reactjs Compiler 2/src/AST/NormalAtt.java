package AST;

import java.util.Objects;

public class NormalAtt {
    private String attName;
    private AttributeValue attributeValue;

    public NormalAtt(String attName, AttributeValue attributeValue) {
        this.attName = attName;
        this.attributeValue = attributeValue;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttName() {
        return attName;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    @Override
    public String toString() {
        return attName + " = " + attributeValue;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();

        if(Objects.equals(attName, "class")){
            jsBuilder.append(".classList.add('").append(attributeValue.toJavascript())
                    .append("')");
        }else {
            jsBuilder.append(".setAttribute('").append(attName).append("', '").append(attributeValue.toJavascript())
                    .append("')");
        }

        return jsBuilder.toString();
    }

    public String getAttribute(){
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(attName).append(": '").append(attributeValue.toJavascript()).append("',");
        return jsBuilder.toString();
    }
}

package AST;

public class ForAtt {
    private String attName;
    private ForValue forValue;

    public ForAtt(String attName, ForValue forValue) {
        this.attName = attName;
        this.forValue = forValue;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public void setForValue(ForValue forValue) {
        this.forValue = forValue;
    }

    public String getAttName() {
        return attName;
    }

    public ForValue getForValue() {
        return forValue;
    }

    @Override
    public String toString() {
        return attName + " = " + forValue;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(".").append(attName).append(" = ").append(forValue.toJavascript()).append("\n");
        return jsBuilder.toString();
    }

    public String getAttribute(){
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(attName).append(": ").append(forValue.toJavascript()).append(",");
        return jsBuilder.toString();
    }
}

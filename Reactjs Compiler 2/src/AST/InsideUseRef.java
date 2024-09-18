package AST;

public class InsideUseRef {
    private String stringValue = null;
    private int intValue;

    public InsideUseRef(String stringValue) {
        this.stringValue = stringValue;
    }

    public InsideUseRef(int intValue) {
        this.intValue = intValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    @Override
    public String toString() {
        if (stringValue != null) {
            return '"' + stringValue + '"';
        }
        return String.valueOf(intValue);
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        if (stringValue != null) {
            jsBuilder.append('"').append(stringValue).append('"');
            return jsBuilder.toString();
        }
        jsBuilder.append(intValue);
        return jsBuilder.toString();
    }
}

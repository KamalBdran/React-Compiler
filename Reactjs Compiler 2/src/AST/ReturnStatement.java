package AST;

public class ReturnStatement {
    private HtmlEl toReturn;

    public ReturnStatement(HtmlEl toReturn) {
        this.toReturn = toReturn;
    }

    public void setToReturn(HtmlEl toReturn) {
        this.toReturn = toReturn;
    }

    public HtmlEl getToReturn() {
        return toReturn;
    }

    @Override
    public String toString() {
        return "return (\n" + toReturn + "\n)";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(toReturn.toJavascript());
        return jsBuilder.toString();
    }
}

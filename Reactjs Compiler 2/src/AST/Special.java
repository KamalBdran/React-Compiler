package AST;

public class Special {
    private String firstVar;
    private String secondVar;
    private HtmlEl htmlEl;

    public Special(String firstVar, String secondVar, HtmlEl htmlEl) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.htmlEl = htmlEl;
    }

    public void setHtmlEl(HtmlEl htmlEl) {
        this.htmlEl = htmlEl;
    }

    public void setSecondVar(String secondVar) {
        this.secondVar = secondVar;
    }

    public void setFirstVar(String firstVar) {
        this.firstVar = firstVar;
    }

    public HtmlEl getHtmlEl() {
        return htmlEl;
    }

    public String getSecondVar() {
        return secondVar;
    }

    public String getFirstVar() {
        return firstVar;
    }

    @Override
    public String toString() {
        return "{ (" + firstVar + " || !" + secondVar + ") &&" + htmlEl.toString() + " }";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("if(").append(firstVar).append(" || ").append(secondVar).append(") { \n")
                .append(htmlEl.toJavascript()).append("\n }\n");
        return jsBuilder.toString();
    }
}

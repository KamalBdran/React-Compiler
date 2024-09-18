package AST;

public class InsideFor {
    private String pushTo;
    private HtmlEl htmlEl;

    public InsideFor(String pushTo, HtmlEl htmlEl) {
        this.pushTo = pushTo;
        this.htmlEl = htmlEl;
    }

    public void setPushTo(String pushTo) {
        this.pushTo = pushTo;
    }

    public void setHtmlEl(HtmlEl htmlEl) {
        this.htmlEl = htmlEl;
    }

    public String getPushTo() {
        return pushTo;
    }

    public HtmlEl getHtmlEl() {
        return htmlEl;
    }

    @Override
    public String toString() {
        return pushTo + ".push(" + htmlEl + ")";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(pushTo).append(".push(").append(htmlEl.toJavascript()).append(")\n");
        return jsBuilder.toString();
    }
}

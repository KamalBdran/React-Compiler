package AST;

public class OnClick {
    private InsideOnClick insideOnClick;

    public OnClick(InsideOnClick insideOnClick) {
        this.insideOnClick = insideOnClick;
    }

    public void setInsideOnClick(InsideOnClick insideOnClick) {
        this.insideOnClick = insideOnClick;
    }

    public InsideOnClick getInsideOnClick() {
        return insideOnClick;
    }

    @Override
    public String toString() {
        return "{() => {" + insideOnClick + "}}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(insideOnClick.toJavascript());
        return jsBuilder.toString();
    }
}

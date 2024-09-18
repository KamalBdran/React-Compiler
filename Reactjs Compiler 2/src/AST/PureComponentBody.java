package AST;

public class PureComponentBody {
    private ComponentBody componentBody;

    public PureComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    public ComponentBody getComponentBody() {
        return componentBody;
    }

    @Override
    public String toString() {
        return "render(){\n" + componentBody.toString() + "\n}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("render(){ \n").append(componentBody.toJavascript()).append("\n }\n");
        return jsBuilder.toString();
    }
}

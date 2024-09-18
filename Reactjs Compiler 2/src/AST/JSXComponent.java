package AST;

public class JSXComponent {
    private ComponentName componentName;
    private ComponentBody componentBody;
    private boolean haveProps;

    public JSXComponent(ComponentName componentName, ComponentBody componentBody, boolean haveProps) {
        this.componentName = componentName;
        this.componentBody = componentBody;
        this.haveProps = haveProps;
    }

    public void setComponentName(ComponentName componentName) {
        this.componentName = componentName;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }

    public void setHaveProps(boolean haveProps) {
        this.haveProps = haveProps;
    }

    public ComponentName getComponentName() {
        return componentName;
    }

    public ComponentBody getComponentBody() {
        return componentBody;
    }

    public boolean getHaveProps() {
        return haveProps;
    }

    @Override
    public String toString() {
        return "const " + componentName.toString() + " = (" + (haveProps ? "props" : "") + ") => {\n"
                + componentBody.toString() + "\n}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("function ").append(componentName.toJavascript()).append("(");
        if (haveProps) {
            jsBuilder.append("data");
        }
        jsBuilder.append(") { \n").append(componentBody.toJavascript()).append("\n } \n");
        return jsBuilder.toString();
    }
}

package AST;

public class PureComponent {
    private ComponentName componentName;
    private PureComponentBody pureComponentBody;

    public PureComponent(ComponentName componentName, PureComponentBody pureComponentBody) {
        this.componentName = componentName;
        this.pureComponentBody = pureComponentBody;
    }

    public void setComponentName(ComponentName componentName) {
        this.componentName = componentName;
    }

    public void setPureComponentBody(PureComponentBody pureComponentBody) {
        this.pureComponentBody = pureComponentBody;
    }

    public ComponentName getComponentName() {
        return componentName;
    }

    public PureComponentBody getPureComponentBody() {
        return pureComponentBody;
    }

    @Override
    public String toString() {
        return "class " + componentName.toString() + " extends React.PureComponent { \n " + pureComponentBody.toString()
                + "\n}";
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("class ").append(componentName.toJavascript()).append("extends React.PureComponent { \n")
                .append(pureComponentBody.toJavascript()).append(" \n}\n");
        return jsBuilder.toString();
    }
}

package AST;

public class StringState {
    private String string;

    public StringState(String string) {
        this.string = string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return '"' + string + '"';
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append('"').append(string).append('"');
        return jsBuilder.toString();
    }
}

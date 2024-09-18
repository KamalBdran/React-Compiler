package AST;

public class InsideUseEffect {
    private String id;

    public InsideUseEffect(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(id);
        return jsBuilder.toString();
    }
}

package AST;

public class UseState {
    private String var;
    private String setVar;
    private BoolState booleanState = null;
    private NumberState numberState = null;
    private StringState stringState = null;
    private ArrayState arrayState = null;

    public UseState(String var, String setVar, BoolState booleanState) {
        this.var = var;
        this.setVar = setVar;
        this.booleanState = booleanState;
    }

    public UseState(String var, String setVar, NumberState numberState) {
        this.var = var;
        this.setVar = setVar;
        this.numberState = numberState;
    }

    public UseState(String var, String setVar, StringState stringState) {
        this.var = var;
        this.setVar = setVar;
        this.stringState = stringState;
    }

    public UseState(String var, String setVar, ArrayState arrayState) {
        this.var = var;
        this.setVar = setVar;
        this.arrayState = arrayState;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void setSetVar(String setVar) {
        this.setVar = setVar;
    }

    public void setBooleanState(BoolState booleanState) {
        this.booleanState = booleanState;
    }

    public void setArrayState(ArrayState arrayState) {
        this.arrayState = arrayState;
    }

    public void setStringState(StringState stringState) {
        this.stringState = stringState;
    }

    public void setNumberState(NumberState numberState) {
        this.numberState = numberState;
    }

    public String getVar() {
        return var;
    }

    public String getSetVar() {
        return setVar;
    }

    public BoolState getBooleanState() {
        return booleanState;
    }

    public NumberState getNumberState() {
        return numberState;
    }

    public StringState getStringState() {
        return stringState;
    }

    public ArrayState getArrayState() {
        return arrayState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("const [").append(var).append(", ").append(setVar).append("] = useState(");
        if (booleanState != null) {
            result.append(booleanState.toString());
        }
        if (numberState != null) {
            result.append(numberState.toString());
        }
        if (stringState != null) {
            result.append(stringState.toString());
        }
        if (arrayState != null) {
            result.append(arrayState.toString());
        }
        result.append(")");
        return result.toString();
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        if (booleanState != null) {
            jsBuilder.append("const ").append(var).append(" = ").append(booleanState.toJavascript()).append("\n");
           // jsBuilder.append("function ").append(setVar).append("(newValue){ \n").append(var).append(" = newValue");
        }
        if (numberState != null) {
            jsBuilder.append("const ").append(var).append(" = ").append(numberState.toJavascript()).append("\n");
           // jsBuilder.append("function ").append(setVar).append("(newValue){ \n").append(var).append(" = newValue");
        }
        if (stringState != null) {
            jsBuilder.append("const ").append(var).append(" = ").append(stringState.toJavascript()).append("\n");
           // jsBuilder.append("function ").append(setVar).append("(newValue){ \n").append(var).append(" = newValue");
        }
        if (arrayState != null) {
            jsBuilder.append("const ").append(var).append(" = ").append(arrayState.toJavascript()).append("\n");
            //jsBuilder.append("function ").append(setVar).append("(newValue){ \n").append(var).append(" = newValue");
        }

        return jsBuilder.toString();
    }
}

package AST;

import java.util.List;

public class ObjectX {
    private List<NumObject> numObjectList = null;
    private List<StringObject> stringObjectList = null;

    public ObjectX(List<NumObject> numObjectList, List<StringObject> stringObjectList) {
        this.numObjectList = numObjectList;
        this.stringObjectList = stringObjectList;
    }

    public void setNumObjectList(List<NumObject> numObjectList) {
        this.numObjectList = numObjectList;
    }

    public void setStringObjectList(List<StringObject> stringObjectList) {
        this.stringObjectList = stringObjectList;
    }

    public List<NumObject> getNumObjectList() {
        return numObjectList;
    }

    public List<StringObject> getStringObjectList() {
        return stringObjectList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{\n");
        if (!numObjectList.isEmpty()) {
            result.append(numObjectList.toString());
        }
        if (!stringObjectList.isEmpty()) {
            result.append(stringObjectList.toString());
        }
        result.append("\n},\n");
        return result.toString();
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("{ \n");
        if (!numObjectList.isEmpty()) {
            for (NumObject numObject : numObjectList) {
                jsBuilder.append(numObject.toJavascript());
            }
        }
        if (!stringObjectList.isEmpty()) {
            for (StringObject stringObject : stringObjectList) {
                jsBuilder.append(stringObject.toJavascript());
            }
        }
        jsBuilder.append("}, \n");
        return jsBuilder.toString();
    }
}

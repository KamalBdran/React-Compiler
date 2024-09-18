package AST;

import java.util.List;

public class ArrayState {
    private List<ObjectX> objectList;

    public ArrayState(List<ObjectX> objectList) {
        this.objectList = objectList;
    }

    public void setObjectList(List<ObjectX> objectList) {
        this.objectList = objectList;
    }

    public List<ObjectX> getObjectList() {
        return objectList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[").append(objectList.toString()).append("]");
        return result.toString();
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("[");
        for (ObjectX objectX : objectList) {
            jsBuilder.append(objectX.toJavascript());
        }
        jsBuilder.append("] \n");
        return jsBuilder.toString();
    }
}

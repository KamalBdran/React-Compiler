package AST;

import java.util.List;

public class InsideOnClick {
    private List<UpdateVarStringValue> updateVarStringValueList = null;
    private List<Toggle> toggleList = null;
    private  String variableName = null;
    private String operation = null;
    private String num = null;
    public InsideOnClick(List<UpdateVarStringValue> updateVarStringValueList,
                         List<Toggle> toggleList, String variableName, String operation, String num) {
        this.updateVarStringValueList = updateVarStringValueList;
        this.toggleList = toggleList;
        this.variableName = variableName;
        this.operation = operation;
        this.num = num;
    }

    public void setUpdateVarStringValueList(List<UpdateVarStringValue> updateVarStringValueList) {
        this.updateVarStringValueList = updateVarStringValueList;
    }

    public void setToggleList(List<Toggle> toggleList) {
        this.toggleList = toggleList;
    }

    public List<UpdateVarStringValue> getUpdateVarStringValueList() {
        return updateVarStringValueList;
    }

    public List<Toggle> getToggleList() {
        return toggleList;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if(variableName != null){
            s.append(variableName).append(" = ").append(variableName).append(' ').append(operation).append(' ').append(num).append('\n');
        }
        s.append(updateVarStringValueList.toString()).append(toggleList.toString());
        return s.toString() ;
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append(" if (span3.style.display === \"none\") {\n" +
                "            span3.style.display = \"block\";\n" +
                "          } else {\n" +
                "            span3.style.display = \"none\";\n" +
                "          }");
        if(variableName != null){
            jsBuilder.append(variableName).append(" = ").append(variableName).append(' ').append(operation).append(' ').append(num).append('\n');
            jsBuilder.append("p2.textContent = ").append(variableName).append('\n');
        }
        for (UpdateVarStringValue updateVarStringValue : updateVarStringValueList) {
            jsBuilder.append(updateVarStringValue.toJavascript());
        }
        for (Toggle toggle : toggleList) {
            jsBuilder.append(toggle.toJavascript());
        }
        return jsBuilder.toString();
    }
}

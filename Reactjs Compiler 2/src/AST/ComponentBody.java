package AST;

import java.util.List;

public class ComponentBody {
    private List<DeclArray> declArrayList = null;
    private List<DeclString> declStringList = null;
    private List<DeclInt> declIntList = null;
    private List<DeclBoolean> declBooleanList = null;
    private List<UpdateVarStringValue> updateVarStringValueList = null;
    private List<UpdateVarIntValue> updateVarIntValueList = null;
    private List<UseState> useStateList = null;
    private List<UseEffect> useEffectList = null;
    private List<UseRef> useRefList = null;
    private List<ForLoop> forLoopList = null;
    private ReturnStatement returnStatement = null;

    public ComponentBody(List<DeclArray> declArrayList, List<DeclString> declStringList,
            List<DeclInt> declIntList, List<DeclBoolean> declBooleanList,
            List<UpdateVarStringValue> updateVarStringValueList,
            List<UpdateVarIntValue> updateVarIntValueList,
            List<UseState> useStateList, List<UseEffect> useEffectList,
            List<UseRef> useRefList, List<ForLoop> forLoopList,
            ReturnStatement returnStatement) {
        this.declArrayList = declArrayList;
        this.declStringList = declStringList;
        this.declIntList = declIntList;
        this.declBooleanList = declBooleanList;
        this.updateVarStringValueList = updateVarStringValueList;
        this.updateVarIntValueList = updateVarIntValueList;
        this.useStateList = useStateList;
        this.useEffectList = useEffectList;
        this.useRefList = useRefList;
        this.forLoopList = forLoopList;
        this.returnStatement = returnStatement;
    }

    public void setUpdateVarStringValueList(List<UpdateVarStringValue> updateVarStringValueList) {
        this.updateVarStringValueList = updateVarStringValueList;
    }

    public void setDeclArrayList(List<DeclArray> declArrayList) {
        this.declArrayList = declArrayList;
    }

    public void setDeclBooleanList(List<DeclBoolean> declBooleanList) {
        this.declBooleanList = declBooleanList;
    }

    public void setDeclIntList(List<DeclInt> declIntList) {
        this.declIntList = declIntList;
    }

    public void setDeclStringList(List<DeclString> declStringList) {
        this.declStringList = declStringList;
    }

    public void setUpdateVarIntValueList(List<UpdateVarIntValue> updateVarIntValueList) {
        this.updateVarIntValueList = updateVarIntValueList;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public void setForLoopList(List<ForLoop> forLoopList) {
        this.forLoopList = forLoopList;
    }

    public void setUseEffectList(List<UseEffect> useEffectList) {
        this.useEffectList = useEffectList;
    }

    public void setUseRefList(List<UseRef> useRefList) {
        this.useRefList = useRefList;
    }

    public void setUseStateList(List<UseState> useStateList) {
        this.useStateList = useStateList;
    }

    public List<UpdateVarStringValue> getUpdateVarStringValueList() {
        return updateVarStringValueList;
    }

    public List<DeclArray> getDeclArrayList() {
        return declArrayList;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public List<DeclBoolean> getDeclBooleanList() {
        return declBooleanList;
    }

    public List<DeclInt> getDeclIntList() {
        return declIntList;
    }

    public List<DeclString> getDeclStringList() {
        return declStringList;
    }

    public List<ForLoop> getForLoopList() {
        return forLoopList;
    }

    public List<UpdateVarIntValue> getUpdateVarIntValueList() {
        return updateVarIntValueList;
    }

    public List<UseEffect> getUseEffectList() {
        return useEffectList;
    }

    public List<UseRef> getUseRefList() {
        return useRefList;
    }

    public List<UseState> getUseStateList() {
        return useStateList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!declArrayList.isEmpty()) {
            result.append(declArrayList).append("\n");
        }
        if (!declStringList.isEmpty()) {
            result.append(declStringList).append("\n");
        }
        if (!declIntList.isEmpty()) {
            result.append(declIntList).append("\n");
        }
        if (!declBooleanList.isEmpty()) {
            result.append(declBooleanList).append("\n");
        }
        if (!updateVarStringValueList.isEmpty()) {
            result.append(updateVarStringValueList).append("\n");
        }
        if (!updateVarIntValueList.isEmpty()) {
            result.append(updateVarIntValueList).append("\n");
        }
        if (!useStateList.isEmpty()) {
            result.append(useStateList).append("\n");
        }
        if (!useEffectList.isEmpty()) {
            result.append(useEffectList).append("\n");
        }
        if (!useRefList.isEmpty()) {
            result.append(useRefList).append("\n");
        }
        if (!forLoopList.isEmpty()) {
            result.append(forLoopList).append("\n");
        }
        result.append(returnStatement);
        return result.toString();
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        if (!useStateList.isEmpty()) {
            for (UseState useState : useStateList)
                jsBuilder.append(useState.toJavascript()).append("\n");
        }
        if (!declArrayList.isEmpty()) {
            for (DeclArray declArray : declArrayList)
                jsBuilder.append(declArray.toJavascript()).append("\n");
        }
        if (!declStringList.isEmpty()) {
            for (DeclString declString : declStringList)
                jsBuilder.append(declString.toJavascript()).append("\n");
        }
        if (!declIntList.isEmpty()) {
            for (DeclInt declInt : declIntList)
                jsBuilder.append(declInt.toJavascript()).append("\n");
        }
        if (!declBooleanList.isEmpty()) {
            for (DeclBoolean declBoolean : declBooleanList)
                jsBuilder.append(declBoolean.toJavascript()).append("\n");
        }
        if (!updateVarStringValueList.isEmpty()) {
            for (UpdateVarStringValue updateVarStringValue : updateVarStringValueList)
                jsBuilder.append(updateVarStringValue.toJavascript()).append("\n");
        }
        if (!updateVarIntValueList.isEmpty()) {
            for (UpdateVarIntValue updateVarIntValue : updateVarIntValueList)
                jsBuilder.append(updateVarIntValue.toJavascript()).append("\n");
        }

        if (!useEffectList.isEmpty()) {
            for (UseEffect useEffect : useEffectList) {
            }
            // jsBuilder.append(useEffect.toJavascript()).append("\n");
        }
        if (!useRefList.isEmpty()) {
            for (UseRef useRef : useRefList) {
            }
            // jsBuilder.append(useRef.toJavascript()).append("\n");
        }
        if (!forLoopList.isEmpty()) {
            for (ForLoop forLoop : forLoopList)
                jsBuilder.append(forLoop.toJavascript()).append("\n");
        }
        jsBuilder.append(returnStatement.toJavascript());
        return jsBuilder.toString();
    }
}

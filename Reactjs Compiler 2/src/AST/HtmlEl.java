package AST;

import java.util.List;
import java.util.Objects;


public class HtmlEl {
    static int x = 1;
    private String tagName;
    private List<HtmlEl> htmlElList = null;
    private List<String> text = null;
    private List<PropsValue> propsValueList = null;
    private List<VarValue> varValueList = null;
    private List<ForValue> forValueList = null;
    private List<Special> specialList = null;
    private OnClick onClick = null;
    private List<ForAtt> forAttList = null;
    private List<NormalAtt> normalAttList = null;
    private List<PropsAtt> propsAttList = null;
    private List<VarAtt> varAttList = null;

    public HtmlEl() {
    }

    public HtmlEl(String tagName, List<HtmlEl> htmlElList, List<String> text,
            List<PropsValue> propsValueList, List<VarValue> varValueList,
            List<ForValue> forValueList, List<Special> specialList,
            OnClick onClick, List<ForAtt> forAttList, List<NormalAtt> normalAttList,
            List<PropsAtt> propsAttList, List<VarAtt> varAttList) {
        this.tagName = tagName;
        this.htmlElList = htmlElList;
        this.text = text;
        this.propsValueList = propsValueList;
        this.varValueList = varValueList;
        this.forValueList = forValueList;
        this.specialList = specialList;
        this.onClick = onClick;
        this.forAttList = forAttList;
        this.normalAttList = normalAttList;
        this.propsAttList = propsAttList;
        this.varAttList = varAttList;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setHtmlElList(List<HtmlEl> htmlElList) {
        this.htmlElList = htmlElList;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public void setPropsValueList(List<PropsValue> propsValueList) {
        this.propsValueList = propsValueList;
    }

    public void setVarValueList(List<VarValue> varValueList) {
        this.varValueList = varValueList;
    }

    public void setForValueList(List<ForValue> forValueList) {
        this.forValueList = forValueList;
    }

    public void setSpecialList(List<Special> specialList) {
        this.specialList = specialList;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public void setForAttList(List<ForAtt> forAttList) {
        this.forAttList = forAttList;
    }

    public void setNormalAttList(List<NormalAtt> normalAttList) {
        this.normalAttList = normalAttList;
    }

    public void setPropsAttList(List<PropsAtt> propsAttList) {
        this.propsAttList = propsAttList;
    }

    public void setVarAttList(List<VarAtt> varAttList) {
        this.varAttList = varAttList;
    }

    public String getTagName() {
        return tagName;
    }

    public List<HtmlEl> getHtmlElList() {
        return htmlElList;
    }

    public List<String> getText() {
        return text;
    }

    public List<ForAtt> getForAttList() {
        return forAttList;
    }

    public OnClick getOnClick() {
        return onClick;
    }

    public List<ForValue> getForValueList() {
        return forValueList;
    }

    public List<PropsValue> getPropsValueList() {
        return propsValueList;
    }

    public List<VarValue> getVarValueList() {
        return varValueList;
    }

    public List<NormalAtt> getNormalAttList() {
        return normalAttList;
    }

    public List<Special> getSpecialList() {
        return specialList;
    }

    public List<PropsAtt> getPropsAttList() {
        return propsAttList;
    }

    public List<VarAtt> getVarAttList() {
        return varAttList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("<").append(tagName).append(" ");
        if (!forAttList.isEmpty()) {
            result.append(forAttList.toString()).append(" ");
        }
        if (!normalAttList.isEmpty()) {
            result.append(normalAttList.toString()).append(" ");
        }
        if (!propsAttList.isEmpty()) {
            result.append(propsAttList.toString()).append(" ");
        }
        if (!varAttList.isEmpty()) {
            result.append(varAttList.toString()).append(" ");
        }
        if (onClick != null) {
            result.append("onClick = ").append(onClick.toString());
        }
        result.append("> \n");

        if (!forValueList.isEmpty()) {
            result.append(forValueList.toString()).append(" ");
        }
        if (!htmlElList.isEmpty()) {
            result.append(htmlElList.toString()).append(" ");
        }
        if (text != null) {
            result.append(text.toString()).append(" ");
        }
        if (!propsValueList.isEmpty()) {
            result.append(propsValueList.toString()).append(" ");
        }
        if (!varValueList.isEmpty()) {
            result.append(varValueList.toString()).append(" ");
        }
        if (!specialList.isEmpty()) {
            result.append(specialList.toString()).append(" ");
        }
        result.append("\n <").append(tagName).append(">");
        return result.toString();
    }

//    public String toJavascript() {
//        StringBuilder jsBuilder = new StringBuilder();
//        var firstChar = tagName.substring(0, 1);
//        if(firstChar == firstChar.toUpperCase()){
//            jsBuilder.append(tagName).append("({");
//            if (!normalAttList.isEmpty()) {
//                for (NormalAtt normalAtt : normalAttList) {
//                    jsBuilder.append(normalAtt.getAttribute());
//                }
//            }
//            if (!forAttList.isEmpty()) {
//                for (ForAtt forAtt : forAttList) {
//                    jsBuilder.append(forAtt.getAttribute());
//                }
//            }
//            if (!htmlElList.isEmpty()) {
//                for (HtmlEl htmlEl : htmlElList) {
//                    jsBuilder.append(htmlEl.toJavascript()).append("\n");
//                }
//            }
//           jsBuilder.append("})");
//        }else {
//            jsBuilder.append("const ").append(tagName).append(x).append(" = document.createElement('").append(tagName).append("')\n");
//            jsBuilder.append("document.body.appendChild(").append(tagName).append(x).append(")\n");
//
//            if (!forAttList.isEmpty()) {
//                for (ForAtt forAtt : forAttList) {
//                    jsBuilder.append(tagName).append(x).append(forAtt.toJavascript()).append("\n");
//                }
//            }
//            if (!normalAttList.isEmpty()) {
//                for (NormalAtt normalAtt : normalAttList) {
//                    jsBuilder.append(tagName).append(x).append(normalAtt.toJavascript()).append("\n");
//                }
//            }
//            if (!propsAttList.isEmpty()) {
//                for (PropsAtt propsAtt : propsAttList) {
//                    jsBuilder.append(tagName).append(x).append(propsAtt.toJavascript()).append("\n");
//                }
//            }
//            if (!varAttList.isEmpty()) {
//                for (VarAtt varAtt : varAttList) {
//                    jsBuilder.append(tagName).append(x).append(varAtt.toJavascript()).append("\n");
//                }
//            }
//            if (onClick != null) {
//                jsBuilder.append(tagName).append(x).append("addEventListener('click', function() { \n").append(onClick.toJavascript())
//                        .append("\n }\n");
//            }
//            if (!forValueList.isEmpty()) {
//                for (ForValue forValue : forValueList) {
//                    jsBuilder.append(tagName).append(x).append(".textContent = ").append(forValue.toJavascript()).append("\n");
//                }
//            }
//            if (!htmlElList.isEmpty()) {
//                for (HtmlEl htmlEl : htmlElList) {
//                    x++;
//                    jsBuilder.append(htmlEl.toJavascript()).append("\n");
//                }
//            }
//            // if (text != null) {
//
//            //     jsBuilder.append(tagName).append(".textContent = ").append(text.get(0));
//            // }
//            if (!propsValueList.isEmpty()) {
//                for (PropsValue propsValue : propsValueList) {
//                    jsBuilder.append(tagName).append(x).append(".textContent = ").append(propsValue.toJavascript()).append("\n");
//                }
//            }
//            if (!varValueList.isEmpty()) {
//                for (VarValue varValue : varValueList) {
//                    jsBuilder.append(tagName).append(x).append(varValue.toJavascript()).append("\n");
//                }
//            }
//            if (!specialList.isEmpty()) {
//                for (Special special : specialList) {
//                    jsBuilder.append(special.toJavascript()).append("\n");
//                }
//            }
////            if(!Objects.equals(tagName, "div")){
//
////            }
//        }
//
//
//        return jsBuilder.toString();
//    }
public String toJavascript() {
    StringBuilder jsBuilder = new StringBuilder();
    String firstChar = tagName.substring(0, 1);
    boolean isCustomComponent = Character.isUpperCase(firstChar.charAt(0));

    if (isCustomComponent) {
        jsBuilder.append(tagName).append("({");
        if (!normalAttList.isEmpty()) {
            for (NormalAtt normalAtt : normalAttList) {
                jsBuilder.append(normalAtt.getAttribute());
            }
        }
        if (!forAttList.isEmpty()) {
            for (ForAtt forAtt : forAttList) {
                jsBuilder.append(forAtt.getAttribute());
            }
        }

        if (!htmlElList.isEmpty()) {
            for (HtmlEl htmlEl : htmlElList) {
                jsBuilder.append(htmlEl.toJavascript()).append("\n");
            }
        }
        jsBuilder.append("})");
        if (onClick != null) {
            jsBuilder.append(tagName).append(x).append(".addEventListener('click', function() { \n").append(onClick.toJavascript())
                    .append("\n });\n");
        }
    } else {
        // Keep track of the current parent element
        String parentElement = "document.body";
        jsBuilder.append(createElementCode(tagName, parentElement));

        if (!forAttList.isEmpty()) {
            for (ForAtt forAtt : forAttList) {
                jsBuilder.append(tagName).append(x).append(forAtt.toJavascript()).append("\n");
            }
        }
        if (!normalAttList.isEmpty()) {
            for (NormalAtt normalAtt : normalAttList) {
                jsBuilder.append(tagName).append(x).append(normalAtt.toJavascript()).append("\n");
            }
        }
        if (!propsAttList.isEmpty()) {
            for (PropsAtt propsAtt : propsAttList) {
                jsBuilder.append(tagName).append(x).append(propsAtt.toJavascript()).append("\n");
            }
        }
        if (!varAttList.isEmpty()) {
            for (VarAtt varAtt : varAttList) {
                jsBuilder.append(tagName).append(x).append(varAtt.toJavascript()).append("\n");
            }
        }
        if (onClick != null) {
            jsBuilder.append("\nspan4.style.display = \"none\"; \n");

            jsBuilder.append(tagName).append(x).append(".addEventListener('click', function() { \n").append(onClick.toJavascript())
                    .append("\n });\n");
        }
        if (!forValueList.isEmpty()) {
            for (ForValue forValue : forValueList) {
                jsBuilder.append(tagName).append(x).append(".textContent = ").append(forValue.toJavascript()).append("\n");
            }
        }
        if (!htmlElList.isEmpty()) {
            // Update the parent element to the current element
            parentElement = tagName + x;
            for (HtmlEl htmlEl : htmlElList) {
                x++;
                jsBuilder.append(htmlEl.toJavascript(parentElement)).append("\n");
            }
        }
        if (!propsValueList.isEmpty()) {
            for (PropsValue propsValue : propsValueList) {
                jsBuilder.append(tagName).append(x).append(".textContent = ").append(propsValue.toJavascript()).append("\n");
            }
        }
        if (!varValueList.isEmpty()) {
            for (VarValue varValue : varValueList) {
                jsBuilder.append(tagName).append(x).append(varValue.toJavascript()).append("\n");
            }
        }
        if (!specialList.isEmpty()) {
            for (Special special : specialList) {
                jsBuilder.append(special.toJavascript()).append("\n");
            }
        }

    }
    return jsBuilder.toString();
}

    private String createElementCode(String tagName, String parentElement) {
        StringBuilder elementCode = new StringBuilder();
        elementCode.append("const ").append(tagName).append(x).append(" = document.createElement('").append(tagName).append("')\n");
        elementCode.append(parentElement).append(".appendChild(").append(tagName).append(x).append(")\n");
        return elementCode.toString();
    }

    public String toJavascript(String parentElement) {
        StringBuilder jsBuilder = new StringBuilder();
        String firstChar = tagName.substring(0, 1);
        boolean isCustomComponent = Character.isUpperCase(firstChar.charAt(0));

        if (isCustomComponent) {
            jsBuilder.append(tagName).append("({");
            if (!normalAttList.isEmpty()) {
                for (NormalAtt normalAtt : normalAttList) {
                    jsBuilder.append(normalAtt.getAttribute());
                }
            }
            if (!forAttList.isEmpty()) {
                for (ForAtt forAtt : forAttList) {
                    jsBuilder.append(forAtt.getAttribute());
                }
            }
            if (onClick != null) {
                jsBuilder.append(tagName).append(x).append(".addEventListener('click', function() { \n").append(onClick.toJavascript())
                        .append("\n });\n");
            }
            if (!htmlElList.isEmpty()) {
                for (HtmlEl htmlEl : htmlElList) {
                    jsBuilder.append(htmlEl.toJavascript()).append("\n");
                }
            }
            jsBuilder.append("})");
        } else {
            jsBuilder.append(createElementCode(tagName, parentElement));

            if (!forAttList.isEmpty()) {
                for (ForAtt forAtt : forAttList) {
                    jsBuilder.append(tagName).append(x).append(forAtt.toJavascript()).append("\n");
                }
            }
            if (!normalAttList.isEmpty()) {
                for (NormalAtt normalAtt : normalAttList) {
                    jsBuilder.append(tagName).append(x).append(normalAtt.toJavascript()).append("\n");
                }
            }
            if (!propsAttList.isEmpty()) {
                for (PropsAtt propsAtt : propsAttList) {
                    jsBuilder.append(tagName).append(x).append(propsAtt.toJavascript()).append("\n");
                }
            }
            if (!varAttList.isEmpty()) {
                for (VarAtt varAtt : varAttList) {
                    jsBuilder.append(tagName).append(x).append(varAtt.toJavascript()).append("\n");
                }
            }
            if (onClick != null) {
                jsBuilder.append("\nspan3.style.display = \"none\"; \n");
                jsBuilder.append(tagName).append(x).append(".addEventListener('click', function() { \n").append(onClick.toJavascript())
                        .append("\n });\n");
            }
            if (!forValueList.isEmpty()) {
                for (ForValue forValue : forValueList) {
                    jsBuilder.append(tagName).append(x).append(".textContent = ").append(forValue.toJavascript()).append("\n");
                }
            }
            if (!htmlElList.isEmpty()) {
                parentElement = tagName + x;
                for (HtmlEl htmlEl : htmlElList) {
                    x++;
                    jsBuilder.append(htmlEl.toJavascript(parentElement)).append("\n");
                }
            }
            if (!propsValueList.isEmpty()) {
                for (PropsValue propsValue : propsValueList) {
                    jsBuilder.append(tagName).append(x).append(".textContent = ").append(propsValue.toJavascript()).append("\n");
                }
            }
            if (!varValueList.isEmpty()) {
                for (VarValue varValue : varValueList) {
                    jsBuilder.append(tagName).append(x).append(varValue.toJavascript()).append("\n");
                }
            }
            if (!specialList.isEmpty()) {
                for (Special special : specialList) {
                    jsBuilder.append(special.toJavascript()).append("\n");
                }
            }
        }

        return jsBuilder.toString();
    }

}

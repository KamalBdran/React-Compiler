package AST;

import java.util.List;

public class Program {
    private List<DeclInt> declIntList = null;
    private List<DeclString> declStringList = null;
    private List<DeclBoolean> declBooleanList = null;
    private List<PureComponent> pureComponentList = null;
    private List<JSXComponent> jsxComponentList = null;

    public Program(List<DeclInt> declIntList, List<DeclString> declStringList,
            List<DeclBoolean> declBooleanList, List<PureComponent> pureComponentList,
            List<JSXComponent> jsxComponentList) {
        this.declIntList = declIntList;
        this.declStringList = declStringList;
        this.declBooleanList = declBooleanList;
        this.pureComponentList = pureComponentList;
        this.jsxComponentList = jsxComponentList;
    }

    public void setDeclStringList(List<DeclString> declStringList) {
        this.declStringList = declStringList;
    }

    public void setDeclIntList(List<DeclInt> declIntList) {
        this.declIntList = declIntList;
    }

    public void setDeclBooleanList(List<DeclBoolean> declBooleanList) {
        this.declBooleanList = declBooleanList;
    }

    public void setJsxComponentList(List<JSXComponent> jsxComponentList) {
        this.jsxComponentList = jsxComponentList;
    }

    public void setPureComponentList(List<PureComponent> pureComponentList) {
        this.pureComponentList = pureComponentList;
    }

    public List<DeclString> getDeclStringList() {
        return declStringList;
    }

    public List<DeclInt> getDeclIntList() {
        return declIntList;
    }

    public List<DeclBoolean> getDeclBooleanList() {
        return declBooleanList;
    }

    public List<JSXComponent> getJsxComponentList() {
        return jsxComponentList;
    }

    public List<PureComponent> getPureComponentList() {
        return pureComponentList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!declIntList.isEmpty()) {
            result.append(declIntList.toString()).append("\n");
        }
        if (!declStringList.isEmpty()) {
            result.append(declStringList.toString()).append("\n");
        }
        if (!declBooleanList.isEmpty()) {
            result.append(declBooleanList.toString()).append("\n");
        }
        if (!pureComponentList.isEmpty()) {
            result.append(pureComponentList.toString()).append("\n");
        }
        if (!jsxComponentList.isEmpty()) {
            result.append(jsxComponentList.toString()).append("\n");
        }
        return result.toString();
    }

    public String toJavascript() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("<html>\n" +
                "<head>\n" +
                "<title></title>\n" +
                "<style>\n" +
                "    body {\n" +
                "        display: flex;\n" +
                "        flex-direction: column;\n" +
                "        align-items: center;\n" +
                "        justify-content: center;\n" +
                "        height: 100vh;\n" +
                "        margin: 0;\n" +
                "    }\n" +
                "    .appbar {\n" +
                "        position: fixed;\n" +
                "        top: 0;\n" +
                "        left: 0;\n" +
                "        background-color: #70a7f9;\n" +
                "        color: white;\n" +
                "        display: flex;\n" +
                "        align-items: center;\n" +
                "        justify-content: center;\n" +
                "        padding: 30px;\n" +
                "        width: 100%;\n" +
                "        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);\n" +
                "    }\n" +
                "    .appbar h1 {\n" +
                "        margin: 0;\n" +
                "        font-size: 20px;\n" +
                "        color: #333;\n" +
                "    }\n" +
                "    .content {\n" +
                "        opacity: 0;\n" +
                "        animation: fade-in 0.5s forwards;\n" +
                "    }\n" +
                "        .greetingcontainer {\n" +
                "            display: flex;\n" +
                "            flex-direction: column;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "            gap: 15px;\n" +
                "        }\n" +
                "\n" +
                "        .greeting {\n" +
                "            background-color: #70a7f9;\n" +
                "            color: white;\n" +
                "            padding: 20px;\n" +
                "            margin: 10px;\n" +
                "            border-radius: 8px;\n" +
                "            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);\n" +
                "            text-align: center;\n" +
                "            font-size: 18px;\n" +
                "            font-weight: bold;\n" +
                "            transition: transform 0.3s ease;\n" +
                "        }\n" +
                "        .product {\n" +
                "            background-color: #fff;\n" +
                "            padding: 15px;\n" +
                "            margin: 10px;\n" +
                "            border-radius: 8px;\n" +
                "            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n" +
                "            width: 200px;\n" +
                "            transition: transform 0.3s;\n" +
                "        }\n" +
                "\n" +
                "        .product:hover {\n" +
                "            transform: translateY(-5px);\n" +
                "        }\n" +
                "\n" +
                "        .product img {\n" +
                "            max-width: 100%;\n" +
                "            border-radius: 4px;\n" +
                "        }\n" +
                "\n" +
                "        .product p {\n" +
                "            margin: 10px 0;\n" +
                "            font-size: 18px;\n" +
                "            font-weight: bold;\n" +
                "            cursor: pointer;\n" +
                "        }\n" +
                "\n" +
                "        .product span {\n" +
                "            display: none;\n" +
                "            color: #666;\n" +
                "            font-size: 14px;\n" +
                "        }" +
                "" +
                ".divcontainer {\n" +
                "        margin: 20px auto;\n" +
                "        padding: 20px;\n" +
                "        width: 300px;\n" +
                "        border: 2px solid #ccc;\n" +
                "        text-align: center;\n" +
                "        background-color: #f9f9f9;\n" +
                "        border-radius: 10px;\n" +
                "        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n" +
                "      }\n" +
                "\n" +
                "      /* Style for the paragraph that shows the count */\n" +
                "      .countdisplay {\n" +
                "        font-size: 2rem;\n" +
                "        font-weight: bold;\n" +
                "        color: #333;\n" +
                "        margin-bottom: 20px;\n" +
                "      }\n" +
                "\n" +
                "      /* Style for the span that is shown or hidden */\n" +
                "      .hiddenspan {\n" +
                "        display: none;\n" +
                "        color: red;\n" +
                "        font-style: italic;\n" +
                "        margin-bottom: 20px;\n" +
                "      }\n" +
                "\n" +
                "      /* Style for the buttons */\n" +
                "      .controlbutton {\n" +
                "        padding: 10px 20px;\n" +
                "        margin: 5px;\n" +
                "        background-color: #007bff;\n" +
                "        color: white;\n" +
                "        border: none;\n" +
                "        border-radius: 5px;\n" +
                "        cursor: pointer;\n" +
                "        transition: background-color 0.3s ease;\n" +
                "      }\n" +
                "\n" +
                "      .controlbutton:hover {\n" +
                "        background-color: #0056b3;\n" +
                "      }\n" +
                "\n" +
                "      /* Style for the 'minus' button */\n" +
                "      .controlbutton.minus {\n" +
                "        background-color: #dc3545;\n" +
                "      }\n" +
                "\n" +
                "      .controlbutton.minus:hover {\n" +
                "        background-color: #c82333;\n" +
                "      }\n" +
                "    @keyframes fade-in {\n" +
                "        from { opacity: 0; transform: translateY(20px); }\n" +
                "        to { opacity: 1; transform: translateY(0); }\n" +
                "    }\n" +

                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script>\n");

        if (!declIntList.isEmpty()) {
            for (DeclInt declInt : declIntList) {
                jsBuilder.append(declInt.toJavascript());
            }
        }
        if (!declStringList.isEmpty()) {
            for (DeclString declString : declStringList) {
                jsBuilder.append(declString.toJavascript());
            }
        }
        if (!declBooleanList.isEmpty()) {
            for (DeclBoolean declBoolean : declBooleanList) {
                jsBuilder.append(declBoolean.toJavascript());
            }
        }
        if (!pureComponentList.isEmpty()) {
            for (PureComponent pureComponent : pureComponentList) {
                jsBuilder.append(pureComponent.toJavascript());
            }
        }
        if (!jsxComponentList.isEmpty()) {
            for (JSXComponent jsxComponent : jsxComponentList) {
                jsBuilder.append(jsxComponent.toJavascript());
            }
        }

        jsBuilder.append(
                "App()\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");

        return jsBuilder.toString();
    }
}

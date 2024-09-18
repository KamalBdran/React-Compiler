package Visitor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import AST.ArrayLength;
import AST.ArrayState;
import AST.AttributeValue;
import AST.BoolState;
import AST.ComponentBody;
import AST.ComponentName;
import AST.DeclArray;
import AST.DeclBoolean;
import AST.DeclInt;
import AST.DeclString;
import AST.ForAtt;
import AST.ForLoop;
import AST.ForValue;
import AST.ForVar;
import AST.HtmlEl;
import AST.InsideFor;
import AST.InsideOnClick;
import AST.InsideUseEffect;
import AST.InsideUseRef;
import AST.JSXComponent;
import AST.NormalAtt;
import AST.NumObject;
import AST.NumberState;
import AST.ObjectX;
import AST.OnClick;
import AST.Program;
import AST.PropsAtt;
import AST.PropsValue;
import AST.PureComponent;
import AST.PureComponentBody;
import AST.ReturnStatement;
import AST.Special;
import AST.StringObject;
import AST.StringState;
import AST.Toggle;
import AST.UpdateVarIntValue;
import AST.UpdateVarStringValue;
import AST.UseEffect;
import AST.UseRef;
import AST.UseState;
import AST.VarAtt;
import AST.VarValue;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;
import antlr.ReactjsParser.ArrayLengthContext;
import antlr.ReactjsParser.ArrayStateContext;
import antlr.ReactjsParser.AttributeValueContext;
import antlr.ReactjsParser.BoolStateContext;
import antlr.ReactjsParser.ComponentBodyContext;
import antlr.ReactjsParser.ComponentNameContext;
import antlr.ReactjsParser.DeclArrayContext;
import antlr.ReactjsParser.DeclBooleanContext;
import antlr.ReactjsParser.DeclIntContext;
import antlr.ReactjsParser.DeclStringContext;
import antlr.ReactjsParser.ForAttContext;
import antlr.ReactjsParser.ForLoopContext;
import antlr.ReactjsParser.ForValueContext;
import antlr.ReactjsParser.ForVarContext;
import antlr.ReactjsParser.HtmlELContext;
import antlr.ReactjsParser.InsideForContext;
import antlr.ReactjsParser.InsideOnClickContext;
import antlr.ReactjsParser.InsideUseEffectContext;
import antlr.ReactjsParser.InsideUseRefContext;
import antlr.ReactjsParser.JsxComponentContext;
import antlr.ReactjsParser.NormalAttContext;
import antlr.ReactjsParser.NumObjectContext;
import antlr.ReactjsParser.NumberStateContext;
import antlr.ReactjsParser.ObjectContext;
import antlr.ReactjsParser.OnClickContext;
import antlr.ReactjsParser.ProgramContext;
import antlr.ReactjsParser.PropsAttContext;
import antlr.ReactjsParser.PropsValueContext;
import antlr.ReactjsParser.PureComponentBodyContext;
import antlr.ReactjsParser.PureComponentContext;
import antlr.ReactjsParser.ReturnStatementContext;
import antlr.ReactjsParser.SpecialContext;
import antlr.ReactjsParser.StringObjectContext;
import antlr.ReactjsParser.StringStateContext;
import antlr.ReactjsParser.ToggleContext;
import antlr.ReactjsParser.UpdateVarIntValueContext;
import antlr.ReactjsParser.UpdateVarStringValueContext;
import antlr.ReactjsParser.UseEffectContext;
import antlr.ReactjsParser.UseRefContext;
import antlr.ReactjsParser.UseStateContext;
import antlr.ReactjsParser.VarAttContext;
import antlr.ReactjsParser.VarValueContext;
import antlr.ReactjsParserBaseVisitor;

public class BaseVisitor extends ReactjsParserBaseVisitor<Object> {

    @Override
    public ArrayLength visitArrayLength(ArrayLengthContext ctx) {
        if (ctx == null) {
            return null;
        }

        String arrayName = ctx.ID().getText();
        int lineNumber = ctx.ID().getSymbol().getLine();

        SymbolTable symbolTable = SymbolTable.getInstance();
        ArrayLength arrayLength = new ArrayLength(arrayName);
        if (!symbolTable.isVarExist(arrayName)) {
            System.out.println(arrayName);
            symbolTable.print();
            String error = "Semantic Error array " + arrayName + " doesn't exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {
            Symbol symbol1 = new Symbol("arrayLength", arrayLength);
            symbolTable.put(arrayName + "length(arrayLength)", symbol1);
        }
        return arrayLength;
    }

    @Override
    public ArrayState visitArrayState(ArrayStateContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<ObjectX> object = ctx.object().stream().map(this::visitObject).collect(Collectors.toList());
        ArrayState arrayState = new ArrayState(object);

        return arrayState;
    }

    @Override
    public AttributeValue visitAttributeValue(AttributeValueContext ctx) {
        if (ctx == null) {
            return null;
        }

        String valueOfTheAttribute = ctx.ID().getText();
        AttributeValue attributeValue = new AttributeValue(valueOfTheAttribute);

        return attributeValue;
    }

    @Override
    public BoolState visitBoolState(BoolStateContext ctx) {
        if (ctx == null) {
            return null;
        }

        boolean value = Boolean.parseBoolean(ctx.BOOLEAN().getText());
        BoolState boolState = new BoolState(value);

        return boolState;
    }

    @Override
    public ComponentBody visitComponentBody(ComponentBodyContext ctx) {
        if (ctx == null) {
            return null;
        }
        List<UseState> useStateList = ctx.useState().stream().map(this::visitUseState).collect(Collectors.toList());
        List<DeclArray> declArrayList = ctx.declArray().stream().map(this::visitDeclArray).collect(Collectors.toList());
        List<DeclString> declStringList = ctx.declString().stream().map(this::visitDeclString)
                .collect(Collectors.toList());
        List<DeclInt> declIntList = ctx.declInt().stream().map(this::visitDeclInt).collect(Collectors.toList());
        List<DeclBoolean> declBooleanList = ctx.declBoolean().stream().map(this::visitDeclBoolean)
                .collect(Collectors.toList());
        List<UpdateVarStringValue> updateVarStringValueList = ctx.updateVarStringValue().stream()
                .map(this::visitUpdateVarStringValue).collect(Collectors.toList());
        List<UpdateVarIntValue> updateVarIntValueList = ctx.updateVarIntValue().stream()
                .map(this::visitUpdateVarIntValue).collect(Collectors.toList());
       
        List<UseEffect> useEffectList = ctx.useEffect().stream().map(this::visitUseEffect).collect(Collectors.toList());
        List<UseRef> useRefList = ctx.useRef().stream().map(this::visitUseRef).collect(Collectors.toList());
        List<ForLoop> forLoopList = ctx.forLoop().stream().map(this::visitForLoop).collect(Collectors.toList());
        ReturnStatement returnStatement = visitReturnStatement(ctx.returnStatement());

        ComponentBody componentBody = new ComponentBody(
                declArrayList,
                declStringList,
                declIntList,
                declBooleanList,
                updateVarStringValueList,
                updateVarIntValueList,
                useStateList,
                useEffectList,
                useRefList,
                forLoopList,
                returnStatement);

        return componentBody;
    }

    int componentNameCounter = 1;

    @Override
    public ComponentName visitComponentName(ComponentNameContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.WORD_WITH_CAPITAL().getText();
        int lineNumber = ctx.WORD_WITH_CAPITAL().getSymbol().getLine();

        SymbolTable symbolTable = SymbolTable.getInstance();

        if (symbolTable.containsDuplicateComponentName(name)) {
            String error = "Semantic Error: Duplicate class name '" + name + "'";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {

            symbolTable.putComponentName(name, lineNumber);
            Symbol symbol1 = new Symbol("componentName" + componentNameCounter, name);
            symbolTable.put("componentName" + componentNameCounter, symbol1);

            componentNameCounter++;
        }

        ComponentName componentName = new ComponentName(name);
        return componentName;
    }

    @Override
    public DeclArray visitDeclArray(DeclArrayContext ctx) {
        if (ctx == null) {
            return null;
        }

        String type = null;
        String varType = null;
        String constType = null;

        if (ctx.VAR() != null) {
            varType = ctx.VAR().getText();
        }

        if (ctx.CONST() != null) {
            constType = ctx.CONST().getText();
        }

        String name = ctx.ID().getText();
        if (varType != null) {
            type = varType;
        } else {
            type = constType;
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID().getSymbol().getLine();

        if (symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " array already exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {
            Symbol symbol1 = new Symbol(type, null);
            symbolTable.put(name, symbol1);
        }

        DeclArray declArray = new DeclArray(type, name);
        return declArray;
    }

    @Override
    public DeclBoolean visitDeclBoolean(DeclBooleanContext ctx) {
        if (ctx == null) {
            return null;
        }

        String type = null;
        String varType = ctx.VAR().getText();
        String constType = ctx.CONST().getText();
        String name = ctx.ID().getText();
        Boolean value = Boolean.valueOf(ctx.BOOLEAN().getText());

        if (varType != null) {
            type = varType;
        } else {
            type = constType;
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID().getSymbol().getLine();

        if (symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " variable already exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {

            Symbol symbol1 = new Symbol(type, value);
            symbolTable.put(name, symbol1);

        }

        DeclBoolean declBoolean = new DeclBoolean(type, name, value);
        return declBoolean;

    }

    @Override
    public DeclInt visitDeclInt(DeclIntContext ctx) {
        if (ctx == null) {
            return null;
        }

        String type = null;
        String varType = null;
        String constType = null;
        int value = 0;

        if (ctx.VAR() != null) {
            varType = ctx.VAR().getText();
        }
        if (ctx.CONST() != null) {
            constType = ctx.CONST().getText();
        }
        String name = ctx.ID().getText();
        if (ctx.NUMBER() != null) {
            value = Integer.parseInt(ctx.NUMBER().getText());
        }
        ArrayLength arrayLength = visitArrayLength(ctx.arrayLength());

        if (varType != null) {
            type = varType;
        } else {
            type = constType;
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID().getSymbol().getLine();

        if (symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " variable already exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {
            if (arrayLength != null) {
                Symbol symbol1 = new Symbol(type, arrayLength);
                symbolTable.put(name, symbol1);
                DeclInt declInt1 = new DeclInt(type, name, arrayLength);
                return declInt1;
            } else {
                Symbol symbol2 = new Symbol(type, value);
                symbolTable.put(name, symbol2);
                DeclInt declInt2 = new DeclInt(type, name, value);
                return declInt2;
            }
        }
        return null;

    }

    @Override
    public DeclString visitDeclString(DeclStringContext ctx) {
        if (ctx == null) {
            return null;
        }

        String type = null;
        String varType = null;
        String constType = null;

        if (ctx.VAR() != null) {
            varType = ctx.VAR().getText();
        }
        if (ctx.CONST() != null) {
            constType = ctx.CONST().getText();
        }

        String name = ctx.ID(0).getText();
        String value = ctx.ID(1).getText();

        if (varType != null) {
            type = varType;
        } else {
            type = constType;
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID(0).getSymbol().getLine();

        if (symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " variable already exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {
            Symbol symbol1 = new Symbol(type, value);
            symbolTable.put(name, symbol1);
        }

        DeclString declString = new DeclString(type, name, value);
        return declString;
    }

    int forAttCounter = 1;

    @Override
    public ForAtt visitForAtt(ForAttContext ctx) {
        if (ctx == null) {
            return null;
        }

        String attName = ctx.ID().getText();
        ForValue forValue = visitForValue(ctx.forValue());

        ForAtt forAtt = new ForAtt(attName, forValue);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol1 = new Symbol("forAttribute" + forAttCounter, forAtt);
        symbolTable.put(attName + "(forAttribute" + forAttCounter + ")", symbol1);

        forAttCounter++;
        return forAtt;
    }

    @Override
    public ForLoop visitForLoop(ForLoopContext ctx) {
        if (ctx == null) {
            return null;
        }

        String var = ctx.ID(0).getText();
        int varValue = Integer.parseInt(ctx.NUMBER().getText());
        String compareValue = ctx.ID(2).getText();
        InsideFor insideFor = visitInsideFor(ctx.insideFor());

        // Add ForLoop to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        if (!symbolTable.containsSymbol(compareValue)) {
            String errorMessage = "Variable '" + compareValue + "' is not declared.";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            int lineNumber = ctx.ID(2).getSymbol().getLine();

            // Add the error message to the SemanticErrorhandling class
            symbolTable.semanticError(errorMessage, lineNumber);
        } else {
            Symbol loopVar = new Symbol("loopVar", varValue);
            symbolTable.put(var, loopVar);
        }
        ForLoop forLoop = new ForLoop(var, varValue, compareValue, insideFor);
        return forLoop;

    }

    @Override
    public ForValue visitForValue(ForValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        ForVar forVar = visitForVar(ctx.forVar());

        ForValue forValue = new ForValue(forVar);
        return forValue;
    }

    @Override
    public ForVar visitForVar(ForVarContext ctx) {
        if (ctx == null) {
            return null;
        }

        String var = ctx.ID(0).getText();
        String counter = ctx.ID(1).getText();
        String var2 = ctx.ID(2).getText();

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID(0).getSymbol().getLine();

        if (!symbolTable.isVarExist(var)) {
            String error = "Sementic Error " + var + " variable doesn't exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        }

        ForVar forVar = new ForVar(var, counter, var2);
        return forVar;
    }

    @Override
    public HtmlEl visitHtmlEL(HtmlELContext ctx) {
        if (ctx == null) {
            return null;
        }

        String tagName = null;
        String id = null;
        String capitalId = null;
        List<ForAtt> forAttList = null;
        List<NormalAtt> normalAttList = null;
        List<PropsAtt> propsAttList = null;
        List<VarAtt> varAttList = null;
        OnClick onClick = null;
        List<HtmlEl> htmlElList = null;
        List<String> text = null;
        List<PropsValue> propsValueList = null;
        List<VarValue> varValueList = null;
        List<ForValue> forValueList = null;
        List<Special> specialList = null;

        if (ctx.ID(0) != null) {
            id = ctx.ID(0).getText();
        }

        if (ctx.WORD_WITH_CAPITAL(0) != null) {
            capitalId = ctx.WORD_WITH_CAPITAL(0).getText();
        }

        if (id != null) {
            tagName = id;
        } else {
            tagName = capitalId;
        }

        if (ctx.forAtt() != null) {
            forAttList = ctx.forAtt().stream().map(this::visitForAtt).collect(Collectors.toList());
        }
        if (ctx.normalAtt() != null) {
            normalAttList = ctx.normalAtt().stream().map(this::visitNormalAtt).collect(Collectors.toList());
        }
        if (ctx.propsAtt() != null) {
            propsAttList = ctx.propsAtt().stream().map(this::visitPropsAtt).collect(Collectors.toList());
        }
        if (ctx.varAtt() != null) {
            varAttList = ctx.varAtt().stream().map(this::visitVarAtt).collect(Collectors.toList());
        }
        if (ctx.onClick() != null) {
            onClick = visitOnClick(ctx.onClick());
        }
        if (ctx.htmlEL() != null) {
            htmlElList = ctx.htmlEL().stream().map(this::visitHtmlEL).collect(Collectors.toList());
        }
        if (ctx.ID(1) != null) {
            text = Collections.singletonList(ctx.ID(0).getText());
        }
        if (ctx.propsValue() != null) {
            propsValueList = ctx.propsValue().stream().map(this::visitPropsValue).collect(Collectors.toList());
        }
        if (ctx.varValue() != null) {
            varValueList = ctx.varValue().stream().map(this::visitVarValue).collect(Collectors.toList());
        }
        if (ctx.forValue() != null) {
            forValueList = ctx.forValue().stream().map(this::visitForValue).collect(Collectors.toList());
        }
        if (ctx.special() != null) {
            specialList = ctx.special().stream().map(this::visitSpecial).collect(Collectors.toList());
        }

        HtmlEl htmlEl = new HtmlEl(tagName, htmlElList, text, propsValueList, varValueList, forValueList,
                specialList, onClick, forAttList, normalAttList, propsAttList, varAttList);

        return htmlEl;

    }

    @Override
    public InsideFor visitInsideFor(InsideForContext ctx) {
        if (ctx == null) {
            return null;
        }

        String pushTo = ctx.ID().getText();
        HtmlEl htmlEl = (HtmlEl) visitHtmlEL(ctx.htmlEL());

        // Add InsideFor to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        if (!symbolTable.isVarExist(pushTo)) {
            String errorMessage = "Variable '" + pushTo + "' is not declared.";
            symbolTable.semanticError(errorMessage, ctx.getStart().getLine());
            int lineNumber = ctx.ID().getSymbol().getLine();

            // Add the error message to the SemanticErrorhandling class
            symbolTable.semanticError(errorMessage, lineNumber);
        }
        InsideFor insideFor = new InsideFor(pushTo, htmlEl);
        return insideFor;
    }

    @Override
    public InsideOnClick visitInsideOnClick(InsideOnClickContext ctx) {
        if (ctx == null) {
            return null;
        }
        List<UpdateVarStringValue> updateVarStringValues = ctx.updateVarStringValue().stream()
                .map(this::visitUpdateVarStringValue).collect(Collectors.toList());
        List<Toggle> toggles = ctx.toggle().stream().map(this::visitToggle).collect(Collectors.toList());
        String varName = null;
        String minus = null;
        String plus = null;
        String num = null;
        if(ctx.ID(0) != null){
             varName = ctx.ID(0).getText();
        }
        if(ctx.MINUS() != null){
             minus = ctx.MINUS().getText();
        }
        if(ctx.PLUS() != null){
            plus = ctx.PLUS().getText();
        }
        if(ctx.NUMBER() != null){
             num = ctx.NUMBER().getText();
        }


        String operation = null;
        if(plus != null){
            operation = String.valueOf('+');
        }
        if(minus != null){
            operation = String.valueOf('-');
        }


        InsideOnClick insideOnClick = new InsideOnClick(updateVarStringValues, toggles, varName, operation, num);

        return insideOnClick;
    }

    @Override
    public InsideUseEffect visitInsideUseEffect(InsideUseEffectContext ctx) {
        if (ctx == null) {
            return null;
        }

        String value = ctx.ID().getText();

        // Add InsideUseEffect to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        Symbol insideUseEffect = new Symbol("insideUseEffect", value);
        symbolTable.put("insideUseEffect", insideUseEffect);

        return new InsideUseEffect(value);
    }

    @Override
    public InsideUseRef visitInsideUseRef(InsideUseRefContext ctx) {
        if (ctx == null) {
            return null;
        }

        int number = Integer.parseInt(ctx.NUMBER().getText());
        String word = ctx.ID().getText();

        // Add InsideUseRef to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        if (word != null) {
            Symbol wordInsideUseRef = new Symbol("wordInsideUseRef", word);
            symbolTable.put("wordInsideUseRef", wordInsideUseRef);

            return new InsideUseRef(word);
        }

        Symbol numberInsideUseRef = new Symbol("numberInsideUseRef", number);
        symbolTable.put("numberInsideUseRef", numberInsideUseRef);

        InsideUseRef insideUseRef = new InsideUseRef(number);
        return insideUseRef;
    }

    @Override
    public JSXComponent visitJsxComponent(JsxComponentContext ctx) {
        if (ctx == null) {
            return null;
        }

        boolean haveProps;
        String props = null;
        ComponentName componentName = visitComponentName(ctx.componentName());
        ComponentBody componentBody = visitComponentBody(ctx.componentBody());

        if (ctx.PROPS() != null) {
            props = ctx.PROPS().getText();
        }
        if (props != null) {
            haveProps = true;
        } else {
            haveProps = false;
        }

        JSXComponent jsxComponent = new JSXComponent(componentName, componentBody, haveProps);

        return jsxComponent;
    }

    int normalAttCounter = 1;

    @Override
    public NormalAtt visitNormalAtt(NormalAttContext ctx) {
        if (ctx == null) {
            return null;
        }

        String attName = ctx.ID().getText();

        AttributeValue attributeValue = visitAttributeValue(ctx.attributeValue());

        NormalAtt normalAtt = new NormalAtt(attName, attributeValue);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol1 = new Symbol("normalAttribute" + normalAttCounter, normalAtt);
        symbolTable.put(attName + "(normalAttribute" + normalAttCounter + ")", symbol1);

        normalAttCounter++;
        return normalAtt;
    }

    int numObjectCounter = 1;

    @Override
    public NumObject visitNumObject(NumObjectContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.ID().getText();
        int value = Integer.parseInt(ctx.NUMBER().getText());

        // Add StringObject to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        Symbol symbol1 = new Symbol("numberObject" + numObjectCounter, value);
        symbolTable.put(name + "(numberObject " + numObjectCounter + ")", symbol1);

        numObjectCounter++;
        NumObject numObject = new NumObject(name, value);
        return numObject;
    }

    @Override
    public NumberState visitNumberState(NumberStateContext ctx) {
        if (ctx == null) {
            return null;
        }

        int value = Integer.parseInt(ctx.NUMBER().getText());
        NumberState numberState = new NumberState(value);
        return numberState;
    }

    @Override
    public ObjectX visitObject(ObjectContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<StringObject> stringObject = ctx.stringObject().stream().map(this::visitStringObject)
                .collect(Collectors.toList());
        List<NumObject> numObject = ctx.numObject().stream().map(this::visitNumObject).collect(Collectors.toList());

        ObjectX objectx = new ObjectX(numObject, stringObject);

        return objectx;
    }

    @Override
    public OnClick visitOnClick(OnClickContext ctx) {
        if (ctx == null) {
            return null;
        }

        InsideOnClick insideOnClick = visitInsideOnClick(ctx.insideOnClick());

        SymbolTable symbolTable = SymbolTable.getInstance();

        OnClick onClick = new OnClick(insideOnClick);

        return onClick;
    }

    @Override
    public Program visitProgram(ProgramContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<DeclInt> declInts = ctx.declInt().stream().map(this::visitDeclInt).collect(Collectors.toList());
        List<DeclString> declStrings = ctx.declString().stream().map(this::visitDeclString)
                .collect(Collectors.toList());
        List<DeclBoolean> declBooleans = ctx.declBoolean().stream().map(this::visitDeclBoolean)
                .collect(Collectors.toList());
        List<PureComponent> pureComponents = ctx.pureComponent().stream().map(this::visitPureComponent)
                .collect(Collectors.toList());
        List<JSXComponent> jsxComponents = ctx.jsxComponent().stream().map(this::visitJsxComponent)
                .collect(Collectors.toList());

        Program program = new Program(declInts, declStrings, declBooleans, pureComponents, jsxComponents);

        return program;
    }

    int propsAttCounter = 1;

    @Override
    public PropsAtt visitPropsAtt(PropsAttContext ctx) {
        if (ctx == null) {
            return null;
        }

        String attName = ctx.ID().getText();

        PropsValue propsValue = visitPropsValue(ctx.propsValue());

        PropsAtt propsAtt = new PropsAtt(attName, propsValue);

        SymbolTable symbolTable = SymbolTable.getInstance();
        Symbol symbol1 = new Symbol("propsAttribute" + propsAttCounter, propsAtt);
        symbolTable.put(attName + "(propsAttribute" + propsAttCounter + ")", symbol1);

        propsAttCounter++;
        return propsAtt;
    }

    @Override
    public PropsValue visitPropsValue(PropsValueContext ctx) {
        if (ctx == null) {
            return null;
        }

        String propName = ctx.ID().getText();
        PropsValue propsValue = new PropsValue(propName);

        return propsValue;
    }

    @Override
    public PureComponent visitPureComponent(PureComponentContext ctx) {
        if (ctx == null) {
            return null;
        }
        ComponentName componentName = visitComponentName(ctx.componentName());
        PureComponentBody pureComponentBody = visitPureComponentBody(ctx.pureComponentBody());

        PureComponent pureComponent = new PureComponent(componentName, pureComponentBody);

        return pureComponent;
    }

    @Override
    public PureComponentBody visitPureComponentBody(PureComponentBodyContext ctx) {
        if (ctx == null) {
            return null;
        }

        ComponentBody componentBody = visitComponentBody(ctx.componentBody());

        PureComponentBody pureComponentBody = new PureComponentBody(componentBody);
        return pureComponentBody;
    }

    @Override
    public ReturnStatement visitReturnStatement(ReturnStatementContext ctx) {
        if (ctx == null) {
            return null;
        }

        HtmlEl toReturn = visitHtmlEL(ctx.htmlEL());

        ReturnStatement returnStatement = new ReturnStatement(toReturn);
        return returnStatement;
    }

    @Override
    public Special visitSpecial(SpecialContext ctx) {
        if (ctx == null) {
            return null;
        }

        String firstVar = ctx.ID(0).getText();
        String secondVar = ctx.ID(1).getText();
        HtmlEl htmlEl = (HtmlEl) visitHtmlEL(ctx.htmlEL());

        // Add Special to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        if (!symbolTable.isVarExist(firstVar)) {
            String errorMessage1 = "Variable '" + firstVar + "' is not declared.";
            symbolTable.semanticError(errorMessage1, ctx.getStart().getLine());
            int lineNumber1 = ctx.ID(0).getSymbol().getLine();

            // Add the error message to the SemanticErrorhandling class
            symbolTable.semanticError(errorMessage1, lineNumber1);
        } else if (!symbolTable.isVarExist(secondVar)) {
            String errorMessage2 = "Variable '" + secondVar + "' is not declared.";
            symbolTable.semanticError(errorMessage2, ctx.getStart().getLine());
            int lineNumber2 = ctx.ID(1).getSymbol().getLine();

            // Add the error message to the SemanticErrorhandling class
            symbolTable.semanticError(errorMessage2, lineNumber2);
        }
        Special special = new Special(firstVar, secondVar, htmlEl);
        return special;
    }

    int stringObjectCounter = 1;

    @Override
    public StringObject visitStringObject(StringObjectContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.ID(0).getText();
        String value = ctx.ID(1).getText();

        // Add StringObject to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        Symbol symbol1 = new Symbol("stringObject" + stringObjectCounter, value);
        symbolTable.put(name + "(stringObject " + stringObjectCounter + ")", symbol1);

        stringObjectCounter++;
        StringObject stringObject = new StringObject(name, value);
        return stringObject;
    }

    @Override
    public StringState visitStringState(StringStateContext ctx) {
        if (ctx == null) {
            return null;
        }

        String value = ctx.ID().getText();
        StringState stringState = new StringState(value);
        return stringState;
    }

    @Override
    public Toggle visitToggle(ToggleContext ctx) {
        if (ctx == null) {
            return null;
        }

        String varToToggle = ctx.ID(0).getText();
        String var = ctx.ID(1).getText();

        int lineNumber = ctx.ID(0).getSymbol().getLine();
        SymbolTable symbolTable = SymbolTable.getInstance();
        String sub = varToToggle.substring(3);
        if (!symbolTable.isVarExist(sub)) {
            String error = "Sementic Error " + varToToggle + " variable doesn't exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        }

        if (!symbolTable.isVarExist(var)) {
            String error = "Sementic Error " + var + " variable doesn't exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        }
        Toggle toggle = new Toggle(varToToggle, var);
        return toggle;
    }

    @Override
    public UpdateVarIntValue visitUpdateVarIntValue(UpdateVarIntValueContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.ID().getText();
        int newIntValue = Integer.parseInt(ctx.NUMBER().getText());
        ForVar forVar = visitForVar(ctx.forVar());

        SymbolTable symbolTable = SymbolTable.getInstance();

        int lineNumber = ctx.ID().getSymbol().getLine();

        if (!symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " variable already exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;

        } else {

            if (symbolTable.varType(name) == "const") {
                String error = "Sementic Error " + name + " variable is const";
                symbolTable.semanticError(error, lineNumber);
                symbolTable.hasSemanticError = true;
            } else {
                if (forVar != null) {

                    Symbol symbol = symbolTable.get(name);
                    symbol.setValue(forVar);

                    UpdateVarIntValue updateVarIntValue1 = new UpdateVarIntValue(name, forVar);
                    return updateVarIntValue1;
                } else {
                    Symbol symbol = symbolTable.get(name);
                    symbol.setValue(newIntValue);

                    UpdateVarIntValue updateVarIntValue2 = new UpdateVarIntValue(name, newIntValue);
                    return updateVarIntValue2;
                }
            }

        }
        return null;

    }

    @Override
    public UpdateVarStringValue visitUpdateVarStringValue(UpdateVarStringValueContext ctx) {
        if (ctx == null) {
            return null;
        }

        String newStringValue = null;
        ForVar forVar = null;
        String name = ctx.ID(0).getText();

        if (ctx.ID(1) != null) {
            newStringValue = ctx.ID(1).getText();
        }

        if (ctx.forVar() != null) {
            forVar = visitForVar(ctx.forVar());
        }

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID(0).getSymbol().getLine();
        if (!symbolTable.isVarExist(name)) {
            String error = "Sementic Error " + name + " variable already exist ";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;

        } else {
            if (symbolTable.varType(name).startsWith("c")) {

                String error = "Sementic Error " + name + " variable is const ";
                symbolTable.semanticError(error, lineNumber);
                symbolTable.hasSemanticError = true;
            } else {
                if (forVar != null) {
                    Symbol symbol = symbolTable.get(name);
                    symbol.setValue(forVar);

                    UpdateVarStringValue updateVarStringValue1 = new UpdateVarStringValue(name, forVar);
                    return updateVarStringValue1;
                } else {
                    Symbol symbol = symbolTable.get(name);
                    symbol.setValue(newStringValue);

                    UpdateVarStringValue updateVarStringValue2 = new UpdateVarStringValue(name, newStringValue);
                    return updateVarStringValue2;
                }
            }

        }
        return null;

    }

    @Override
    public UseEffect visitUseEffect(UseEffectContext ctx) {
        if (ctx == null) {
            return null;
        }

        InsideUseEffect insideUseEffect = visitInsideUseEffect(ctx.insideUseEffect());

        // Add UseEffect to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        Symbol symbol1 = new Symbol("useEffect", insideUseEffect);
        symbolTable.put("useEffect", symbol1);

        UseEffect useEffect = new UseEffect(insideUseEffect);
        return useEffect;
    }

    @Override
    public UseRef visitUseRef(UseRefContext ctx) {
        if (ctx == null) {
            return null;
        }

        String name = ctx.ID().getText();
        InsideUseRef insideUseRef = visitInsideUseRef(ctx.insideUseRef());

        // Add UseRef to the symbol table
        SymbolTable symbolTable = SymbolTable.getInstance();

        Symbol useRefVar = new Symbol("useRefVar", insideUseRef);
        symbolTable.put(name, useRefVar);

        UseRef useRef = new UseRef(name, insideUseRef);
        return useRef;
    }

    @Override
    public UseState visitUseState(UseStateContext ctx) {
        if (ctx == null) {
            return null;
        }

        String var = ctx.ID(0).getText();
        String setVar = ctx.ID(1).getText();

        BoolState booleanState = visitBoolState(ctx.boolState());
        NumberState numberState = visitNumberState(ctx.numberState());
        StringState stringState = visitStringState(ctx.stringState());
        ArrayState arrayState = visitArrayState(ctx.arrayState());

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID(0).getSymbol().getLine();

        if (symbolTable.isVarExist(var)) {
            String error = "Sementic Error " + var + " variable already exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {

            if (booleanState != null) {
                Symbol symbol1 = new Symbol("useStateBooleanState", booleanState);
                symbolTable.put(var, symbol1);

                UseState useState1 = new UseState(var, setVar, booleanState);
                return useState1;
            }

            if (numberState != null) {
                Symbol symbol2 = new Symbol("useStateNumberState", numberState);
                symbolTable.put(var, symbol2);

                UseState useState2 = new UseState(var, setVar, numberState);
                return useState2;
            }

            if (stringState != null) {
                Symbol symbol3 = new Symbol("useStateStringState", stringState);
                symbolTable.put(var, symbol3);

                UseState useState3 = new UseState(var, setVar, stringState);
                return useState3;
            }

            if (arrayState != null) {
                Symbol symbol4 = new Symbol("useStateArrayState", "ARRAY STATE INSIDE useState");
                symbolTable.put(var, symbol4);

                UseState useState4 = new UseState(var, setVar, arrayState);
                return useState4;
            }
        }
        return null;
    }

    int varAttCounter = 1;

    @Override
    public VarAtt visitVarAtt(VarAttContext ctx) {
        if (ctx == null) {
            return null;
        }

        String attName = ctx.ID(0).getText();
        String attValue = ctx.ID(1).getText();

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID(0).getSymbol().getLine();

        if (!symbolTable.isVarExist(attValue)) {
            String error = "Sementic Error " + attValue + " variable doesn't exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        } else {
            Symbol symbol1 = new Symbol("varAttribute" + varAttCounter, attValue);
            symbolTable.put(attName + "(varAttribute" + varAttCounter + ")", symbol1);

            varAttCounter++;
        }
        VarAtt varAtt = new VarAtt(attName, attValue);
        return varAtt;

    }

    @Override
    public VarValue visitVarValue(VarValueContext ctx) {
        if (ctx == null) {
            return null;
        }
        String varName = ctx.ID().getText();

        SymbolTable symbolTable = SymbolTable.getInstance();
        int lineNumber = ctx.ID().getSymbol().getLine();

        if (!symbolTable.isVarExist(varName)) {
            String error = "Sementic Error " + varName + " variable doesn't exist";
            symbolTable.semanticError(error, lineNumber);
            symbolTable.hasSemanticError = true;
        }

        VarValue varValue = new VarValue(varName);

        return varValue;
    }

}

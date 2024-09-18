package SymbolTable;

import java.util.*;

public class SymbolTable {
    private final Stack<HashMap<String, Symbol>> scopes;
    private static SymbolTable instance;
    private List<Rows> rows;
    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;
    public static boolean REPORT_SYNTAX_ERRORS = true;
    private Set<String> componentNames = new HashSet<>();
    public ArrayList<String> errors = new ArrayList<String>();

    private SymbolTable() {
        scopes = new Stack<>();
        scopes.push(new HashMap<>());
        rows = new ArrayList<>();
    }

    public HashMap<String, Symbol> getSymbols() {
        HashMap<String, Symbol> symbols = new HashMap<>();
        for (HashMap<String, Symbol> scope : scopes) {
            symbols.putAll(scope);
        }
        return symbols;
    }

    public void enterScope() {
        scopes.push(new HashMap<>());
    }

    public void exitScope() {
        scopes.pop();
    }

    public void put(String name, Symbol sym) {
        scopes.peek().put(name, sym);
    }

    public Symbol get(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Symbol sym = scopes.get(i).get(name);
            if (sym != null) {
                return sym;
            }
        }
        return null;
    }

    public boolean contains(String name) {
        return get(name) != null;
    }

    public boolean containsKey(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public static SymbolTable getInstance() {
        if (instance == null) {
            instance = new SymbolTable();
        }
        return instance;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }

    public void print() {
        System.out.println("Symbol Table:");
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        System.out.printf("| %-40s | %-40s |\n", "Key", "Value");
        System.out.println(
                "-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < scopes.size(); i++) {
            HashMap<String, Symbol> scope = scopes.get(i);
            if (scope != null) {
                System.out.println("Scope " + i + ":");

                for (String key : scope.keySet()) {
                    Symbol symbol = scope.get(key);
                    System.out.printf("| %-40s | %-40s |\n", key,
                            symbol.getValue() + "\t\t\t(" + symbol.getType() + ")");
                }
                System.out.println("-------------------------------------------");
            }
        }
    }

    public boolean containsDuplicateComponentName(String componentName) {
        return componentNames.contains(componentName);
    }

    public boolean containsSymbol(String name) {
        for (HashMap<String, Symbol> scope : scopes) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    public void putComponentName(String componentName, int lineNumber) {
        if (containsDuplicateComponentName(componentName)) {
            String error = "Semantic Error: Duplicate class name '" + componentName + "'";
            errors.add("Semantic Error: Duplicate class name '" + componentName + "' at line: " + lineNumber);
            semanticError(error, lineNumber);
        } else {
            componentNames.add(componentName);
        }
    }

    public void semanticError(String errorMessage, int lineNumber) {
        // System.err.println("Semantic Error at line " + lineNumber + ": " +
        // errorMessage);
        String err = errorMessage + "at line: " + lineNumber;
        errors.add(err);

        hasSemanticError = true;
        // write(errorMessage,
        // "C:\\Users\\\\Desktop\\\\src\\Errorhandling\\SemanticError.txt");
    }

    public boolean isVarExist(String varName) {
        for (int i = 0; i < scopes.size(); i++) {
            HashMap<String, Symbol> scope = scopes.get(i);

            if (scope != null) {
                for (String key : scope.keySet()) {
                    
                    if (key.contains(varName)) {
                        
                        return true;
                    }

                }

            }
        }
        return false;
    }

    public String varType(String varName) {
        for (int i = 0; i < scopes.size(); i++) {
            HashMap<String, Symbol> scope = scopes.get(i);
            if (scope != null) {
                for (String key : scope.keySet()) {
                    if (key.contains(varName)) {
                        Symbol symbol = scope.get(key);
                        return symbol.getType();
                    }
                }
            }
        }
        return null;
    }

}

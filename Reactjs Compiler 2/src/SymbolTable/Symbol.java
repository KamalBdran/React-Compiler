package SymbolTable;

public class Symbol {
    private String type;
    private Object value;

    public Symbol(String type, Object value){
        this.type = type;
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }
}

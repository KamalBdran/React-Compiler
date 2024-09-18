package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolList {
    private List<Rows> rows = new ArrayList<>();

    public List<Rows> getRows(){
        return  rows;
    }

    public void setRows(List<Rows> rows){
        this.rows = rows;
    }

    public void print(){
        for(Rows row : rows){
            System.out.println(row.getType() + " : " + row.getValue());
        }
    }
}

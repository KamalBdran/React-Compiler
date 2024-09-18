package AST;

public class UseEffect {
    private InsideUseEffect insideUseEffect;
    public UseEffect(InsideUseEffect insideUseEffect){
        this.insideUseEffect = insideUseEffect;
    }
    public void setInsideUseEffect(InsideUseEffect insideUseEffect) {
        this.insideUseEffect = insideUseEffect;
    }
    public InsideUseEffect getInsideUseEffect() {
        return insideUseEffect;
    }
    @Override
    public String toString(){
        return "useEffect(() => { \n" + insideUseEffect + "\n })";
    }
}

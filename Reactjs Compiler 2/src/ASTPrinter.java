import antlr.ReactjsParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
public class ASTPrinter extends ReactjsParserBaseListener {
    private int indentLevel = 0;
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        print_ast(ctx);
        indentLevel++;
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        indentLevel--;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        print_ast(node);
    }

    private void print_ast(Object node) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indentLevel; i++) {
            sb.append("|  ");
        }

        sb.append("|--");

        if (node instanceof ParserRuleContext) {
            ParserRuleContext ctx = (ParserRuleContext) node;
            sb.append(ctx.getClass().getSimpleName());
            sb.append(" ");
        } else if (node instanceof TerminalNode) {
            TerminalNode terminalNode = (TerminalNode) node;
            sb.append(terminalNode.getSymbol().getText());
        }

        System.out.println(sb.toString());
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import AST.Program;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import antlr.ReactjsLexer;
import antlr.ReactjsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "test/test.txt";
        CharStream charStream = fromFileName(source);
        ReactjsLexer reactjsLexer = new ReactjsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(reactjsLexer);
        ReactjsParser reactjsParser = new ReactjsParser(tokens);

        ReactjsParser.ProgramContext tree = reactjsParser.program();

        reactjsParser.setBuildParseTree(false);
        ParseTree parseTree = reactjsParser.program();

        // /// PRINT AST
         ASTPrinter listener = new ASTPrinter();
         ParseTreeWalker walker = new ParseTreeWalker();
         walker.walk(listener, tree);
         System.out.println("***********************************************************");

         ParseTree tree1 = reactjsParser.program();

        // // Print the AST
         System.out.println(tree.toStringTree(reactjsParser));
         System.out.println("***********************************************************");

        SymbolTable symbolTable = SymbolTable.getInstance();
        Program program = (Program) new BaseVisitor().visit(tree);
        if (symbolTable.errors.size() > 0) {

            for (String error : symbolTable.errors) {
                System.out.println(error);
            }
        } else {
            String outputFilePath = "C:\\Users\\HP\\Desktop\\react.html";
            FileWriter fileWriter = new FileWriter(outputFilePath, false);
            fileWriter.write(program.toJavascript());
            fileWriter.close();
            File outputFile = new File(outputFilePath);

            Desktop.getDesktop().open(outputFile);

            System.out.println("The Parser Output:");
            System.out.println("***********************************************************");
            System.out.println(program);
            System.out.println("***********************************************************");
            System.out.println("The SymbolTable:");
            System.out.println("***********************************************************");
            symbolTable.print();
            System.out.println("***********************************************************");

        }

    }

}
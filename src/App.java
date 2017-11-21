import model.Grammar;
import util.GrammarUtil;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        final String filePath = "grammar.txt";
        Grammar grammar = GrammarUtil.fromFile(filePath);
        switch (GrammarUtil.getType(grammar)) {
            case TYPE_0:
                System.out.println("Грамматика типа 0");
                break;
            case CONTEXT_SENSITIVE:
                System.out.println("Контекстно-зависимая грамматика");
                break;
            case CONTEXT_FREE:
                System.out.println("Контекстно-свободная грамматика");
                break;
            case REGULAR:
                System.out.println("Регулярная грамматика");
                break;
        }
    }
}

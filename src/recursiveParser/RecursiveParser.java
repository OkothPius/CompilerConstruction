package recursiveParser;

public class RecursiveParser {
    private ArgsTokenMgr tm;
    private char currentToken;

    public RecursiveParser(ArgsTokenMgr tm) {
        this.tm = tm;
        advance();
    }

    private void advance() {
        currentToken = tm.getToken();
    }

    private void consume(char expected) {
        if (currentToken == expected)
            advance();
        else
            throw new RuntimeException("Expecting \"" + expected + "\"");
    }

    public void parse() {
        s();
        if (currentToken != '#')        //Trailing garbage test
            throw new RuntimeException("Expecting end of input");
    }

    private void s() {
        B();                             //Apply S -> BD
        D();
    }

    private void B() {
        switch (currentToken) {
            case 'b':
                consume('b');  //apply B ->bB
                B();
                break;

            case 'c':
                consume('c'); //apply B -> c
                break;

            default:
                throw new RuntimeException("Expecting \"b\" or \"c\"");
        }
    }

    private void D() {
        consume('d');       //apply de
        consume('e');
    }
}

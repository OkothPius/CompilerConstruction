package recursiveParser;

public class ArgsTokenMgr {
    private int index;
    String input;
    //------------------
    public ArgsTokenMgr(String[] args) {
        if (args.length > 0)
            input = args[0];
        else                //Treat no command line arg as null string
            input = "";
        index = 0;
        System.out.println("input = " + input);
    }
    public char getToken() {
        if (index < input.length())
            return input.charAt(index++); //return next char
        else
            return '#'; // # signals end of input


    }
}
/**Recursive descent parser for
 *               selection set
 * 1) S -> BD      {b, c}
 * 2) B -> bB       {b}
 * 3) B -> c        {c}
 * 4) D -> de       {d}
 * */

package recursiveParser;

import java.util.Scanner;
public class Recursive {
    /**Main method*/
    public static void main(String[] args) {
        //construct token manager
        ArgsTokenMgr tm = new ArgsTokenMgr(args);
        //construct parser
        RecursiveParser parser = new RecursiveParser(tm);

        try {
            parser.parse();  //do parse
        }
        catch (RuntimeException e) {
            System.err.println(e.getMessage());
            System.err.println("Reject");
            System.exit(1);
        }

        System.out.println("Accept");

    }
}

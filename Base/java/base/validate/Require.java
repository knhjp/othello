package base.validate;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 20, 2009
 * Time: 8:48:04 PM
 * This is meant to do validation
 */
public class Require {
    public static void eq(int val1, String name1, int val2, String name2) {
        if (val1 != val2) {
            throw new RuntimeException(name1 + "!=" + name2);
        }
    }
}

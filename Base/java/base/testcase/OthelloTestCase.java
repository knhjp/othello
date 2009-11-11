package base.testcase;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 3:24:26 PM
 * OthelloTestCase is meant to be the root of all the test cases. This makes it easy for me to add something that
 * applies to all of my test cases
 */
public class OthelloTestCase extends TestCase {
    public static void assertEquals(int[] expected, int[] results) {
        assertEquals(expected.length,results.length);

        for (int i=0; i<expected.length ; i++) {
            assertEquals(expected[i],results[i]);
        }
    }

    public void testAssertArrayEquals(){
        assertEquals(new int[]{1,2,3,4,5},new int[]{1,2,3,4,5});
    }
}

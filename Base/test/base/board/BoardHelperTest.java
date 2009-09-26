package base.board;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 7:41:10 PM
 * This class tests the methods in BoardHelper
 */
public class BoardHelperTest extends OthelloTestCase {
    public void testStringToMoves() {
        int[] results = BoardHelper.stringToMoves("ajshrjahu24ajha");
        assertEquals(new int[]{}, results); //garbage data

        results = BoardHelper.stringToMoves("f5");
        assertEquals(new int[]{65},results);

        results = BoardHelper.stringToMoves("A2");
        assertEquals(new int[]{12},results);

        results = BoardHelper.stringToMoves("aB3");
        assertEquals(new int[]{23},results);

        results = BoardHelper.stringToMoves("ac5H4");
        assertEquals(new int[]{35,84},results);
    }
}

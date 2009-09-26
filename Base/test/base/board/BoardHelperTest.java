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
    }
}

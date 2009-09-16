package simpleboard;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 3:08:40 PM
 * This class is a unit test for SimpleBoard
 */
public class SimpleBoardTest extends OthelloTestCase {
    public void testResetToStart() {
        SimpleBoard board = new SimpleBoard();
        board.resetToStart();

        //testing corners
        assertEquals(0,board.getSquare(11));
        assertEquals(0,board.getSquare(18));
        assertEquals(0,board.getSquare(81));
        assertEquals(0,board.getSquare(88));
    }
}

package simpleboard;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 20, 2009
 * Time: 6:32:24 PM
 * This is a unit test for SetupBoard
 */
public class SetupBoardTest extends OthelloTestCase {
    public void testCalcBlackMinusWhite() {
        SetupBoard board = new SetupBoard();
        board.resetToStart();
        assertEquals(0,board.calcBlackMinusWhite());

        board.makeMove(1,56);
        assertEquals(3,board.getBlackMinusWhite());
        assertEquals(3,board.calcBlackMinusWhite());
    }
}

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
        SetupBoard setupBoard = new SetupBoard();
        setupBoard.resetToStart();
        assertEquals(0,setupBoard.calcBlackMinusWhite());
    }
}

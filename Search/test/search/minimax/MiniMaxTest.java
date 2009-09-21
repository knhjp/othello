package search.minimax;

import base.testcase.OthelloTestCase;
import simpleboard.SetupBoard;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 19-Sep-2009
 * Time: 1:02:47 PM
 * This class tests that we can do some simple search
 */
public class MiniMaxTest extends OthelloTestCase {
    public void testSimpleCase() {
        int[] myBoard = {
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, -1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, -1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        SetupBoard board = new SetupBoard();
        board.resetToStart();
        board.setBoard(myBoard);

        
    }
}

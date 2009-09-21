package search.minimax;

import base.testcase.OthelloTestCase;
import base.board.Board;
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

        MiniMax miniMax = new MiniMax();

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = miniMax.search(1, boards, 3, false);
        assertEquals(64,score);
    }

    public void testWithEarlyEnd() {
        int[] myBoard = {
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, -1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        SetupBoard board = new SetupBoard();
        board.resetToStart();
        board.setBoard(myBoard);

        MiniMax miniMax = new MiniMax();

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = miniMax.search(1, boards, 3, false);
        assertEquals(63,score);
    }
}

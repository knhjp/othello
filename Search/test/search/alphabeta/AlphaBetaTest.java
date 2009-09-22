package search.alphabeta;

import base.testcase.OthelloTestCase;
import base.board.Board;
import simpleboard.SetupBoard;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 21, 2009
 * Time: 7:39:26 PM
 * This is a unit test for testing AlphaBeta
 */
public class AlphaBetaTest extends OthelloTestCase {
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

        AlphaBeta alphaBeta = new AlphaBeta();

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = alphaBeta.search(1, boards, 3, false,-65,65);
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

        AlphaBeta alphaBeta = new AlphaBeta();

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = alphaBeta.search(1, boards, 3, false,-65,65);
        assertEquals(63,score);
    }
}

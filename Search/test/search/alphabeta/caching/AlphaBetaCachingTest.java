package search.alphabeta.caching;

import base.testcase.OthelloTestCase;
import base.board.Board;
import simpleboard.SetupBoard;
import search.TreeSearch;
import search.alphabeta.AlphaBeta;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 23, 2009
 * Time: 9:10:29 PM
 * An unit test to test that AlphaBetaCaching is at least doing the right thing in some situations
 */
public class AlphaBetaCachingTest extends OthelloTestCase {
    private final int cacheSize = 10000;

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

        AlphaBetaCaching alphaBeta = new AlphaBetaCaching(cacheSize, new AlphaBeta());

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = alphaBeta.search(1, boards, 3, false, TreeSearch.negInf,TreeSearch.posInf);
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

        AlphaBetaCaching alphaBeta = new AlphaBetaCaching(cacheSize, new AlphaBeta());

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = alphaBeta.search(1, boards, 3, false,TreeSearch.negInf,TreeSearch.posInf);
        assertEquals(63,score);
    }

    public void testWithOneBetterMove() {
        int[] myBoard = {
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 1, 1, 1, 1, 1, 1, -1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, -1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, -1, 0, 3,
                3, 1, 1, 1, 1, 1, 1, -1, -1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, -1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, 1, 1, 1, 1, 1, 1, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        SetupBoard board = new SetupBoard();
        board.resetToStart();
        board.setBoard(myBoard);

        AlphaBetaCaching miniMax = new AlphaBetaCaching(cacheSize, new AlphaBeta());

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }

        boards[3] = board;
        int score = miniMax.search(1, boards, 3, false,TreeSearch.negInf,TreeSearch.posInf);
        assertEquals(64,score);
    }
}

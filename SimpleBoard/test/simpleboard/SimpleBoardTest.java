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

        //test for the center four pieces
        assertEquals(-1,board.getSquare(44));
        assertEquals(1,board.getSquare(45));
        assertEquals(1,board.getSquare(54));
        assertEquals(-1,board.getSquare(55));
    }

    public void testIsMoveValid() {
        SimpleBoard board = new SimpleBoard();
        board.resetToStart();

        assertFalse(board.isMoveValid(1, 11));

        //check that places that already have a disc cannot have a valid move
        assertFalse(board.isMoveValid(1, 44));
        assertFalse(board.isMoveValid(1, 45));
        assertFalse(board.isMoveValid(1, 54));
        assertFalse(board.isMoveValid(1, 55));

        //testing for actual valid moves
        assertTrue(board.isMoveValid(1, 56));
        assertTrue(board.isMoveValid(1, 65));
        assertTrue(board.isMoveValid(1, 34));
        assertTrue(board.isMoveValid(1, 43));

        //testing for actual valid moves for white
        assertTrue(board.isMoveValid(-1, 46));
        assertTrue(board.isMoveValid(-1, 64));
        assertTrue(board.isMoveValid(-1, 35));
        assertTrue(board.isMoveValid(-1, 53));

    }

    public void testMakeMove() {
        SimpleBoard board = new SimpleBoard();
        board.resetToStart();

        board.makeMove(1,56);

        assertEquals(-1,board.getSquare(44));
        assertEquals(1,board.getSquare(54));
        assertEquals(1,board.getSquare(45));
        assertEquals(1,board.getSquare(55));
        assertEquals(1,board.getSquare(56));
    }

    public void testTransposition() {
        SimpleBoard board1 = new SimpleBoard();
        board1.resetToStart();

        SimpleBoard board2 = new SimpleBoard();
        board2.resetToStart();

        board1.makeMove(1,65);
        board1.makeMove(-1,66);
        board1.makeMove(1,56);

        board2.makeMove(1,56);
        board2.makeMove(-1,66);
        board2.makeMove(1,65);

        assertEquals(board1,board2);
    }
}

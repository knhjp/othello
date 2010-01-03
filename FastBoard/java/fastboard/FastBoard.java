package fastboard;

import base.board.Board;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 8:37:11 PM
 * This is meant to be a fast implementation of Board
 */
public class FastBoard extends FastBoardFlips implements Board<FastBoard> {
    public FastBoard() {
    }

    @Override public int getSquare(int location) {
        return 0;
    }

    @Override public void resetToStart() {

    }

    @Override public boolean isMoveValid(int color, int location) {
        return false;
    }

    @Override public void makeMove(int color, int location) {

    }

    @Override public void copyBoard(FastBoard board) {

    }

    @Override public int getBlackMinusWhite() {
        return 0;
    }

    @Override public int hashCodeWithColor(int color) {
        return 0;
    }
}

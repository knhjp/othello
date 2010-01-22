package fastboard;

import base.board.Board;
import fastboard.fastflip.FastBoardFlips;
import fastboard.checkmove.FastCheck;
import fastboard.fastmake.FastMake;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 8:37:11 PM
 * This is meant to be a fast implementation of Board
 */
public class FastBoard extends FastBoardFlips implements Board<FastBoard> {
    private final FastMake[][] fastMakes;

    public FastBoard(FastMake[][] fastMakes) {
        this.fastMakes = fastMakes;
    }

    @Override public int getSquare(int location) {
        return 0;
    }

    @Override public void resetToStart() {

    }

    @Override public boolean isMoveValid(int color, int location) {
        return FastCheck.fastChecks[color][location].isValidMove(this);
    }

    @Override public void makeMove(int color, int location) {
        this.fastMakes[color][location].makeMove(this);
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

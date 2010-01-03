package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not d1 is a valid move
 */
public class FastCheckD1 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD1(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[7][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a1_h1] ||
                fastCheckCalcArray[4][lines.d1_h5] ||
                fastCheckCalcArray[0][lines.a4_d1];
    }
}
package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not D5 is a valid move
 */
public class FastCheckD5 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD5(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[3][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a5_h5] ||
                fastCheckCalcArray[3][lines.a2_g8] ||
                fastCheckCalcArray[4][lines.a8_h1];
    }
}
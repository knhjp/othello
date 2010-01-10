package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not d8 is a valid move
 */
public class FastCheckD8 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD8(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[0][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a8_h8] ||
                fastCheckCalcArray[4][lines.d8_h4] ||
                fastCheckCalcArray[0][lines.a5_d8];
    }
}
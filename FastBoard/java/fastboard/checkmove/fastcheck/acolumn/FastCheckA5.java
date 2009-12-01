package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not a5 is a valid move
 */
public class FastCheckA5 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA5(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[3][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a5_h5] ||
                fastCheckCalcArray[3][lines.a5_d8] ||
                fastCheckCalcArray[4][lines.a5_e1];
    }
}
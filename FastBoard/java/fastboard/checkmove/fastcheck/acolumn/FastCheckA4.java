package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not a4 is a valid move
 */
public class FastCheckA4 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA4(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[4][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a4_h4] ||
                fastCheckCalcArray[4][lines.a4_e8] ||
                fastCheckCalcArray[3][lines.a4_d1];
    }
}
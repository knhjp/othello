package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not a7 is a valid move
 */
public class FastCheckA7 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA7(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[1][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a7_h7] ||
                fastCheckCalcArray[6][lines.a7_g1];
    }
}
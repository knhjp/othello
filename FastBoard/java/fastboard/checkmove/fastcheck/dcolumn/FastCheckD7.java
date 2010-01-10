package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not d7 is a valid move
 */
public class FastCheckD7 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD7(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[1][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a7_h7] ||
                fastCheckCalcArray[4][lines.c8_h3] ||
                fastCheckCalcArray[1][lines.a4_e8];
    }
}
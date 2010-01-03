package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not d2 is a valid move
 */
public class FastCheckD2 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD2(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[6][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a2_h2] ||
                fastCheckCalcArray[4][lines.c1_h6] ||
                fastCheckCalcArray[1][lines.a5_e1];
    }
}
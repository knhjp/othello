package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not d4 is a valid move
 */
public class FastCheckD4 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD4(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[4][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a4_h4] ||
                fastCheckCalcArray[4][lines.a1_h8] ||
                fastCheckCalcArray[3][lines.a7_g1];
    }
}
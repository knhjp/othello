package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not b6 is a valid move
 */
public class FastCheckB6 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckB6(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[2][lines.b1_b8] ||
                fastCheckCalcArray[6][lines.a6_h6] ||
                fastCheckCalcArray[2][lines.a5_d8] ||
                fastCheckCalcArray[5][lines.a7_g1];
    }
}
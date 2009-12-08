package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not b4 is a valid move
 */
public class FastCheckB4 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckB4(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[4][lines.b1_b8] ||
                fastCheckCalcArray[6][lines.a4_h4] ||
                fastCheckCalcArray[4][lines.a3_f8] ||
                fastCheckCalcArray[3][lines.a5_e1];
    }
}
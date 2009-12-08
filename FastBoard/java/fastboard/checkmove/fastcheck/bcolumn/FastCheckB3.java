package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:35:02 PM
 * This class tells you, given the current configuration, whether or not b3 is a valid move
 */
public class FastCheckB3 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckB3(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[5][lines.b1_b8] ||
                fastCheckCalcArray[6][lines.a3_h3] ||
                fastCheckCalcArray[5][lines.a2_g8] ||
                fastCheckCalcArray[2][lines.a4_d1];
    }
}
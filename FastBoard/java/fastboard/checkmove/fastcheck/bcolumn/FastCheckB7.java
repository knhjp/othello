package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not b7 is a valid move
 */
public class FastCheckB7 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckB7(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[1][lines.b1_b8] ||
                fastCheckCalcArray[6][lines.a7_h7] ||
                fastCheckCalcArray[6][lines.a8_h1];
    }
}
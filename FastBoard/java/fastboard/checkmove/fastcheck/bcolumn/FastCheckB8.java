package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not b8 is a valid move
 */
public class FastCheckB8 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckB8(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[0][lines.b1_b8] ||
                fastCheckCalcArray[6][lines.a8_h8] ||
                fastCheckCalcArray[6][lines.b8_h2];
    }
}
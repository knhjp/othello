package fastboard.checkmove.fastcheck.ccolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not c7 is a valid move
 */
public class FastCheckC7 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckC7(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[1][lines.c1_c8] ||
                fastCheckCalcArray[5][lines.a7_h7] ||
                fastCheckCalcArray[5][lines.b8_h2] ||
                fastCheckCalcArray[1][lines.a5_d8];
    }
}
package fastboard.checkmove.fastcheck.ccolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 03:19:22 PM
 * This class tells you, given the current configuration, whether or not c4 is a valid move
 */
public class FastCheckC4 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckC4(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[4][lines.c1_c8] ||
                fastCheckCalcArray[5][lines.a4_h4] ||
                fastCheckCalcArray[4][lines.a2_g8] ||
                fastCheckCalcArray[3][lines.a6_f1];
    }
}
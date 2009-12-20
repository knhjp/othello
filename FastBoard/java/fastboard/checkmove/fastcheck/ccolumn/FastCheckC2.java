package fastboard.checkmove.fastcheck.ccolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not c2 is a valid move
 */
public class FastCheckC2 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckC2(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[6][lines.c1_c8] ||
                fastCheckCalcArray[5][lines.a2_h2] ||
                fastCheckCalcArray[5][lines.b1_h7] ||
                fastCheckCalcArray[1][lines.a4_d1];
    }
}
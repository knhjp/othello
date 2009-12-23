package fastboard.checkmove.fastcheck.ccolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:35:02 PM
 * This class tells you, given the current configuration, whether or not c3 is a valid move
 */
public class FastCheckC3 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckC3(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[5][lines.c1_c8] ||
                fastCheckCalcArray[5][lines.a3_h3] ||
                fastCheckCalcArray[5][lines.a1_h8] ||
                fastCheckCalcArray[2][lines.a5_e1];
    }
}
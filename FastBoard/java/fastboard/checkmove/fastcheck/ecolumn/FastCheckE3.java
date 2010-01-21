package fastboard.checkmove.fastcheck.ecolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:35:02 PM
 * This class tells you, given the current configuration, whether or not e3 is a valid move
 */
public class FastCheckE3 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckE3(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[5][lines.e1_e8] ||
                fastCheckCalcArray[3][lines.a3_h3] ||
                fastCheckCalcArray[3][lines.c1_h6] ||
                fastCheckCalcArray[2][lines.a7_g1];
    }
}
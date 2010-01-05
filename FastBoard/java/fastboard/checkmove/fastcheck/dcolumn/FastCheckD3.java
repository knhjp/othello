package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:35:02 PM
 * This class tells you, given the current configuration, whether or not d3 is a valid move
 */
public class FastCheckD3 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckD3(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[5][lines.d1_d8] ||
                fastCheckCalcArray[4][lines.a3_h3] ||
                fastCheckCalcArray[4][lines.b1_h7] ||
                fastCheckCalcArray[2][lines.a6_f1];
    }
}
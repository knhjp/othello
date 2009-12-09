package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:35:02 PM
 * This class tells you, given the current configuration, whether or not a3 is a valid move
 */
public class FastCheckA3 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA3(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[5][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a3_h3] ||
                fastCheckCalcArray[5][lines.a3_f8] ||
                fastCheckCalcArray[2][lines.a3_c1];
    }
}
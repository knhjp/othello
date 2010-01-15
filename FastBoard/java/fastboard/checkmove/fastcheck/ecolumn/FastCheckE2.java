package fastboard.checkmove.fastcheck.ecolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not e2 is a valid move
 */
public class FastCheckE2 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckE2(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[6][lines.e1_e8] ||
                fastCheckCalcArray[3][lines.a2_h2] ||
                fastCheckCalcArray[3][lines.d1_h5] ||
                fastCheckCalcArray[1][lines.a6_f1];
    }
}
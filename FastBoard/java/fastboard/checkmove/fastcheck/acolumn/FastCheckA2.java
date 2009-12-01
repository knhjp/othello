package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:12:58 PM
 * This class tells you, given the current configuration, whether or not a2 is a valid move
 */
public class FastCheckA2 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA2(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[6][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a2_h2] ||
                fastCheckCalcArray[6][lines.a2_g8];
    }
}
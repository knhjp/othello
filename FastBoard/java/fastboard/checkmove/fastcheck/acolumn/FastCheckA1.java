package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not 11 (a1) is a valid move
 */
public class FastCheckA1 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckA1(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[7][lines.a1_a8] ||
                fastCheckCalcArray[7][lines.a1_h1] ||
                fastCheckCalcArray[7][lines.a1_h8];
    }
}

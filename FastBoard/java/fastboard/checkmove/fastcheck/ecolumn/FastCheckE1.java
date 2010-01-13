package fastboard.checkmove.fastcheck.ecolumn;

import fastboard.FastBoardLines;
import fastboard.checkmove.FastCheck;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not e1 is a valid move
 */
public class FastCheckE1 implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheckE1(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[7][lines.e1_e8] ||
                fastCheckCalcArray[3][lines.a1_h1] ||
                fastCheckCalcArray[3][lines.e1_h4] ||
                fastCheckCalcArray[0][lines.a5_e1];
    }
}
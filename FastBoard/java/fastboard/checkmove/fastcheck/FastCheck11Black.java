package fastboard.checkmove.fastcheck;

import fastboard.checkmove.FastCheck;
import fastboard.FastBoardLines;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:47:58 AM
 * This class tells you, given the current configuration, whether or not 11 (a1) is a valid move
 */
public class FastCheck11Black implements FastCheck {
    private boolean[][] fastCheckCalcArray;

    public FastCheck11Black(boolean[][] fastCheckCalcArray) {
        this.fastCheckCalcArray = fastCheckCalcArray;
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return
                fastCheckCalcArray[0][lines.a1_a8] ||
                fastCheckCalcArray[0][lines.a1_h1] ||
                fastCheckCalcArray[0][lines.a1_h8];
    }
}

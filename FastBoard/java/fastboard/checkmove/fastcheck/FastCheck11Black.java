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
    public FastCheck11Black() {
    }

    @Override public boolean isValidMove(FastBoardLines lines) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

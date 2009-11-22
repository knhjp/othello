package fastboard.checkmove;

import fastboard.FastBoardLines;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:28:30 AM
 * This interface should provides a way to check quickly whether or not a move is a valid move
 */
public interface FastCheck {
    FastCheck[][] fastChecks = new FastCheck[][]{
            {},
            {},
            {}
    };

    boolean isValidMove(FastBoardLines lines);
}

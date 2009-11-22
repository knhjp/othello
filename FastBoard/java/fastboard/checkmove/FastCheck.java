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
    static final FastCheck invalid = new Invalid();
    FastCheck[][] fastChecks = new FastCheck[][]{
            {   invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid,
            },
            {},
            {   invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid,                                                                         invalid,
                invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid, invalid,
            },
    };

    boolean isValidMove(FastBoardLines lines);

    static class Invalid implements FastCheck {
        private Invalid() {
        }

        @Override public boolean isValidMove(FastBoardLines lines) {
            throw new IllegalStateException("Shoudl not be calling this method");
        }
    }
}

package fastboard.checkmove;

import fastboard.FastBoardLines;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.checkmove.fastcheck.acolumn.FastCheckA1;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:28:30 AM
 * This interface should provides a way to check quickly whether or not a move is a valid move
 */
public interface FastCheck {
    FastCheck[][] fastChecks = Calc.createFastChecks();

    boolean isValidMove(FastBoardLines lines);

    class Calc {
        private static FastCheck[][] createFastChecks() {
            FastCheckCalc calc = new FastCheckCalc();
            boolean[][] black = calc.calcIsMoveValidForBlack();
            boolean[][] white = calc.calcIsMoveValidForWhite();
            return new FastCheck[][]{
                    {   null, null, null, null, null, null, null, null, null, null,
                        null, new FastCheckA1(black),                                            null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null, null, null, null, null, null, null, null, null, null,
                    },
                    {},
                    {   null, null, null, null, null, null, null, null, null, null,
                        null, new FastCheckA1(white),                                                 null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null,                                                                         null,
                        null, null, null, null, null, null, null, null, null, null,
                    },
            };
        }
    }
}

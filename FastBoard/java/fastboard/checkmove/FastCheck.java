package fastboard.checkmove;

import fastboard.FastBoardLines;
import fastboard.checkmove.fastcheck.FastCheckA1Black;
import fastboard.checkmove.calc.FastCheckCalc;

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
            return new FastCheck[][]{
                    {   null, null, null, null, null, null, null, null, null, null,
                        null, new FastCheckA1Black(black),                                            null,
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
                        null,                                                                         null,
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

package fastboard.checkmove.fastcheck;

import base.testcase.OthelloTestCase;
import fastboard.FastBoardFlips;
import fastboard.lineconverter.LineConverter;
import fastboard.checkmove.calc.FastCheckCalc;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheck11Black checks for valid moves properly
 */
public class FastCheck11BlackTest extends OthelloTestCase {
    public void testIsMoveValid() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheck11Black check = new FastCheck11Black(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_ooooooo");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));
    }
}

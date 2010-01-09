package fastboard.checkmove.fastcheck.dcolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckD6 checks for valid moves properly
 */
public class FastCheckD6Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD6 check = new FastCheckD6(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xoooo_xx");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xxxxx_ox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a3_f8 = LineConverter.convertStringToLine("______oo");
        assertFalse(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("___xo___");
        assertTrue(check.isValidMove(flips));

        flips.a3_f8 = LineConverter.convertStringToLine("_____o_x");
        flips.a6_h6 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a6_h6 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));
        flips.a6_h6 = LineConverter.convertStringToLine("xoo_____");
        assertTrue(check.isValidMove(flips));

        flips.a6_h6 = LineConverter.convertStringToLine("___xoxxo");
        flips.b8_h2 = LineConverter.convertStringToLine("___oooox");
        assertFalse(check.isValidMove(flips));
        flips.b8_h2 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));
    }
}
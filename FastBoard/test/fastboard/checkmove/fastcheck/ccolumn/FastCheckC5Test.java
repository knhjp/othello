package fastboard.checkmove.fastcheck.ccolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckB5 checks for valid moves properly
 */
public class FastCheckC5Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckC5 check = new FastCheckC5(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xooo_xxx");
        assertTrue(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xxxx_oox");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a3_f8 = LineConverter.convertStringToLine("___oo__o");
        assertFalse(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("_____oxo");
        assertTrue(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("__xo____");
        assertTrue(check.isValidMove(flips));

        flips.a3_f8 = LineConverter.convertStringToLine("____o_xx");
        flips.a5_h5 = LineConverter.convertStringToLine("___xooox");
        assertFalse(check.isValidMove(flips));
        flips.a5_h5 = LineConverter.convertStringToLine("___oox__");
        assertTrue(check.isValidMove(flips));

        flips.a5_h5 = LineConverter.convertStringToLine("___xoxxo");
        flips.a7_g1 = LineConverter.convertStringToLine("___oooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("_xo_____");
        assertTrue(check.isValidMove(flips));
    }
}
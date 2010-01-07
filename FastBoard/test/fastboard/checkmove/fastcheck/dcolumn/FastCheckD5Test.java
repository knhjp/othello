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
 * Tests whether or not FastCheckC5 checks for valid moves properly
 */
public class FastCheckD5Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD5 check = new FastCheckD5(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xooo_xxx");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xxxx_oox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a2_g8 = LineConverter.convertStringToLine("___oo__o");
        assertFalse(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("_____oxo");
        assertTrue(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("__xo____");
        assertTrue(check.isValidMove(flips));

        flips.a2_g8 = LineConverter.convertStringToLine("____o_xx");
        flips.a5_h5 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a5_h5 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));

        flips.a5_h5 = LineConverter.convertStringToLine("____xoxo");
        flips.a8_h1 = LineConverter.convertStringToLine("___oooox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("_xo_____");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckD5 check = new FastCheckD5(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("oxxx_ooo");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("oooo_xxo");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a2_g8 = LineConverter.convertStringToLine("___xx__x");
        assertFalse(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("_____xox");
        assertTrue(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("__ox____");
        assertTrue(check.isValidMove(flips));

        flips.a2_g8 = LineConverter.convertStringToLine("____x_oo");
        flips.a5_h5 = LineConverter.convertStringToLine("____oxxo");
        assertFalse(check.isValidMove(flips));
        flips.a5_h5 = LineConverter.convertStringToLine("____xxo_");
        assertTrue(check.isValidMove(flips));

        flips.a5_h5 = LineConverter.convertStringToLine("____oxox");
        flips.a8_h1 = LineConverter.convertStringToLine("___xxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("____xxxo");
        assertTrue(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("_ox_____");
        assertTrue(check.isValidMove(flips));
    }
}
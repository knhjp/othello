package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckB6 checks for valid moves properly
 */
public class FastCheckB6Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckB6 check = new FastCheckB6(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xoooo_xx");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xxxxx_ox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a5_d8 = LineConverter.convertStringToLine("______oo");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));

        flips.a5_d8 = LineConverter.convertStringToLine("_____o_x");
        flips.a6_h6 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a6_h6 = LineConverter.convertStringToLine("__oox___");
        assertTrue(check.isValidMove(flips));

        flips.a6_h6 = LineConverter.convertStringToLine("__xoxoxo");
        flips.a7_g1 = LineConverter.convertStringToLine("__ooooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("___oooox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckB6 check = new FastCheckB6(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("oxxxx_oo");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("ooooo_xo");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a5_d8 = LineConverter.convertStringToLine("______xx");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("______xo");
        assertTrue(check.isValidMove(flips));

        flips.a5_d8 = LineConverter.convertStringToLine("_____x_o");
        flips.a6_h6 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a6_h6 = LineConverter.convertStringToLine("__xxo___");
        assertTrue(check.isValidMove(flips));

        flips.a6_h6 = LineConverter.convertStringToLine("__oxoxox");
        flips.a7_g1 = LineConverter.convertStringToLine("__xxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("___xxxxo");
        assertTrue(check.isValidMove(flips));
    }
}
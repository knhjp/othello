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
 * Tests whether or not FastCheckB5 checks for valid moves properly
 */
public class FastCheckB5Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckB5 check = new FastCheckB5(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xooo_xxx");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xxxx_oox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a4_e8 = LineConverter.convertStringToLine("___oo__o");
        assertFalse(check.isValidMove(flips));
        flips.a4_e8 = LineConverter.convertStringToLine("_____oxo");
        assertTrue(check.isValidMove(flips));

        flips.a4_e8 = LineConverter.convertStringToLine("____o_xx");
        flips.a5_h5 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a5_h5 = LineConverter.convertStringToLine("__oox___");
        assertTrue(check.isValidMove(flips));

        flips.a5_h5 = LineConverter.convertStringToLine("__xoxoxo");
        flips.a6_f1 = LineConverter.convertStringToLine("___oooox");
        assertFalse(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckB5 check = new FastCheckB5(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("oxxx_ooo");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("oooo_xxo");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a4_e8 = LineConverter.convertStringToLine("___xx__x");
        assertFalse(check.isValidMove(flips));
        flips.a4_e8 = LineConverter.convertStringToLine("_____xox");
        assertTrue(check.isValidMove(flips));

        flips.a4_e8 = LineConverter.convertStringToLine("____x_oo");
        flips.a5_h5 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a5_h5 = LineConverter.convertStringToLine("__xxo___");
        assertTrue(check.isValidMove(flips));

        flips.a5_h5 = LineConverter.convertStringToLine("__oxoxox");
        flips.a6_f1 = LineConverter.convertStringToLine("___xxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("____xxxo");
        assertTrue(check.isValidMove(flips));
    }
}
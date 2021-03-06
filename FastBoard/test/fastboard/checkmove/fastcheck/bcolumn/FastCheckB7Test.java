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
 * Tests whether or not FastCheckB7 checks for valid moves properly
 */
public class FastCheckB7Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckB7 check = new FastCheckB7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xooooo_x");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a7_h7 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("__oox___");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("__xoxoxo");
        flips.a8_h1 = LineConverter.convertStringToLine("_oooooox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("__ooooox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckB7 check = new FastCheckB7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxx_o");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a7_h7 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("__xxo___");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("__oxoxox");
        flips.a8_h1 = LineConverter.convertStringToLine("_xxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("__xxxxxo");
        assertTrue(check.isValidMove(flips));
    }
}
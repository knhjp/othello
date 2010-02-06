package fastboard.checkmove.fastcheck.acolumn;

import fastboard.FastBoardTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckA7 checks for valid moves properly
 */
public class FastCheckA7Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckA7 check = new FastCheckA7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xooooo_x");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a7_h7 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("_oox____");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("_xooxoxo");
        flips.a7_g1 = LineConverter.convertStringToLine("_oooooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("__ooooox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckA7 check = new FastCheckA7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("oxxxxx_o");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a7_h7 = LineConverter.convertStringToLine("_oxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("_xxo____");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("_oxxoxox");
        flips.a7_g1 = LineConverter.convertStringToLine("_xxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("__xxxxxo");
        assertTrue(check.isValidMove(flips));
    }
}
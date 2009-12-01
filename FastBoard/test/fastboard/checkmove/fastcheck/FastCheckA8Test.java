package fastboard.checkmove.fastcheck;

import base.testcase.OthelloTestCase;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;
import fastboard.checkmove.calc.FastCheckCalc;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckA8 checks for valid moves properly
 */
public class FastCheckA8Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckA8 check = new FastCheckA8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xoooooo_");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a8_h8 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("_oox____");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_xooxoxo");
        flips.a8_h1 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckA8 check = new FastCheckA8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("oxxxxxx_");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a8_h8 = LineConverter.convertStringToLine("_oxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("_xxo____");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_oxxoxox");
        flips.a8_h1 = LineConverter.convertStringToLine("_oxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h1 = LineConverter.convertStringToLine("_xxxxxxo");
        assertTrue(check.isValidMove(flips));
    }
}
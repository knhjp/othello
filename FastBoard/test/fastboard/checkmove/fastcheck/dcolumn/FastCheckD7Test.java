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
 * Tests whether or not FastCheckD7 checks for valid moves properly
 */
public class FastCheckD7Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD7 check = new FastCheckD7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xooooo_x");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a7_h7 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("____xoxo");
        flips.c8_h3 = LineConverter.convertStringToLine("___oooox");
        assertFalse(check.isValidMove(flips));
        flips.c8_h3 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));

        flips.c8_h3 = LineConverter.convertStringToLine("_____oox");
        flips.a4_e8 = LineConverter.convertStringToLine("____xx__");
        assertFalse(check.isValidMove(flips));
        flips.a4_e8 = LineConverter.convertStringToLine("____xo__");
        assertTrue(check.isValidMove(flips));
    }
}
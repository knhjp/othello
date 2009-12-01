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
 * Tests whether or not FastCheckA4 checks for valid moves properly
 */
public class FastCheckA6Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckA6 check = new FastCheckA6(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xoooo_xx");
        assertTrue(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xxxxx_ox");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a6_c8 = LineConverter.convertStringToLine("_____o_o");
        assertFalse(check.isValidMove(flips));
        flips.a6_c8 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));

        flips.a6_c8 = LineConverter.convertStringToLine("_____o_x");
        flips.a6_h6 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a6_h6 = LineConverter.convertStringToLine("_oox____");
        assertTrue(check.isValidMove(flips));

        flips.a6_h6 = LineConverter.convertStringToLine("_xooxoxo");
        flips.a6_f1 = LineConverter.convertStringToLine("__ooooox");
        assertFalse(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("___oooox");
        assertTrue(check.isValidMove(flips));
    }


}
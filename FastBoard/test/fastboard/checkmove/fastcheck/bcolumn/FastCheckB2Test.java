package fastboard.checkmove.fastcheck.bcolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckB2 checks for valid moves properly
 */
public class FastCheckB2Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckB2 check = new FastCheckB2(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("__oooooo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("__ooooox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a1_h8 = LineConverter.convertStringToLine("__oo_o__");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("__ooxoo_");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("__oo_xxx");
        flips.a2_h2 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a2_h2 = LineConverter.convertStringToLine("__ox____");
        assertTrue(check.isValidMove(flips));

        flips.a2_h2 = LineConverter.convertStringToLine("__xo____");
    }
}
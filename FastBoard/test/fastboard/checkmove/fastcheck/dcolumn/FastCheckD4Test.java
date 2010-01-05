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
 * Tests whether or not FastCheckC4 checks for valid moves properly
 */
public class FastCheckD4Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD4 check = new FastCheckD4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xoo__xxx");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xxx_ooox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a1_h8 = LineConverter.convertStringToLine("__oo__o_");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("_xo_xxox");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("___oo_xx");
        flips.a4_h4 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("xoo_o_xx");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("___xoxxo");
        flips.a7_g1 = LineConverter.convertStringToLine("____ooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("_____oox");
        assertTrue(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("__xo____");
        assertTrue(check.isValidMove(flips));
    }
}
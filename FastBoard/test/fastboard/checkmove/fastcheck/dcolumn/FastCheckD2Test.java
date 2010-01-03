package fastboard.checkmove.fastcheck.dcolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckD2 checks for valid moves properly
 */
public class FastCheckD2Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD2 check = new FastCheckD2(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("__oooooo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("__ooooox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.c1_h6 = LineConverter.convertStringToLine("____oo_o");
        assertFalse(check.isValidMove(flips));
        flips.c1_h6 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));

        flips.c1_h6 = LineConverter.convertStringToLine("____xoxx");
        flips.a2_h2 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a2_h2 = LineConverter.convertStringToLine("____ox__");
        assertTrue(check.isValidMove(flips));
        flips.a2_h2 = LineConverter.convertStringToLine("_xo_oo__");
        assertTrue(check.isValidMove(flips));

        flips.a2_h2 = LineConverter.convertStringToLine("____xo__");
        flips.a5_e1 = LineConverter.convertStringToLine("___xox__");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("___xxo__");
        assertTrue(check.isValidMove(flips));
    }
}
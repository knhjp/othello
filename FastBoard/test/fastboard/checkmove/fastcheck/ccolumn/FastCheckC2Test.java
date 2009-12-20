package fastboard.checkmove.fastcheck.ccolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckC2 checks for valid moves properly
 */
public class FastCheckC2Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckC2 check = new FastCheckC2(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("__oooooo");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("__ooooox");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.b1_h7 = LineConverter.convertStringToLine("___oo_o_");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("___ooxo_");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("___oo_xx");
        flips.a2_h2 = LineConverter.convertStringToLine("___xooox");
        assertFalse(check.isValidMove(flips));
        flips.a2_h2 = LineConverter.convertStringToLine("___ox___");
        assertTrue(check.isValidMove(flips));

        flips.a2_h2 = LineConverter.convertStringToLine("___xo___");
        flips.a4_d1 = LineConverter.convertStringToLine("____ox__");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("____xo__");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckC2 check = new FastCheckC2(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("__xxxxxx");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("__xxxxxo");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.b1_h7 = LineConverter.convertStringToLine("___xx_x_");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("___xxox_");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("___xx_oo");
        flips.a2_h2 = LineConverter.convertStringToLine("___oxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a2_h2 = LineConverter.convertStringToLine("___xo___");
        assertTrue(check.isValidMove(flips));

        flips.a2_h2 = LineConverter.convertStringToLine("___ox___");
        flips.a4_d1 = LineConverter.convertStringToLine("____xo__");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("____ox__");
        assertTrue(check.isValidMove(flips));
    }
}
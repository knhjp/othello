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
 * Tests whether or not FastCheckD1 checks for valid moves properly
 */
public class FastCheckD1Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD1 check = new FastCheckD1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_ooooooo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.d1_h5 = LineConverter.convertStringToLine("___oo_o_");
        assertFalse(check.isValidMove(flips));
        flips.d1_h5 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));

        flips.d1_h5 = LineConverter.convertStringToLine("____o_xx");
        flips.a1_h1 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("____ox__");
        assertTrue(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_xo_____");
        assertTrue(check.isValidMove(flips));

        flips.a1_h1 = LineConverter.convertStringToLine("____xo__");
        flips.a4_d1 = LineConverter.convertStringToLine("_____ox_");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("_____xo_");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckD1 check = new FastCheckD1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxxxxx");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("_xxxxxxo");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.d1_h5 = LineConverter.convertStringToLine("___xx_x_");
        assertFalse(check.isValidMove(flips));
        flips.d1_h5 = LineConverter.convertStringToLine("____xox_");
        assertTrue(check.isValidMove(flips));

        flips.d1_h5 = LineConverter.convertStringToLine("____x_oo");
        flips.a1_h1 = LineConverter.convertStringToLine("____oxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("____xo__");
        assertTrue(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_ox_____");
        assertTrue(check.isValidMove(flips));

        flips.a1_h1 = LineConverter.convertStringToLine("____ox__");
        flips.a4_d1 = LineConverter.convertStringToLine("_____xo_");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("_____ox_");
        assertTrue(check.isValidMove(flips));
    }
}
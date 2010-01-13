package fastboard.checkmove.fastcheck.ecolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckE1 checks for valid moves properly
 */
public class FastCheckE1Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckE1 check = new FastCheckE1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.e1_e8 = LineConverter.convertStringToLine("_ooooooo");
        assertFalse(check.isValidMove(flips));
        flips.e1_e8 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));

        flips.e1_e8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.e1_h4 = LineConverter.convertStringToLine("___oo_o_");
        assertFalse(check.isValidMove(flips));
        flips.e1_h4 = LineConverter.convertStringToLine("_____oxo");
        assertTrue(check.isValidMove(flips));

        flips.e1_h4 = LineConverter.convertStringToLine("____o_xx");
        flips.a1_h1 = LineConverter.convertStringToLine("_____xox");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_____ox_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_xoo____");
        assertTrue(check.isValidMove(flips));

        flips.a1_h1 = LineConverter.convertStringToLine("_____xo_");
        flips.a5_e1 = LineConverter.convertStringToLine("_____ox_");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("_____xo_");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckE1 check = new FastCheckE1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.e1_e8 = LineConverter.convertStringToLine("_xxxxxxx");
        assertFalse(check.isValidMove(flips));
        flips.e1_e8 = LineConverter.convertStringToLine("_xxxxxxo");
        assertTrue(check.isValidMove(flips));

        flips.e1_e8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.e1_h4 = LineConverter.convertStringToLine("___xx_x_");
        assertFalse(check.isValidMove(flips));
        flips.e1_h4 = LineConverter.convertStringToLine("_____xox");
        assertTrue(check.isValidMove(flips));

        flips.e1_h4 = LineConverter.convertStringToLine("____x_oo");
        flips.a1_h1 = LineConverter.convertStringToLine("_____oxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_____xo_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_oxx____");
        assertTrue(check.isValidMove(flips));

        flips.a1_h1 = LineConverter.convertStringToLine("_____ox_");
        flips.a5_e1 = LineConverter.convertStringToLine("_____xo_");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("_____ox_");
        assertTrue(check.isValidMove(flips));
    }
}
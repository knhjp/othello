package fastboard.checkmove.fastcheck.ccolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckC7 checks for valid moves properly
 */
public class FastCheckC7Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckC7 check = new FastCheckC7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xooooo_x");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a7_h7 = LineConverter.convertStringToLine("___xooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("___oox__");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("___xoxxo");
        flips.b8_h2 = LineConverter.convertStringToLine("__ooooox");
        assertFalse(check.isValidMove(flips));
        flips.b8_h2 = LineConverter.convertStringToLine("___oooox");
        assertTrue(check.isValidMove(flips));

        flips.b8_h2 = LineConverter.convertStringToLine("____ooox");
        flips.a5_d8 = LineConverter.convertStringToLine("____xx__");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("____xo__");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckC7 check = new FastCheckC7(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("oxxxxx_o");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a7_h7 = LineConverter.convertStringToLine("___oxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_h7 = LineConverter.convertStringToLine("___xxo__");
        assertTrue(check.isValidMove(flips));

        flips.a7_h7 = LineConverter.convertStringToLine("___oxoox");
        flips.b8_h2 = LineConverter.convertStringToLine("__xxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b8_h2 = LineConverter.convertStringToLine("___xxxxo");
        assertTrue(check.isValidMove(flips));

        flips.b8_h2 = LineConverter.convertStringToLine("____xxxo");
        flips.a5_d8 = LineConverter.convertStringToLine("____oo__");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("____ox__");
        assertTrue(check.isValidMove(flips));
    }
}
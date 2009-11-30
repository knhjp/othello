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
public class FastCheckA4Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckA4 check = new FastCheckA4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xoo__xxx");
        assertTrue(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("xxx_ooox");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a4_e8 = LineConverter.convertStringToLine("__oo__o_");
        assertFalse(check.isValidMove(flips));
        flips.a4_e8 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));

        flips.a4_e8 = LineConverter.convertStringToLine("___oo_xx");
        flips.a4_h4 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("_oox____");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("_xooxoxo");
        flips.a4_d1 = LineConverter.convertStringToLine("____ooox");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("_____oox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckA4 check = new FastCheckA4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("oxx__ooo");
        assertTrue(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("ooo_xxxo");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a4_e8 = LineConverter.convertStringToLine("__xx__x_");
        assertFalse(check.isValidMove(flips));
        flips.a4_e8 = LineConverter.convertStringToLine("____xox_");
        assertTrue(check.isValidMove(flips));

        flips.a4_e8 = LineConverter.convertStringToLine("___xx_oo");
        flips.a4_h4 = LineConverter.convertStringToLine("_oxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("_xxo____");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("_oxxoxox");
        flips.a4_d1 = LineConverter.convertStringToLine("____xxxo");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("_____xxo");
        assertTrue(check.isValidMove(flips));
    }
}
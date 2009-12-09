package fastboard.checkmove.fastcheck.bcolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckB4 checks for valid moves properly
 */
public class FastCheckB4Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckB4 check = new FastCheckB4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xoo__xxx");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xxx_ooox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a3_f8 = LineConverter.convertStringToLine("__oo__o_");
        assertFalse(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));

        flips.a3_f8 = LineConverter.convertStringToLine("___oo_xx");
        flips.a4_h4 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("__oox___");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("__xoxoxo");
        flips.a5_e1 = LineConverter.convertStringToLine("____ooox");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("_____oox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckB4 check = new FastCheckB4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("oxx__ooo");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("ooo_xxxo");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a3_f8 = LineConverter.convertStringToLine("__xx__x_");
        assertFalse(check.isValidMove(flips));
        flips.a3_f8 = LineConverter.convertStringToLine("____xox_");
        assertTrue(check.isValidMove(flips));

        flips.a3_f8 = LineConverter.convertStringToLine("___xx_oo");
        flips.a4_h4 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("__xxo___");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("__oxoxox");
        flips.a5_e1 = LineConverter.convertStringToLine("____xxxo");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("_____xxo");
        assertTrue(check.isValidMove(flips));
    }
}
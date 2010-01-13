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
 * Tests whether or not FastCheckC8 checks for valid moves properly
 */
public class FastCheckD8Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD8 check = new FastCheckD8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xoooooo_");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a8_h8 = LineConverter.convertStringToLine("xxx_xoox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("xoo_____");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_xooxoxo");
        flips.d8_h4 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.d8_h4 = LineConverter.convertStringToLine("____ooox");
        assertTrue(check.isValidMove(flips));

        flips.d8_h4 = LineConverter.convertStringToLine("_____oox");
        flips.a5_d8 = LineConverter.convertStringToLine("_____ox_");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("____xoo_");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckD8 check = new FastCheckD8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("oxxxxxx_");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a8_h8 = LineConverter.convertStringToLine("ooo_oxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("____xxo_");
        assertTrue(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("oxx_____");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_oxxoxox");
        flips.d8_h4 = LineConverter.convertStringToLine("____oxxo");
        assertFalse(check.isValidMove(flips));
        flips.d8_h4 = LineConverter.convertStringToLine("____xxxo");
        assertTrue(check.isValidMove(flips));

        flips.d8_h4 = LineConverter.convertStringToLine("_____xxo");
        flips.a5_d8 = LineConverter.convertStringToLine("_____xo_");
        assertFalse(check.isValidMove(flips));
        flips.a5_d8 = LineConverter.convertStringToLine("____oxx_");
        assertTrue(check.isValidMove(flips));
    }
}
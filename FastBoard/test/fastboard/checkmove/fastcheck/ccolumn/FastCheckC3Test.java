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
 * Tests whether or not FastCheckC3 checks for valid moves properly
 */
public class FastCheckC3Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckC3 check = new FastCheckC3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xo______");
        assertTrue(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("ox_oooox");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a1_h8 = LineConverter.convertStringToLine("_oo__o__");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("___oxoo_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("xo_xxxxx");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("__oo_xxx");
        flips.a3_h3 = LineConverter.convertStringToLine("___xooox");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("___oox__");
        assertTrue(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("xo_xxxx_");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("________");
        flips.a5_e1 = LineConverter.convertStringToLine("_____oox");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("___xo___");
        assertTrue(check.isValidMove(flips));
    }
}
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
 * Tests whether or not FastCheckD3 checks for valid moves properly
 */
public class FastCheckD3Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckD3 check = new FastCheckD3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xo______");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("ox_oooox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.b1_h7 = LineConverter.convertStringToLine("_oo__o__");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("____oxoo");
        assertTrue(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("xoo_xxxx");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("__o__xxx");
        flips.a3_h3 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("xoo_xxx_");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("__xox___");
        flips.a6_f1 = LineConverter.convertStringToLine("_____oox");
        assertFalse(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("___xo___");
        assertTrue(check.isValidMove(flips));
    }
}
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

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckD3 check = new FastCheckD3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("ox______");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xo_xxxxo");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.b1_h7 = LineConverter.convertStringToLine("_xx__x__");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("____xoxx");
        assertTrue(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("oxx_oooo");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("__x__ooo");
        flips.a3_h3 = LineConverter.convertStringToLine("____oxxo");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("____xxo_");
        assertTrue(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("oxx_ooo_");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("__oxo___");
        flips.a6_f1 = LineConverter.convertStringToLine("_____xxo");
        assertFalse(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("______xo");
        assertTrue(check.isValidMove(flips));
        flips.a6_f1 = LineConverter.convertStringToLine("___ox___");
        assertTrue(check.isValidMove(flips));
    }
}
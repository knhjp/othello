package fastboard.checkmove.fastcheck.dcolumn;

import fastboard.FastBoardTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckC4 checks for valid moves properly
 */
public class FastCheckD4Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckD4 check = new FastCheckD4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xoo__xxx");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("xxx_ooox");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a1_h8 = LineConverter.convertStringToLine("__oo__o_");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("____oxo_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("_xo_xxox");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("___oo_xx");
        flips.a4_h4 = LineConverter.convertStringToLine("____xoox");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("____oox_");
        assertTrue(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("xoo_o_xx");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("___xoxxo");
        flips.a7_g1 = LineConverter.convertStringToLine("____ooox");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("_____oox");
        assertTrue(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("__xo____");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckD4 check = new FastCheckD4(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("oxx__ooo");
        assertTrue(check.isValidMove(flips));
        flips.d1_d8 = LineConverter.convertStringToLine("ooo_xxxo");
        assertTrue(check.isValidMove(flips));

        flips.d1_d8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a1_h8 = LineConverter.convertStringToLine("__xx__x_");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("____xox_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("_ox_ooxo");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("___xx_oo");
        flips.a4_h4 = LineConverter.convertStringToLine("____oxxo");
        assertFalse(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("____xxo_");
        assertTrue(check.isValidMove(flips));
        flips.a4_h4 = LineConverter.convertStringToLine("oxx_x_oo");
        assertTrue(check.isValidMove(flips));

        flips.a4_h4 = LineConverter.convertStringToLine("___oxoox");
        flips.a7_g1 = LineConverter.convertStringToLine("____xxxo");
        assertFalse(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("_____xxo");
        assertTrue(check.isValidMove(flips));
        flips.a7_g1 = LineConverter.convertStringToLine("__ox____");
        assertTrue(check.isValidMove(flips));
    }
}
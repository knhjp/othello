package fastboard.checkmove.fastcheck.ccolumn;

import fastboard.FastBoardTestCase;
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
public class FastCheckC3Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
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

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckC3 check = new FastCheckC3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("ox______");
        assertTrue(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xo_xxxxo");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a1_h8 = LineConverter.convertStringToLine("_xx__x__");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("___xoxx_");
        assertTrue(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("ox_ooooo");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("__xx_ooo");
        flips.a3_h3 = LineConverter.convertStringToLine("___oxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("___xxo__");
        assertTrue(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("ox_oooo_");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("________");
        flips.a5_e1 = LineConverter.convertStringToLine("_____xxo");
        assertFalse(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("______xo");
        assertTrue(check.isValidMove(flips));
        flips.a5_e1 = LineConverter.convertStringToLine("___ox___");
        assertTrue(check.isValidMove(flips));
    }
}
package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 29, 2009
 * Time: 02:53:25 PM
 * Tests whether or not FastCheckB3 checks for valid moves properly
 */
public class FastCheckB3Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckB3 check = new FastCheckB3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xo______");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("ox_oooox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a2_g8 = LineConverter.convertStringToLine("_oo__o__");
        assertFalse(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("___oxoo_");
        assertTrue(check.isValidMove(flips));

        flips.a2_g8 = LineConverter.convertStringToLine("__oo_xxx");
        flips.a3_h3 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("__oox___");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("________");
        flips.a4_d1 = LineConverter.convertStringToLine("_____oox");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("______ox");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckB3 check = new FastCheckB3(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("ox______");
        assertTrue(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("xo_xxxxo");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a2_g8 = LineConverter.convertStringToLine("_xx__x__");
        assertFalse(check.isValidMove(flips));
        flips.a2_g8 = LineConverter.convertStringToLine("___xoxx_");
        assertTrue(check.isValidMove(flips));

        flips.a2_g8 = LineConverter.convertStringToLine("__xx_ooo");
        flips.a3_h3 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a3_h3 = LineConverter.convertStringToLine("__xxo___");
        assertTrue(check.isValidMove(flips));

        flips.a3_h3 = LineConverter.convertStringToLine("________");
        flips.a4_d1 = LineConverter.convertStringToLine("_____xxo");
        assertFalse(check.isValidMove(flips));
        flips.a4_d1 = LineConverter.convertStringToLine("______xo");
        assertTrue(check.isValidMove(flips));
    }
}
package fastboard.checkmove.fastcheck.bcolumn;

import fastboard.FastBoardTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckB1 checks for valid moves properly
 */
public class FastCheckB1Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckB1 check = new FastCheckB1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_ooooooo");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.b1_h7 = LineConverter.convertStringToLine("__oo_o__");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("__ooxoo_");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("__oo_xxx");
        flips.a1_h1 = LineConverter.convertStringToLine("__xoooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("__ox____");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(whiteLineDecoders);
        FastCheckB1 check = new FastCheckB1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxxxxx");
        assertFalse(check.isValidMove(flips));
        flips.b1_b8 = LineConverter.convertStringToLine("_xxxxxxo");
        assertTrue(check.isValidMove(flips));

        flips.b1_b8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.b1_h7 = LineConverter.convertStringToLine("__xx_x__");
        assertFalse(check.isValidMove(flips));
        flips.b1_h7 = LineConverter.convertStringToLine("__xxoxx_");
        assertTrue(check.isValidMove(flips));

        flips.b1_h7 = LineConverter.convertStringToLine("__xx_ooo");
        flips.a1_h1 = LineConverter.convertStringToLine("__oxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("__xo____");
        assertTrue(check.isValidMove(flips));
    }
}
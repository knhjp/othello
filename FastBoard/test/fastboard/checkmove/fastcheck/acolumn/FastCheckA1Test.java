package fastboard.checkmove.fastcheck.acolumn;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineconverter.LineConverter;
import fastboard.FastBoardTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 12:59:03 AM
 * Tests whether or not FastCheckA1 checks for valid moves properly
 */
public class FastCheckA1Test extends FastBoardTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValid(blackLineDecoders);
        FastCheckA1 check = new FastCheckA1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_ooooooo");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("_oooooox");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a1_h8 = LineConverter.convertStringToLine("_oo__o__");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("_ooxooo_");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("_oo_xxxx");
        flips.a1_h1 = LineConverter.convertStringToLine("_xooooox");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_ox_____");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckA1 check = new FastCheckA1(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_xxxxxxx");
        assertFalse(check.isValidMove(flips));
        flips.a1_a8 = LineConverter.convertStringToLine("_xxxxxxo");
        assertTrue(check.isValidMove(flips));

        flips.a1_a8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a1_h8 = LineConverter.convertStringToLine("_xx__x__");
        assertFalse(check.isValidMove(flips));
        flips.a1_h8 = LineConverter.convertStringToLine("_xxoxxx_");
        assertTrue(check.isValidMove(flips));

        flips.a1_h8 = LineConverter.convertStringToLine("_xx_oooo");
        flips.a1_h1 = LineConverter.convertStringToLine("_oxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a1_h1 = LineConverter.convertStringToLine("_xo_____");
        assertTrue(check.isValidMove(flips));
    }
}

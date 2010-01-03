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
 * Tests whether or not FastCheckC8 checks for valid moves properly
 */
public class FastCheckC8Test extends OthelloTestCase {
    public void testIsMoveValidBlack() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForBlack();
        FastCheckC8 check = new FastCheckC8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("xoooooox");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("xoooooo_");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_oooo_xo");
        flips.a8_h8 = LineConverter.convertStringToLine("xx_xooox");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("___oox__");
        assertTrue(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("xo______");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_xooxoxo");
        flips.c8_h3 = LineConverter.convertStringToLine("___xooox");
        assertFalse(check.isValidMove(flips));
        flips.c8_h3 = LineConverter.convertStringToLine("___oooox");
        assertTrue(check.isValidMove(flips));
        
        flips.c8_h3 = LineConverter.convertStringToLine("____ooox");
        flips.a6_c8 = LineConverter.convertStringToLine("_____ox_");
        assertFalse(check.isValidMove(flips));
        flips.a6_c8 = LineConverter.convertStringToLine("_____xo_");
        assertTrue(check.isValidMove(flips));
    }

    public void testIsMoveValidWhite() {
        FastCheckCalc calc = new FastCheckCalc();
        boolean[][] fastCheckCalcArray = calc.calcIsMoveValidForWhite();
        FastCheckC8 check = new FastCheckC8(fastCheckCalcArray);

        FastBoardFlips flips = new FastBoardFlips();

        assertFalse(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("oxxxxxxo");
        assertFalse(check.isValidMove(flips));
        flips.c1_c8 = LineConverter.convertStringToLine("oxxxxxx_");
        assertTrue(check.isValidMove(flips));

        flips.c1_c8 = LineConverter.convertStringToLine("_xxxx_ox");
        flips.a8_h8 = LineConverter.convertStringToLine("oo_oxxxo");
        assertFalse(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("___xxo__");
        assertTrue(check.isValidMove(flips));
        flips.a8_h8 = LineConverter.convertStringToLine("ox______");
        assertTrue(check.isValidMove(flips));

        flips.a8_h8 = LineConverter.convertStringToLine("_oxxoxox");
        flips.c8_h3 = LineConverter.convertStringToLine("___oxxxo");
        assertFalse(check.isValidMove(flips));
        flips.c8_h3 = LineConverter.convertStringToLine("___xxxxo");
        assertTrue(check.isValidMove(flips));

        flips.c8_h3 = LineConverter.convertStringToLine("____xxxo");
        flips.a6_c8 = LineConverter.convertStringToLine("_____xo_");
        assertFalse(check.isValidMove(flips));
        flips.a6_c8 = LineConverter.convertStringToLine("_____ox_");
        assertTrue(check.isValidMove(flips));
    }
}
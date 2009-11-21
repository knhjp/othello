package fastboard.checkmove.linedecoder;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 8, 2009
 * Time: 11:51:14 AM
 * This class tests and make sure FastFlipCalcHelper correctly determines whether or not a particular disc is white, black, or empty
 */
public class FastFlipCalcHelper5Test extends OthelloTestCase {
    public void testIsWhite() {
        FastFlipCalcHelper5 helper = new FastFlipCalcHelper5();
        //0 = ________
        assertFalse(helper.isWhite(0));
        //1 = _______x
        assertFalse(helper.isWhite(1));
        //2 = _______o
        assertFalse(helper.isWhite(2));
        //3 = ______x_
        assertFalse(helper.isWhite(3));
        //4 = ______xx
        assertFalse(helper.isWhite(4));
        //5 = ______xo
        assertFalse(helper.isWhite(5));
        //6 = ______o_
        assertFalse(helper.isWhite(6));
        //7 = ______ox
        assertFalse(helper.isWhite(7));
        //8 = ______oo
        assertFalse(helper.isWhite(8));
        //9 = _____x__
        assertFalse(helper.isWhite(9));
        //18 = _____o__
        assertFalse(helper.isWhite(18));
        //27 = ____x___
        assertFalse(helper.isWhite(27));
        //54 = ____o___
        assertFalse(helper.isWhite(54));
        //81 = ___x____
        assertFalse(helper.isWhite(81));
        //162 = ___o____
        assertFalse(helper.isWhite(162));
        //243 = __x_____
        assertFalse(helper.isWhite(243));
        //486 = __o_____
        assertTrue(helper.isWhite(486));
    }

    public void testIsBlack() {
        FastFlipCalcHelper5 helper = new FastFlipCalcHelper5();
        //0 = ________
        assertFalse(helper.isBlack(0));
        //1 = _______x
        assertFalse(helper.isBlack(1));
        //2 = _______o
        assertFalse(helper.isBlack(2));
        //3 = ______x_
        assertFalse(helper.isBlack(3));
        //4 = ______xx
        assertFalse(helper.isBlack(4));
        //5 = ______xo
        assertFalse(helper.isBlack(5));
        //6 = ______o_
        assertFalse(helper.isBlack(6));
        //7 = ______ox
        assertFalse(helper.isBlack(7));
        //8 = ______oo
        assertFalse(helper.isBlack(8));
        //9 = _____x__
        assertFalse(helper.isBlack(9));
        //18 = _____o__
        assertFalse(helper.isBlack(18));
        //27 = ____x___
        assertFalse(helper.isBlack(27));
        //54 = ____o___
        assertFalse(helper.isBlack(54));
        //81 = ___x____
        assertFalse(helper.isBlack(81));
        //162 = ___o____
        assertFalse(helper.isBlack(162));
        //243 = __x_____
        assertTrue(helper.isBlack(243));
        //486 = __o_____
        assertFalse(helper.isBlack(486));
    }

    public void testIsEmpty() {
        FastFlipCalcHelper5 helper = new FastFlipCalcHelper5();
        //0 = ________
        assertTrue(helper.isEmpty(0));
        //1 = _______x
        assertTrue(helper.isEmpty(1));
        //2 = _______o
        assertTrue(helper.isEmpty(2));
        //3 = ______x_
        assertTrue(helper.isEmpty(3));
        //4 = ______xx
        assertTrue(helper.isEmpty(4));
        //5 = ______xo
        assertTrue(helper.isEmpty(5));
        //6 = ______o_
        assertTrue(helper.isEmpty(6));
        //7 = ______ox
        assertTrue(helper.isEmpty(7));
        //8 = ______oo
        assertTrue(helper.isEmpty(8));
        //9 = _____x__
        assertTrue(helper.isEmpty(9));
        //18 = _____o__
        assertTrue(helper.isEmpty(18));
        //27 = ____x___
        assertTrue(helper.isEmpty(27));
        //54 = ____o___
        assertTrue(helper.isEmpty(54));
        //81 = ___x____
        assertTrue(helper.isEmpty(81));
        //162 = ___o____
        assertTrue(helper.isEmpty(162));
        //243 = __x_____
        assertFalse(helper.isEmpty(243));
        //486 = __o_____
        assertFalse(helper.isEmpty(486));
    }
}
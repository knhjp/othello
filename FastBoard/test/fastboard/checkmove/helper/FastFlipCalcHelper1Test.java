package fastboard.checkmove.helper;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 8, 2009
 * Time: 11:51:14 AM
 * This class tests and make sure FastFlipCalcHelper correctly determines whether or not a particular disc is white, black, or empty
 */
public class FastFlipCalcHelper1Test extends OthelloTestCase {
    public void testIsWhite() {
        FastFlipCalcHelper1 helper = new FastFlipCalcHelper1();
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
        assertTrue(helper.isWhite(6));
        //7 = ______ox
        assertTrue(helper.isWhite(7));
        //8 = ______oo
        assertTrue(helper.isWhite(8));
    }

    public void testIsBlack() {
        FastFlipCalcHelper1 helper = new FastFlipCalcHelper1();
        //0 = ________
        assertFalse(helper.isBlack(0));
        //1 = _______x
        assertFalse(helper.isBlack(1));
        //2 = _______o
        assertFalse(helper.isBlack(2));
        //3 = ______x_
        assertTrue(helper.isBlack(3));
        //4 = ______xx
        assertTrue(helper.isBlack(4));
        //5 = ______xo
        assertTrue(helper.isBlack(5));
        //6 = ______o_
        assertFalse(helper.isBlack(6));
        //7 = ______ox
        assertFalse(helper.isBlack(7));
        //8 = ______oo
        assertFalse(helper.isBlack(8));
    }

    public void testIsEmpty() {
        FastFlipCalcHelper1 helper = new FastFlipCalcHelper1();
        //0 = ________
        assertTrue(helper.isEmpty(0));
        //1 = _______x
        assertTrue(helper.isEmpty(1));
        //2 = _______o
        assertTrue(helper.isEmpty(2));
        //3 = ______x_
        assertFalse(helper.isEmpty(3));
        //4 = ______xx
        assertFalse(helper.isEmpty(4));
        //5 = ______xo
        assertFalse(helper.isEmpty(5));
        //6 = ______o_
        assertFalse(helper.isEmpty(6));
        //7 = ______ox
        assertFalse(helper.isEmpty(7));
        //8 = ______oo
        assertFalse(helper.isEmpty(8));
    }
}
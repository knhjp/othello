package fastboard.checkmove.linedecoder;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 8, 2009
 * Time: 11:51:14 AM
 * This class tests and make sure FastFlipCalcHelper correctly determines whether or not a particular disc is white, black, or empty 
 */
public class FastFlipCalcHelper0Test extends OthelloTestCase {
    public void testIsWhite() {
        FastFlipCalcHelper0 helper = new FastFlipCalcHelper0();
        //0 = ________
        assertFalse(helper.isWhite(0));
        //1 = _______x
        assertFalse(helper.isWhite(1));
        //2 = _______o
        assertTrue(helper.isWhite(2));
        //3 = ______x_
        assertFalse(helper.isWhite(3));
        //4 = ______xx
        assertFalse(helper.isWhite(4));
        //5 = ______xo
        assertTrue(helper.isWhite(5));
    }

    public void testIsBlack() {
        FastFlipCalcHelper0 helper = new FastFlipCalcHelper0();
        //0 = ________
        assertFalse(helper.isBlack(0));
        //1 = _______x
        assertTrue(helper.isBlack(1));
        //2 = _______o
        assertFalse(helper.isBlack(2));
        //3 = ______x_
        assertFalse(helper.isBlack(3));
        //4 = ______xx
        assertTrue(helper.isBlack(4));
        //5 = ______xo
        assertFalse(helper.isBlack(5));
    }

    public void testIsEmpty() {
        FastFlipCalcHelper0 helper = new FastFlipCalcHelper0();
        //0 = ________
        assertTrue(helper.isEmpty(0));
        //1 = _______x
        assertFalse(helper.isEmpty(1));
        //2 = _______o
        assertFalse(helper.isEmpty(2));
        //3 = ______x_
        assertTrue(helper.isEmpty(3));
        //4 = ______xx
        assertFalse(helper.isEmpty(4));
        //5 = ______xo
        assertFalse(helper.isEmpty(5));
    }
}

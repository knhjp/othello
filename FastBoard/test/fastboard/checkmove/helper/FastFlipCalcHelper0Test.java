package fastboard.checkmove.helper;

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
    }
}

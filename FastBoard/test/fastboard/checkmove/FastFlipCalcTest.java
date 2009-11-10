package fastboard.checkmove;

import base.testcase.OthelloTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 10-Nov-2009
 * Time: 3:09:58 PM
 * This tests FastFlipCalc to make sure the arrays that it produced seems valid
 */
public class FastFlipCalcTest extends OthelloTestCase {
    public void testIsMoveValidForBlackForThisLine() {
        FastFlipCalc calc = new FastFlipCalc();

        int line;
        int index;
        //0 = ________

        line = 0;
        index = 0;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));
        // 15 = _____xo_
        line = 15;
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        // 51 = ____xoo_
        line = 51;
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        index = 1;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));

        // 47 = ____xo_o
        line = 47;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        // 723 = __oooox_ (3+18+54+162+486)
        line = 723;
        index = 0;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));
    }
}

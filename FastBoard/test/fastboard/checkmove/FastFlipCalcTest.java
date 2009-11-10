package fastboard.checkmove;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

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

        line = LineConverter.convertStringToLine("________");
        index = 0;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("_____xo_");
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("____xoo_");
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        index = 1;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("____xo_o");
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("__oooox_");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,0));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,1));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,2));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,3));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,4));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,5));
        assertTrue(calc.isMoveValidForBlackForThisLine(line,6));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,7));

        //test overflow
        line = LineConverter.convertStringToLine("___ooooo");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,5));

        line = LineConverter.convertStringToLine("ooooooo_");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,0));
    }

    public void testCalcIsMoveValidForBlack() {
        FastFlipCalc calc = new FastFlipCalc();

        boolean[][] result = calc.calcIsMoveValidForBlack();

        int line = LineConverter.convertStringToLine("xoo__oox");
        assertFalse(result[0][line]);
        assertFalse(result[1][line]);
        assertFalse(result[2][line]);
        assertTrue(result[3][line]);
        assertTrue(result[4][line]);
        assertFalse(result[5][line]);
        assertFalse(result[6][line]);
        assertFalse(result[7][line]);

    }
}

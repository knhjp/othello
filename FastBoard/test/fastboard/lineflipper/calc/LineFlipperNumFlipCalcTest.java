package fastboard.lineflipper.calc;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 10, 2010
 * Time: 1:59:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineFlipperNumFlipCalcTest extends OthelloTestCase {
    public void testNumFlipForBlackForThisLine() {
        LineFlipperNumFlipCalc calc = new LineFlipperNumFlipCalc();

        int line;
        int index;
        NumFlip numFlip;

        line = LineConverter.convertStringToLine("________");
        index = 0;
        numFlip = calc.numFlipForBlackForThisLine(line, index);
        assertEquals(0,numFlip.upNum);
        assertEquals(0,numFlip.downNum);

        line = LineConverter.convertStringToLine("_____xo_");
        index = 0;
        numFlip = calc.numFlipForBlackForThisLine(line, index);
        assertEquals(1,numFlip.upNum);
        assertEquals(0,numFlip.downNum);
    }
}

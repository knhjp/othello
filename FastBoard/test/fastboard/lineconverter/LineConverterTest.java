package fastboard.lineconverter;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.calc.FastCheckCalc;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 10-Nov-2009
 * Time: 4:53:35 PM
 * This makes sure LineConverter does what it is supposed to
 */
public class LineConverterTest extends OthelloTestCase {
    public void testConvertLineToString() {
        assertEquals("________",LineConverter.convertLineToString(0));
        assertEquals("_____xo_",LineConverter.convertLineToString(15));
        assertEquals("____xoo_",LineConverter.convertLineToString(51));
        assertEquals("____xo_o",LineConverter.convertLineToString(47));
        assertEquals("__oooox_",LineConverter.convertLineToString(723));
        assertEquals("___ooooo",LineConverter.convertLineToString(242));
        assertEquals("ooooooo_",LineConverter.convertLineToString(6558));
    }

    public void testConvertStringToLineConsistentWithConvertLineToString() {
        for (int i=0 ; i< FastCheckCalc.threeToTheEighth ; i++) {
            String str = LineConverter.convertLineToString(i);
            assertEquals(i,LineConverter.convertStringToLine(str));
        }

    }
}

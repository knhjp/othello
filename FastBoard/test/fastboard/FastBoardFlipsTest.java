package fastboard;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 1:03:18 AM
 * This class tests whether or not FastBoardFlip does what it is supposed to do
 */
public class FastBoardFlipsTest extends OthelloTestCase {
    public void testBlackPlaceA1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.a1_a8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.blackPlaceA1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.a1_a8));
        assertEquals("x_______", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("x_______", LineConverter.convertLineToString(flips.a1_h1));
    }

    public void testWhitePlaceA1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.a1_a8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.whitePlaceA1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.a1_a8));
        assertEquals("o_______", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("o_______", LineConverter.convertLineToString(flips.a1_h1));
    }
}

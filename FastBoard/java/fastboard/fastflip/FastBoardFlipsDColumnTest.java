package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Dec 9, 2009
 * Time: 8:37:37 PM
 * This tests whether or not we are dealing with flipping and placing discs on the d column properly
 */
public class FastBoardFlipsDColumnTest  extends OthelloTestCase {
    public void testClackPlaceD1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.blackPlaceD1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testClackFlipD1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.d1_d8 = LineConverter.convertStringToLine("o_______");
        flips.d1_h5 = LineConverter.convertStringToLine("___o____");
        flips.a1_h1 = LineConverter.convertStringToLine("___o____");
        flips.a4_d1 = LineConverter.convertStringToLine("_______o");

        flips.blackFlipD1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testWhitePlaceD1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.whitePlaceD1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testWhiteFlipD1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.d1_d8 = LineConverter.convertStringToLine("x_______");
        flips.d1_h5 = LineConverter.convertStringToLine("___x____");
        flips.a1_h1 = LineConverter.convertStringToLine("___x____");
        flips.a4_d1 = LineConverter.convertStringToLine("_______x");

        flips.whiteFlipD1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a4_d1));
    }
}

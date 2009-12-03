package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Dec 2, 2009
 * Time: 8:47:33 AM
 * This class tests whether or not FastBoardFlip does what it is supposed to do for column C
 */
public class FastBoardFlipsCColumnTest extends OthelloTestCase {
    public void testClackPlaceC1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_c1));

        flips.blackPlaceC1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a3_c1));
    }

    public void testClackFlipC1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_c1));

        flips.c1_c8 = LineConverter.convertStringToLine("o_______");
        flips.c1_h6 = LineConverter.convertStringToLine("__o_____");
        flips.a1_h1 = LineConverter.convertStringToLine("__o_____");
        flips.a3_c1 = LineConverter.convertStringToLine("_______o");

        flips.blackFlipC1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a3_c1));
    }

    public void testWhitePlaceC1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_c1));

        flips.whitePlaceC1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a3_c1));
    }

    public void testWhiteFlipC1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_c1));

        flips.c1_c8 = LineConverter.convertStringToLine("x_______");
        flips.c1_h6 = LineConverter.convertStringToLine("__x_____");
        flips.a1_h1 = LineConverter.convertStringToLine("__x_____");
        flips.a3_c1 = LineConverter.convertStringToLine("_______x");

        flips.whiteFlipC1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a3_c1));
    }


}
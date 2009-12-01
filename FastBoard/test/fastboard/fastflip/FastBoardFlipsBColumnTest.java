package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 22, 2009
 * Time: 1:03:18 AM
 * This class tests whether or not FastBoardFlip does what it is supposed to do for column B
 */
public class FastBoardFlipsBColumnTest extends OthelloTestCase {
    public void testBlackPlaceB1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.blackPlaceB1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("_x______", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("_x______", LineConverter.convertLineToString(flips.a1_h1));
    }

    public void testBlackFlipB1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.b1_b8 = LineConverter.convertStringToLine("o_______");
        flips.b1_h7 = LineConverter.convertStringToLine("_o______");
        flips.a1_h1 = LineConverter.convertStringToLine("_o______");

        flips.blackFlipB1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("_x______", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("_x______", LineConverter.convertLineToString(flips.a1_h1));
    }

    public void testWhitePlaceB1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.whitePlaceB1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("_o______", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("_o______", LineConverter.convertLineToString(flips.a1_h1));
    }

    public void testWhiteFlipB1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));

        flips.b1_b8 = LineConverter.convertStringToLine("x_______");
        flips.b1_h7 = LineConverter.convertStringToLine("_x______");
        flips.a1_h1 = LineConverter.convertStringToLine("_x______");

        flips.whiteFlipB1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.b1_b8));
        assertEquals("_o______", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("_o______", LineConverter.convertLineToString(flips.a1_h1));
    }

}
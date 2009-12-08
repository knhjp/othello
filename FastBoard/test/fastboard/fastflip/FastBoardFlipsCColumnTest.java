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

    public void testClackPlaceC2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.blackPlaceC2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testClackFlipC2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.c1_c8 = LineConverter.convertStringToLine("_o______");
        flips.b1_h7 = LineConverter.convertStringToLine("__o_____");
        flips.a2_h2 = LineConverter.convertStringToLine("__o_____");
        flips.a4_d1 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipC2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testWhitePlaceC2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.whitePlaceC2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testWhiteFlipC2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_d1));

        flips.c1_c8 = LineConverter.convertStringToLine("_x______");
        flips.b1_h7 = LineConverter.convertStringToLine("__x_____");
        flips.a2_h2 = LineConverter.convertStringToLine("__x_____");
        flips.a4_d1 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipC2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_d1));
    }

    public void testClackPlaceC3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.blackPlaceC3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testClackFlipC3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.c1_c8 = LineConverter.convertStringToLine("__o_____");
        flips.a1_h8 = LineConverter.convertStringToLine("__o_____");
        flips.a3_h3 = LineConverter.convertStringToLine("__o_____");
        flips.a5_e1 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipC3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhitePlaceC3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.whitePlaceC3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhiteFlipC3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.c1_c8 = LineConverter.convertStringToLine("__x_____");
        flips.a1_h8 = LineConverter.convertStringToLine("__x_____");
        flips.a3_h3 = LineConverter.convertStringToLine("__x_____");
        flips.a5_e1 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipC3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a5_e1));
    }
}
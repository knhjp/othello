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

    public void testClackPlaceD2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.blackPlaceD2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testClackFlipD2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.d1_d8 = LineConverter.convertStringToLine("_o______");
        flips.c1_h6 = LineConverter.convertStringToLine("___o____");
        flips.a2_h2 = LineConverter.convertStringToLine("___o____");
        flips.a5_e1 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipD2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhitePlaceD2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.whitePlaceD2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhiteFlipD2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.d1_d8 = LineConverter.convertStringToLine("_x______");
        flips.c1_h6 = LineConverter.convertStringToLine("___x____");
        flips.a2_h2 = LineConverter.convertStringToLine("___x____");
        flips.a5_e1 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipD2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testClackPlaceD3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.blackPlaceD3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testClackFlipD3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.d1_d8 = LineConverter.convertStringToLine("__o_____");
        flips.b1_h7 = LineConverter.convertStringToLine("___o____");
        flips.a3_h3 = LineConverter.convertStringToLine("___o____");
        flips.a6_f1 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipD3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhitePlaceD3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.whitePlaceD3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhiteFlipD3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.d1_d8 = LineConverter.convertStringToLine("__x_____");
        flips.b1_h7 = LineConverter.convertStringToLine("___x____");
        flips.a3_h3 = LineConverter.convertStringToLine("___x____");
        flips.a6_f1 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipD3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a6_f1));
    }
}

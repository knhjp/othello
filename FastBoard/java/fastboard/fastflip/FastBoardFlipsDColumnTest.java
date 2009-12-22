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

    public void testClackPlaceD4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.blackPlaceD4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackFlipD4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.d1_d8 = LineConverter.convertStringToLine("___o____");
        flips.a1_h8 = LineConverter.convertStringToLine("___o____");
        flips.a4_h4 = LineConverter.convertStringToLine("___o____");
        flips.a7_g1 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipD4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhitePlaceD4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.whitePlaceD4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhiteFlipD4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.d1_d8 = LineConverter.convertStringToLine("___x____");
        flips.a1_h8 = LineConverter.convertStringToLine("___x____");
        flips.a4_h4 = LineConverter.convertStringToLine("___x____");
        flips.a7_g1 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipD4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackPlaceD5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.blackPlaceD5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackFlipD5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.d1_d8 = LineConverter.convertStringToLine("____o___");
        flips.a2_g8 = LineConverter.convertStringToLine("____o___");
        flips.a5_h5 = LineConverter.convertStringToLine("___o____");
        flips.a8_h1 = LineConverter.convertStringToLine("___o____");

        flips.blackFlipD5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhitePlaceD5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.whitePlaceD5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhiteFlipD5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.d1_d8 = LineConverter.convertStringToLine("____x___");
        flips.a2_g8 = LineConverter.convertStringToLine("____x___");
        flips.a5_h5 = LineConverter.convertStringToLine("___x____");
        flips.a8_h1 = LineConverter.convertStringToLine("___x____");

        flips.whiteFlipD5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackPlaceD6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.blackPlaceD6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("___x____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackFlipD6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.d1_d8 = LineConverter.convertStringToLine("_____o__");
        flips.a3_f8 = LineConverter.convertStringToLine("_____o__");
        flips.a6_h6 = LineConverter.convertStringToLine("___o____");
        flips.b8_h2 = LineConverter.convertStringToLine("___o____");

        flips.blackFlipD6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("___x____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhitePlaceD6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.whitePlaceD6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("___o____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhiteFlipD6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.d1_d8 = LineConverter.convertStringToLine("_____x__");
        flips.a3_f8 = LineConverter.convertStringToLine("_____x__");
        flips.a6_h6 = LineConverter.convertStringToLine("___x____");
        flips.b8_h2 = LineConverter.convertStringToLine("___x____");

        flips.whiteFlipD6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("___o____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackPlaceD7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.blackPlaceD7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("___x____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackFlipD7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.d1_d8 = LineConverter.convertStringToLine("______o_");
        flips.a4_e8 = LineConverter.convertStringToLine("______o_");
        flips.a7_h7 = LineConverter.convertStringToLine("___o____");
        flips.c8_h3 = LineConverter.convertStringToLine("___o____");

        flips.blackFlipD7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("___x____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhitePlaceD7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.whitePlaceD7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("___o____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhiteFlipD7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.d1_d8 = LineConverter.convertStringToLine("______x_");
        flips.a4_e8 = LineConverter.convertStringToLine("______x_");
        flips.a7_h7 = LineConverter.convertStringToLine("___x____");
        flips.c8_h3 = LineConverter.convertStringToLine("___x____");

        flips.whiteFlipD7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.d1_d8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("___o____", LineConverter.convertLineToString(flips.c8_h3));
    }
}
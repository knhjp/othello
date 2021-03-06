package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Dec 9, 2009
 * Time: 8:37:37 PM
 * This tests whether or not we are dealing with flipping and placing discs on the e column properly
 */
public class FastBoardFlipsEColumnTest extends OthelloTestCase {
    public void testClackPlaceE1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.blackPlaceE1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testClackFlipE1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.e1_e8 = LineConverter.convertStringToLine("o_______");
        flips.e1_h4 = LineConverter.convertStringToLine("____o___");
        flips.a1_h1 = LineConverter.convertStringToLine("____o___");
        flips.a5_e1 = LineConverter.convertStringToLine("_______o");

        flips.blackFlipE1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhitePlaceE1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.whitePlaceE1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testWhiteFlipE1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_e1));

        flips.e1_e8 = LineConverter.convertStringToLine("x_______");
        flips.e1_h4 = LineConverter.convertStringToLine("____x___");
        flips.a1_h1 = LineConverter.convertStringToLine("____x___");
        flips.a5_e1 = LineConverter.convertStringToLine("_______x");

        flips.whiteFlipE1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a5_e1));
    }

    public void testClackPlaceE2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.blackPlaceE2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testClackFlipE2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.e1_e8 = LineConverter.convertStringToLine("_o______");
        flips.d1_h5 = LineConverter.convertStringToLine("____o___");
        flips.a2_h2 = LineConverter.convertStringToLine("____o___");
        flips.a6_f1 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipE2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhitePlaceE2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.whitePlaceE2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhiteFlipE2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.e1_e8 = LineConverter.convertStringToLine("_x______");
        flips.d1_h5 = LineConverter.convertStringToLine("____x___");
        flips.a2_h2 = LineConverter.convertStringToLine("____x___");
        flips.a6_f1 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipE2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testClackPlaceE3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.blackPlaceE3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackFlipE3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.e1_e8 = LineConverter.convertStringToLine("__o_____");
        flips.c1_h6 = LineConverter.convertStringToLine("____o___");
        flips.a3_h3 = LineConverter.convertStringToLine("____o___");
        flips.a7_g1 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipE3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhitePlaceE3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.whitePlaceE3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhiteFlipE3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.e1_e8 = LineConverter.convertStringToLine("__x_____");
        flips.c1_h6 = LineConverter.convertStringToLine("____x___");
        flips.a3_h3 = LineConverter.convertStringToLine("____x___");
        flips.a7_g1 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipE3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackPlaceE4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.blackPlaceE4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackFlipE4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.e1_e8 = LineConverter.convertStringToLine("___o____");
        flips.b1_h7 = LineConverter.convertStringToLine("____o___");
        flips.a4_h4 = LineConverter.convertStringToLine("____o___");
        flips.a8_h1 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipE4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhitePlaceE4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.whitePlaceE4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhiteFlipE4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.e1_e8 = LineConverter.convertStringToLine("___x____");
        flips.b1_h7 = LineConverter.convertStringToLine("____x___");
        flips.a4_h4 = LineConverter.convertStringToLine("____x___");
        flips.a8_h1 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipE4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackPlaceE5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.blackPlaceE5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("____x___", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackFlipE5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.e1_e8 = LineConverter.convertStringToLine("____o___");
        flips.a1_h8 = LineConverter.convertStringToLine("____o___");
        flips.a5_h5 = LineConverter.convertStringToLine("____o___");
        flips.b8_h2 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipE5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("____x___", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhitePlaceE5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.whitePlaceE5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("____o___", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhiteFlipE5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.e1_e8 = LineConverter.convertStringToLine("____x___");
        flips.a1_h8 = LineConverter.convertStringToLine("____x___");
        flips.a5_h5 = LineConverter.convertStringToLine("____x___");
        flips.b8_h2 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipE5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("____o___", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackPlaceE6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.blackPlaceE6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("____x___", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackFlipE6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.e1_e8 = LineConverter.convertStringToLine("_____o__");
        flips.a2_g8 = LineConverter.convertStringToLine("_____o__");
        flips.a6_h6 = LineConverter.convertStringToLine("____o___");
        flips.c8_h3 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipE6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("____x___", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhitePlaceE6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.whitePlaceE6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("____o___", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhiteFlipE6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.e1_e8 = LineConverter.convertStringToLine("_____x__");
        flips.a2_g8 = LineConverter.convertStringToLine("_____x__");
        flips.a6_h6 = LineConverter.convertStringToLine("____x___");
        flips.c8_h3 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipE6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("____o___", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackPlaceE7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.blackPlaceE7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("____x___", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackFlipE7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.e1_e8 = LineConverter.convertStringToLine("______o_");
        flips.a3_f8 = LineConverter.convertStringToLine("______o_");
        flips.a7_h7 = LineConverter.convertStringToLine("____o___");
        flips.d8_h4 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipE7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("____x___", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhitePlaceE7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.whitePlaceE7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("____o___", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhiteFlipE7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.e1_e8 = LineConverter.convertStringToLine("______x_");
        flips.a3_f8 = LineConverter.convertStringToLine("______x_");
        flips.a7_h7 = LineConverter.convertStringToLine("____x___");
        flips.d8_h4 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipE7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("____o___", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackPlaceE8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.blackPlaceE8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testClackFlipE8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.e1_e8 = LineConverter.convertStringToLine("_______o");
        flips.a4_e8 = LineConverter.convertStringToLine("_______o");
        flips.a8_h8 = LineConverter.convertStringToLine("____o___");
        flips.e8_h5 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipE8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhitePlaceE8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.whitePlaceE8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhiteFlipE8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.e1_e8 = LineConverter.convertStringToLine("_______x");
        flips.a4_e8 = LineConverter.convertStringToLine("_______x");
        flips.a8_h8 = LineConverter.convertStringToLine("____x___");
        flips.e8_h5 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipE8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.e1_e8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.e8_h5));
    }
}
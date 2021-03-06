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

    public void testClackPlaceC4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.blackPlaceC4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testClackFlipC4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.c1_c8 = LineConverter.convertStringToLine("___o____");
        flips.a2_g8 = LineConverter.convertStringToLine("___o____");
        flips.a4_h4 = LineConverter.convertStringToLine("__o_____");
        flips.a6_f1 = LineConverter.convertStringToLine("____o___");

        flips.blackFlipC4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhitePlaceC4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.whitePlaceC4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testWhiteFlipC4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_f1));

        flips.c1_c8 = LineConverter.convertStringToLine("___x____");
        flips.a2_g8 = LineConverter.convertStringToLine("___x____");
        flips.a4_h4 = LineConverter.convertStringToLine("__x_____");
        flips.a6_f1 = LineConverter.convertStringToLine("____x___");

        flips.whiteFlipC4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a6_f1));
    }

    public void testClackPlaceC5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.blackPlaceC5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackFlipC5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.c1_c8 = LineConverter.convertStringToLine("____o___");
        flips.a3_f8 = LineConverter.convertStringToLine("____o___");
        flips.a5_h5 = LineConverter.convertStringToLine("__o_____");
        flips.a7_g1 = LineConverter.convertStringToLine("___o____");

        flips.blackFlipC5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("____x___", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___x____", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhitePlaceC5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.whitePlaceC5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhiteFlipC5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.c1_c8 = LineConverter.convertStringToLine("____x___");
        flips.a3_f8 = LineConverter.convertStringToLine("____x___");
        flips.a5_h5 = LineConverter.convertStringToLine("__x_____");
        flips.a7_g1 = LineConverter.convertStringToLine("___x____");

        flips.whiteFlipC5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("____o___", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("___o____", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackPlaceC6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.blackPlaceC6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackFlipC6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.c1_c8 = LineConverter.convertStringToLine("_____o__");
        flips.a4_e8 = LineConverter.convertStringToLine("_____o__");
        flips.a6_h6 = LineConverter.convertStringToLine("__o_____");
        flips.a8_h1 = LineConverter.convertStringToLine("__o_____");

        flips.blackFlipC6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhitePlaceC6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.whitePlaceC6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhiteFlipC6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.c1_c8 = LineConverter.convertStringToLine("_____x__");
        flips.a4_e8 = LineConverter.convertStringToLine("_____x__");
        flips.a6_h6 = LineConverter.convertStringToLine("__x_____");
        flips.a8_h1 = LineConverter.convertStringToLine("__x_____");

        flips.whiteFlipC6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a4_e8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackPlaceC7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.blackPlaceC7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackFlipC7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.c1_c8 = LineConverter.convertStringToLine("______o_");
        flips.a5_d8 = LineConverter.convertStringToLine("______o_");
        flips.a7_h7 = LineConverter.convertStringToLine("__o_____");
        flips.b8_h2 = LineConverter.convertStringToLine("__o_____");

        flips.blackFlipC7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhitePlaceC7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.whitePlaceC7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhiteFlipC7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.c1_c8 = LineConverter.convertStringToLine("______x_");
        flips.a5_d8 = LineConverter.convertStringToLine("______x_");
        flips.a7_h7 = LineConverter.convertStringToLine("__x_____");
        flips.b8_h2 = LineConverter.convertStringToLine("__x_____");

        flips.whiteFlipC7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_d8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackPlaceC8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.blackPlaceC8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackFlipC8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.c1_c8 = LineConverter.convertStringToLine("_______o");
        flips.a6_c8 = LineConverter.convertStringToLine("_______o");
        flips.a8_h8 = LineConverter.convertStringToLine("__o_____");
        flips.c8_h3 = LineConverter.convertStringToLine("__o_____");

        flips.blackFlipC8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("__x_____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhitePlaceC8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.whitePlaceC8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhiteFlipC8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.c1_c8 = LineConverter.convertStringToLine("_______x");
        flips.a6_c8 = LineConverter.convertStringToLine("_______x");
        flips.a8_h8 = LineConverter.convertStringToLine("__x_____");
        flips.c8_h3 = LineConverter.convertStringToLine("__x_____");

        flips.whiteFlipC8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.c1_c8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a6_c8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("__o_____", LineConverter.convertLineToString(flips.c8_h3));
    }
}
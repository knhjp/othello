package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Dec 9, 2009
 * Time: 8:37:37 PM
 * This tests whether or not we are dealing with flipping and placing discs on the g column properly
 */
public class FastBoardFlipsGColumnTest extends OthelloTestCase {
    public void testClackPlaceG1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.blackPlaceG1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackFlipG1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.g1_g8 = LineConverter.convertStringToLine("o_______");
        flips.a1_h1 = LineConverter.convertStringToLine("______o_");
        flips.a7_g1 = LineConverter.convertStringToLine("_______o");

        flips.blackFlipG1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhitePlaceG1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.whitePlaceG1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testWhiteFlipG1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_g1));

        flips.g1_g8 = LineConverter.convertStringToLine("x_______");
        flips.a1_h1 = LineConverter.convertStringToLine("______x_");
        flips.a7_g1 = LineConverter.convertStringToLine("_______x");

        flips.whiteFlipG1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a7_g1));
    }

    public void testClackPlaceG2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.blackPlaceG2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackFlipG2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.g1_g8 = LineConverter.convertStringToLine("_o______");
        flips.f1_h3 = LineConverter.convertStringToLine("______o_");
        flips.a2_h2 = LineConverter.convertStringToLine("______o_");
        flips.a8_h1 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG2();

        assertEquals("_x______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhitePlaceG2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.whitePlaceG2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhiteFlipG2() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.g1_g8 = LineConverter.convertStringToLine("_x______");
        flips.f1_h3 = LineConverter.convertStringToLine("______x_");
        flips.a2_h2 = LineConverter.convertStringToLine("______x_");
        flips.a8_h1 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG2();

        assertEquals("_o______", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.f1_h3));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a2_h2));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testClackPlaceG3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.blackPlaceG3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("______x_", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackFlipG3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.g1_g8 = LineConverter.convertStringToLine("__o_____");
        flips.e1_h4 = LineConverter.convertStringToLine("______o_");
        flips.a3_h3 = LineConverter.convertStringToLine("______o_");
        flips.b8_h2 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG3();

        assertEquals("__x_____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("______x_", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhitePlaceG3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.whitePlaceG3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("______o_", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testWhiteFlipG3() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("________", LineConverter.convertLineToString(flips.b8_h2));

        flips.g1_g8 = LineConverter.convertStringToLine("__x_____");
        flips.e1_h4 = LineConverter.convertStringToLine("______x_");
        flips.a3_h3 = LineConverter.convertStringToLine("______x_");
        flips.b8_h2 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG3();

        assertEquals("__o_____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.e1_h4));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a3_h3));
        assertEquals("______o_", LineConverter.convertLineToString(flips.b8_h2));
    }

    public void testClackPlaceG4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.blackPlaceG4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("______x_", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackFlipG4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.g1_g8 = LineConverter.convertStringToLine("___o____");
        flips.d1_h5 = LineConverter.convertStringToLine("______o_");
        flips.a4_h4 = LineConverter.convertStringToLine("______o_");
        flips.c8_h3 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG4();

        assertEquals("___x____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("______x_", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhitePlaceG4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.whitePlaceG4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("______o_", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testWhiteFlipG4() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("________", LineConverter.convertLineToString(flips.c8_h3));

        flips.g1_g8 = LineConverter.convertStringToLine("___x____");
        flips.d1_h5 = LineConverter.convertStringToLine("______x_");
        flips.a4_h4 = LineConverter.convertStringToLine("______x_");
        flips.c8_h3 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG4();

        assertEquals("___o____", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.d1_h5));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a4_h4));
        assertEquals("______o_", LineConverter.convertLineToString(flips.c8_h3));
    }

    public void testClackPlaceG5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.blackPlaceG5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("______x_", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackFlipG5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.g1_g8 = LineConverter.convertStringToLine("____o___");
        flips.c1_h6 = LineConverter.convertStringToLine("______o_");
        flips.a5_h5 = LineConverter.convertStringToLine("______o_");
        flips.d8_h4 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG5();

        assertEquals("____x___", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("______x_", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhitePlaceG5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.whitePlaceG5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("______o_", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhiteFlipG5() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.g1_g8 = LineConverter.convertStringToLine("____x___");
        flips.c1_h6 = LineConverter.convertStringToLine("______x_");
        flips.a5_h5 = LineConverter.convertStringToLine("______x_");
        flips.d8_h4 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG5();

        assertEquals("____o___", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.c1_h6));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a5_h5));
        assertEquals("______o_", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackPlaceF6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.blackPlaceF6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackFlipF6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.f1_f8 = LineConverter.convertStringToLine("_____o__");
        flips.a1_h8 = LineConverter.convertStringToLine("_____o__");
        flips.a6_h6 = LineConverter.convertStringToLine("_____o__");
        flips.d8_h4 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipF6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhitePlaceF6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.whitePlaceF6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testWhiteFlipF6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.d8_h4));

        flips.f1_f8 = LineConverter.convertStringToLine("_____x__");
        flips.a1_h8 = LineConverter.convertStringToLine("_____x__");
        flips.a6_h6 = LineConverter.convertStringToLine("_____x__");
        flips.d8_h4 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipF6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.d8_h4));
    }

    public void testClackPlaceF7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.blackPlaceF7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testClackFlipF7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.f1_f8 = LineConverter.convertStringToLine("______o_");
        flips.a2_g8 = LineConverter.convertStringToLine("______o_");
        flips.a7_h7 = LineConverter.convertStringToLine("_____o__");
        flips.e8_h5 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipF7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhitePlaceF7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.whitePlaceF7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhiteFlipF7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.f1_f8 = LineConverter.convertStringToLine("______x_");
        flips.a2_g8 = LineConverter.convertStringToLine("______x_");
        flips.a7_h7 = LineConverter.convertStringToLine("_____x__");
        flips.e8_h5 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipF7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testClackPlaceF8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.blackPlaceF8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testClackFlipF8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.f1_f8 = LineConverter.convertStringToLine("_______o");
        flips.a3_f8 = LineConverter.convertStringToLine("_______o");
        flips.a8_h8 = LineConverter.convertStringToLine("_____o__");
        flips.f8_h6 = LineConverter.convertStringToLine("_____o__");

        flips.blackFlipF8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("_____x__", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testWhitePlaceF8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.whitePlaceF8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testWhiteFlipF8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.f1_f8 = LineConverter.convertStringToLine("_______x");
        flips.a3_f8 = LineConverter.convertStringToLine("_______x");
        flips.a8_h8 = LineConverter.convertStringToLine("_____x__");
        flips.f8_h6 = LineConverter.convertStringToLine("_____x__");

        flips.whiteFlipF8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.f1_f8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a3_f8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.a8_h8));
        assertEquals("_____o__", LineConverter.convertLineToString(flips.f8_h6));
    }
}
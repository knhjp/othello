package fastboard.fastflip;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Dec 9, 2009
 * Time: 8:37:37 PM
 * This tests whether or not we are dealing with flipping and placing discs on the h column properly
 */
public class FastBoardFlipsHColumnTest extends OthelloTestCase {
    public void testClackPlaceH1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.h1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.blackPlaceH1();

        assertEquals("x_______", LineConverter.convertLineToString(flips.h1_h8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a8_h1));
    }

    public void testWhitePlaceH1() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.h1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h1));

        flips.whitePlaceH1();

        assertEquals("o_______", LineConverter.convertLineToString(flips.h1_h8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a1_h1));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a8_h1));
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

    public void testClackPlaceG6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.blackPlaceG6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("______x_", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testClackFlipG6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.g1_g8 = LineConverter.convertStringToLine("_____o__");
        flips.b1_h7 = LineConverter.convertStringToLine("______o_");
        flips.a6_h6 = LineConverter.convertStringToLine("______o_");
        flips.e8_h5 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG6();

        assertEquals("_____x__", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("______x_", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhitePlaceG6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.whitePlaceG6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("______o_", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testWhiteFlipG6() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("________", LineConverter.convertLineToString(flips.e8_h5));

        flips.g1_g8 = LineConverter.convertStringToLine("_____x__");
        flips.b1_h7 = LineConverter.convertStringToLine("______x_");
        flips.a6_h6 = LineConverter.convertStringToLine("______x_");
        flips.e8_h5 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG6();

        assertEquals("_____o__", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.b1_h7));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a6_h6));
        assertEquals("______o_", LineConverter.convertLineToString(flips.e8_h5));
    }

    public void testClackPlaceG7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.blackPlaceG7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("______x_", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testClackFlipG7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.g1_g8 = LineConverter.convertStringToLine("______o_");
        flips.a1_h8 = LineConverter.convertStringToLine("______o_");
        flips.a7_h7 = LineConverter.convertStringToLine("______o_");
        flips.f8_h6 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG7();

        assertEquals("______x_", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("______x_", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testWhitePlaceG7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.whitePlaceG7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("______o_", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testWhiteFlipG7() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("________", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("________", LineConverter.convertLineToString(flips.f8_h6));

        flips.g1_g8 = LineConverter.convertStringToLine("______x_");
        flips.a1_h8 = LineConverter.convertStringToLine("______x_");
        flips.a7_h7 = LineConverter.convertStringToLine("______x_");
        flips.f8_h6 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG7();

        assertEquals("______o_", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a1_h8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a7_h7));
        assertEquals("______o_", LineConverter.convertLineToString(flips.f8_h6));
    }

    public void testClackPlaceG8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));

        flips.blackPlaceG8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a8_h8));

    }

    public void testClackFlipG8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));

        flips.g1_g8 = LineConverter.convertStringToLine("_______o");
        flips.a2_g8 = LineConverter.convertStringToLine("_______o");
        flips.a8_h8 = LineConverter.convertStringToLine("______o_");

        flips.blackFlipG8();

        assertEquals("_______x", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("_______x", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("______x_", LineConverter.convertLineToString(flips.a8_h8));
    }

    public void testWhitePlaceG8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));

        flips.whitePlaceG8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a8_h8));
    }

    public void testWhiteFlipG8() {
        FastBoardFlips flips = new FastBoardFlips();
        assertEquals("________", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("________", LineConverter.convertLineToString(flips.a8_h8));

        flips.g1_g8 = LineConverter.convertStringToLine("_______x");
        flips.a2_g8 = LineConverter.convertStringToLine("_______x");
        flips.a8_h8 = LineConverter.convertStringToLine("______x_");

        flips.whiteFlipG8();

        assertEquals("_______o", LineConverter.convertLineToString(flips.g1_g8));
        assertEquals("_______o", LineConverter.convertLineToString(flips.a2_g8));
        assertEquals("______o_", LineConverter.convertLineToString(flips.a8_h8));
    }
}
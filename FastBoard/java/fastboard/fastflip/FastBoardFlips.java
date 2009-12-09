package fastboard.fastflip;

import fastboard.FastBoardLines;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 26-Sep-2009
 * Time: 11:37:03 AM
 * This class handles all the flipping/placing of squares
 */
public class FastBoardFlips extends FastBoardLines {
    //a1
    public void blackPlaceA1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceA1() {
        a1_h1+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //a2
    public void blackPlaceA2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipA2() {
        a2_h2-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceA2() {
        a2_h2+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipA2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //a3
    public void blackPlaceA3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipA3() {
        a3_h3-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8-=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1-=1 * 3 * 3;
        a1_a8-=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceA3() {
        a3_h3+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=2 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=2 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipA3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    //a4
    public void blackPlaceA4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3;
    }

    public void blackFlipA4() {
        a4_h4-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8-=1 * 3 * 3 * 3 * 3;
        a4_d1-=1 * 3 * 3 * 3;
        a1_a8-=1 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceA4() {
        a4_h4+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=2 * 3 * 3 * 3 * 3;
        a4_d1+=2 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipA4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3;
    }

    //a5
    public void blackPlaceA5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3;
    }

    public void blackFlipA5() {
        a5_h5-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8-=1 * 3 * 3 * 3;
        a5_e1-=1 * 3 * 3 * 3 * 3;
        a1_a8-=1 * 3 * 3 * 3;
    }

    public void whitePlaceA5() {
        a5_h5+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=2 * 3 * 3 * 3;
        a5_e1+=2 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3;
    }

    public void whiteFlipA5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3;
    }

    //a6
    public void blackPlaceA6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3;
    }

    public void blackFlipA6() {
        a6_h6-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8-=1 * 3 * 3;
        a6_f1-=1 * 3 * 3 * 3 * 3 * 3;
        a1_a8-=1 * 3 * 3;
    }

    public void whitePlaceA6() {
        a6_h6+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=2 * 3 * 3;
        a6_f1+=2 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3;
    }

    public void whiteFlipA6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3;
    }

    //a7
    public void blackPlaceA7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3;
    }

    public void blackFlipA7() {
        a7_h7-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a7_g1-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8-=1 * 3;
    }

    public void whitePlaceA7() {
        a7_h7+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a7_g1+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3;
    }

    public void whiteFlipA7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3;
    }

    //a8
    public void blackPlaceA8() {
        a8_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1;
    }

    public void whitePlaceA8() {
        a8_h8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a8_h1+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2;
    }

    //b1
    public void blackPlaceB1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipB1() {
        a1_h1-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_h7-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceB1() {
        a1_h1+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipB1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //b2
    public void blackPlaceB2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipB2() {
        a2_h2-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_c1-=1 * 3;
        b1_b8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceB2() {
        a2_h2+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=2 * 3;
        b1_b8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipB2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //b3
    public void blackPlaceB3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipB3() {
        a3_h3-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8-=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1-=1 * 3 * 3;
        b1_b8-=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceB3() {
        a3_h3+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=2 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=2 * 3 * 3;
        b1_b8+=2 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipB3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    //b4
    public void blackPlaceB4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3;
    }

    public void blackFlipB4() {
        a4_h4-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8-=1 * 3 * 3 * 3 * 3;
        a5_e1-=1 * 3 * 3 * 3;
        b1_b8-=1 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceB4() {
        a4_h4+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=2 * 3 * 3 * 3 * 3;
        a5_e1+=2 * 3 * 3 * 3;
        b1_b8+=2 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipB4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3 * 3;
    }

    //b5
    public void blackPlaceB5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3;
    }

    public void blackFlipB5() {
        a5_h5-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8-=1 * 3 * 3 * 3;
        a6_f1-=1 * 3 * 3 * 3 * 3;
        b1_b8-=1 * 3 * 3 * 3;
    }

    public void whitePlaceB5() {
        a5_h5+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=2 * 3 * 3 * 3;
        a6_f1+=2 * 3 * 3 * 3 * 3;
        b1_b8+=2 * 3 * 3 * 3;
    }

    public void whiteFlipB5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3 * 3;
    }

    //b6
    public void blackPlaceB6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3;
    }

    public void blackFlipB6() {
        a6_h6-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8-=1 * 3 * 3;
        a7_g1-=1 * 3 * 3 * 3 * 3 * 3;
        b1_b8-=1 * 3 * 3;
    }

    public void whitePlaceB6() {
        a6_h6+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=2 * 3 * 3;
        a7_g1+=2 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=2 * 3 * 3;
    }

    public void whiteFlipB6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3 * 3;
    }

    //b7
    public void blackPlaceB7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3;
    }

    public void blackFlipB7() {
        a7_h7-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8-=1 * 3;
        a8_h1-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8-=1 * 3;
    }

    public void whitePlaceB7() {
        a7_h7+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=2 * 3;
        a8_h1+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=2 * 3;
    }

    public void whiteFlipB7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1 * 3;
    }

    //b8
    public void blackPlaceB8() {
        a8_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b8_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1;
    }

    public void blackFlipB8() {
        a8_h8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b8_h2-=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8-=1;
    }

    public void whitePlaceB8() {
        a8_h8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        b8_h2+=2 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=2;
    }

    public void whiteFlipB8() {
        a8_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b8_h2+=1 * 3 * 3 * 3 * 3 * 3 * 3;
        b1_b8+=1;
    }

    //c1
    public void blackPlaceC1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3;
        c1_h6+=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipC1() {
        a1_h1-=1 * 3 * 3 * 3 * 3 * 3;
        c1_h6-=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1-=1;
        c1_c8-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceC1() {
        a1_h1+=2 * 3 * 3 * 3 * 3 * 3;
        c1_h6+=2 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=2;
        c1_c8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipC1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3;
        c1_h6+=1 * 3 * 3 * 3 * 3 * 3;
        a3_c1+=1;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //c2
    public void blackPlaceC2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipC2() {
        a2_h2-=1 * 3 * 3 * 3 * 3 * 3;
        b1_h7-=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1-=1 * 3;
        c1_c8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceC2() {
        a2_h2+=2 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=2 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=2 * 3;
        c1_c8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipC2() {
        a2_h2+=1 * 3 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3 * 3;
        a4_d1+=1 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //c3
    public void blackPlaceC3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipC3() {
        a3_h3-=1 * 3 * 3 * 3 * 3 * 3;
        a1_h8-=1 * 3 * 3 * 3 * 3 * 3;
        a5_e1-=1 * 3 * 3;
        c1_c8-=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceC3() {
        a3_h3+=2 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=2 * 3 * 3 * 3 * 3 * 3;
        a5_e1+=2 * 3 * 3;
        c1_c8+=2 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipC3() {
        a3_h3+=1 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    //c4
    public void blackPlaceC4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3;
    }

    public void blackFlipC4() {
        a4_h4-=1 * 3 * 3 * 3 * 3 * 3;
        a2_g8-=1 * 3 * 3 * 3 * 3;
        a6_f1-=1 * 3 * 3 * 3;
        c1_c8-=1 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceC4() {
        a4_h4+=2 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=2 * 3 * 3 * 3 * 3;
        a6_f1+=2 * 3 * 3 * 3;
        c1_c8+=2 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipC4() {
        a4_h4+=1 * 3 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3 * 3;
    }

    //c5
    public void blackPlaceC5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3;
    }

    public void blackFlipC5() {
        a5_h5-=1 * 3 * 3 * 3 * 3 * 3;
        a3_f8-=1 * 3 * 3 * 3;
        a7_g1-=1 * 3 * 3 * 3 * 3;
        c1_c8-=1 * 3 * 3 * 3;
    }

    public void whitePlaceC5() {
        a5_h5+=2 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=2 * 3 * 3 * 3;
        a7_g1+=2 * 3 * 3 * 3 * 3;
        c1_c8+=2 * 3 * 3 * 3;
    }

    public void whiteFlipC5() {
        a5_h5+=1 * 3 * 3 * 3 * 3 * 3;
        a3_f8+=1 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3 * 3;
    }

    //c6
    public void blackPlaceC6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3;
    }

    public void blackFlipC6() {
        a6_h6-=1 * 3 * 3 * 3 * 3 * 3;
        a4_e8-=1 * 3 * 3;
        a8_h1-=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8-=1 * 3 * 3;
    }

    public void whitePlaceC6() {
        a6_h6+=2 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=2 * 3 * 3;
        a8_h1+=2 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=2 * 3 * 3;
    }

    public void whiteFlipC6() {
        a6_h6+=1 * 3 * 3 * 3 * 3 * 3;
        a4_e8+=1 * 3 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3 * 3;
    }

    //c7
    public void blackPlaceC7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3;
        b8_h2+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3;
    }

    public void blackFlipC7() {
        a7_h7-=1 * 3 * 3 * 3 * 3 * 3;
        a5_d8-=1 * 3;
        b8_h2-=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8-=1 * 3;
    }

    public void whitePlaceC7() {
        a7_h7+=2 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=2 * 3;
        b8_h2+=2 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=2 * 3;
    }

    public void whiteFlipC7() {
        a7_h7+=1 * 3 * 3 * 3 * 3 * 3;
        a5_d8+=1 * 3;
        b8_h2+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1 * 3;
    }

    //c8
    public void blackPlaceC8() {
        a8_h8+=1 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1;
        c8_h3+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1;
    }

    public void blackFlipC8() {
        a8_h8-=1 * 3 * 3 * 3 * 3 * 3;
        a6_c8-=1;
        c8_h3-=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8-=1;
    }

    public void whitePlaceC8() {
        a8_h8+=2 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=2;
        c8_h3+=2 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=2;
    }

    public void whiteFlipC8() {
        a8_h8+=1 * 3 * 3 * 3 * 3 * 3;
        a6_c8+=1;
        c8_h3+=1 * 3 * 3 * 3 * 3 * 3;
        c1_c8+=1;
    }

    //d1
    public void blackPlaceD1() {
        a1_h1+=1 * 3 * 3 * 3 * 3;
        d1_h5+=1 * 3 * 3 * 3 * 3;
        a4_d1+=1;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipD1() {
        a1_h1-=1 * 3 * 3 * 3 * 3;
        d1_h5-=1 * 3 * 3 * 3 * 3;
        a4_d1-=1;
        d1_d8-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceD1() {
        a1_h1+=2 * 3 * 3 * 3 * 3;
        d1_h5+=2 * 3 * 3 * 3 * 3;
        a4_d1+=2;
        d1_d8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipD1() {
        a1_h1+=1 * 3 * 3 * 3 * 3;
        d1_h5+=1 * 3 * 3 * 3 * 3;
        a4_d1+=1;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //d2
    public void blackPlaceD2() {
        a2_h2+=1 * 3 * 3 * 3 * 3;
        c1_h6+=1 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipD2() {
        a2_h2-=1 * 3 * 3 * 3 * 3;
        c1_h6-=1 * 3 * 3 * 3 * 3;
        a5_e1-=1 * 3;
        d1_d8-=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceD2() {
        a2_h2+=2 * 3 * 3 * 3 * 3;
        c1_h6+=2 * 3 * 3 * 3 * 3;
        a5_e1+=2 * 3;
        d1_d8+=2 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipD2() {
        a2_h2+=1 * 3 * 3 * 3 * 3;
        c1_h6+=1 * 3 * 3 * 3 * 3;
        a5_e1+=1 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //d3
    public void blackPlaceD3() {
        a3_h3+=1 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void blackFlipD3() {
        a3_h3-=1 * 3 * 3 * 3 * 3;
        b1_h7-=1 * 3 * 3 * 3 * 3;
        a6_f1-=1 * 3 * 3;
        d1_d8-=1 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceD3() {
        a3_h3+=2 * 3 * 3 * 3 * 3;
        b1_h7+=2 * 3 * 3 * 3 * 3;
        a6_f1+=2 * 3 * 3;
        d1_d8+=2 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipD3() {
        a3_h3+=1 * 3 * 3 * 3 * 3;
        b1_h7+=1 * 3 * 3 * 3 * 3;
        a6_f1+=1 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3 * 3;
    }

    //d4
    public void blackPlaceD4() {
        a4_h4+=1 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3;
    }

    public void blackFlipD4() {
        a4_h4-=1 * 3 * 3 * 3 * 3;
        a1_h8-=1 * 3 * 3 * 3 * 3;
        a7_g1-=1 * 3 * 3 * 3;
        d1_d8-=1 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceD4() {
        a4_h4+=2 * 3 * 3 * 3 * 3;
        a1_h8+=2 * 3 * 3 * 3 * 3;
        a7_g1+=2 * 3 * 3 * 3;
        d1_d8+=2 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipD4() {
        a4_h4+=1 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3;
        a7_g1+=1 * 3 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3 * 3;
    }

    //d5
    public void blackPlaceD5() {
        a5_h5+=1 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3;
    }

    public void blackFlipD5() {
        a5_h5-=1 * 3 * 3 * 3 * 3;
        a2_g8-=1 * 3 * 3 * 3;
        a8_h1-=1 * 3 * 3 * 3 * 3;
        d1_d8-=1 * 3 * 3 * 3;
    }

    public void whitePlaceD5() {
        a5_h5+=2 * 3 * 3 * 3 * 3;
        a2_g8+=2 * 3 * 3 * 3;
        a8_h1+=2 * 3 * 3 * 3 * 3;
        d1_d8+=2 * 3 * 3 * 3;
    }

    public void whiteFlipD5() {
        a5_h5+=1 * 3 * 3 * 3 * 3;
        a2_g8+=1 * 3 * 3 * 3;
        a8_h1+=1 * 3 * 3 * 3 * 3;
        d1_d8+=1 * 3 * 3 * 3;
    }

    //h8
    public void blackPlaceH8() {
        a8_h8+=1;
        a1_h8+=1;
        h1_h8+=1;
    }

    public void whitePlaceH8() {
        a8_h8+=2;
        a1_h8+=2;
        h1_h8+=2;
    }
}

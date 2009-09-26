package fastboard;

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

    public void blackFlipA1() {
        a1_h1-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8-=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whitePlaceA1() {
        a1_h1+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=2 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    public void whiteFlipA1() {
        a1_h1+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_h8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
        a1_a8+=1 * 3 * 3 * 3 * 3 * 3 * 3 * 3;
    }

    //h8
    public void blackPlaceH8() {
        a8_h8+=1;
        a1_h8+=1;
        h1_h8+=1;
    }

    public void blackFlipH8() {
        a8_h8-=1;
        a1_h8-=1;
        h1_h8-=1;
    }

    public void whitePlaceH8() {
        a8_h8+=2;
        a1_h8+=2;
        h1_h8+=2;
    }

    public void whiteFlipH8() {
        a8_h8+=1;
        a1_h8+=1;
        h1_h8+=1;
    }
}

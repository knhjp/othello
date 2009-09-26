package fastboard;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 26-Sep-2009
 * Time: 11:37:03 AM
 * This class handles all the flipping/placing of squares
 */
public class FastBoardFlips extends FastBoardLines {
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

package fastboard.generated;

import fastboard.FastBoardLines;

/**
 * Created by FastBoardMovesGenerator.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 10:10:09 PM
 * This is an auto-generated class! Please edit FastBoardMovesGenerator instead if you want to make changes.
 */
public class FastBoardMoves extends FastBoardLines{

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

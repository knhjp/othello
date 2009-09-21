package simpleboard;

import base.validate.Require;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 19-Sep-2009
 * Time: 1:04:01 PM
 * This board allows us to set the position
 */
public class SetupBoard extends SimpleBoard {
    public void setSquare(int color, int location) {
        Require.eq(Math.abs(color),"color",1,"1");
        //todo: validation
        board[location] = color;
        blackMinusWhite = calcBlackMinusWhite();
    }

    int calcBlackMinusWhite() {
        int count = 0;
        for (int curLocation = 11 ; curLocation<89; curLocation++) {
            if (curLocation%10 == 9) {
                curLocation +=2;
            }
            count+=board[curLocation];
        }

        return count;
    }
}

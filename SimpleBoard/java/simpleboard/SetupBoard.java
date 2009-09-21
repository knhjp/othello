package simpleboard;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 19-Sep-2009
 * Time: 1:04:01 PM
 * This board allows us to set the position
 */
public class SetupBoard extends SimpleBoard {
    public void setSquare(int color, int location) {
        //todo: validation
        board[location] = color;
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

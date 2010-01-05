package fastboard.fastmake.fastmake;

import fastboard.fastmake.FastMake;
import fastboard.fastflip.FastBoardFlips;
import fastboard.lineflipper.LineFlipper;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 3, 2010
 * Time: 2:24:19 PM
 * This updates the current board depending on the existing position for A1 for black
 */
public class FastMakeA1_Black implements FastMake {
    @Override public int makeMove(FastBoardFlips lines) {
        int discDiff = LineFlipper.blackLineFlippers_a1_a8[lines.a1_a8].flipLine(lines);

        lines.blackPlaceA1();
        discDiff +=1;
        return discDiff;
    }
}

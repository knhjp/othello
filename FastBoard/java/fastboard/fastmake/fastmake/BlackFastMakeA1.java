package fastboard.fastmake.fastmake;

import fastboard.fastflip.FastBoardFlips;
import fastboard.fastmake.FastMake;
import fastboard.lineflipper.LineFlipper;
import fastboard.lineflipper.calc.NumFlip;
import fastboard.lineflipper.squares.A1LineFlipper;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 3, 2010
 * Time: 2:24:19 PM
 * This updates the current board depending on the existing position for A1
 */
public class BlackFastMakeA1 implements FastMake {
    private final A1LineFlipper lineFlipper;

    public BlackFastMakeA1(NumFlip[][] numFlips) {
        LineFlipper[][] blackFlippers_a1_a8 = new LineFlipper[][]{{}};
        LineFlipper[][] blackFlippers_a1_h1 = new LineFlipper[][]{{}};
        LineFlipper[][] blackFlippers_a1_h8 = new LineFlipper[][]{{}};
        this.lineFlipper = new A1LineFlipper(numFlips,blackFlippers_a1_a8,
                blackFlippers_a1_h1,blackFlippers_a1_h8);
    }

    @Override public int makeMove(FastBoardFlips lines) {
        int discDiff =
                lineFlipper.a1_lineFlippers_a1_a8[lines.a1_a8].flipLine(lines) +
                lineFlipper.a1_lineFlippers_a1_h1[lines.a1_h1].flipLine(lines) +
                lineFlipper.a1_lineFlippers_a1_h8[lines.a1_h8].flipLine(lines);
        lines.blackPlaceA1();
        discDiff +=1;
        return discDiff;
    }
}

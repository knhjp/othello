package fastboard.lineflipper.lines.a1_a8.a6;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:42:30 AM
 * This flips along a1_a8, 2 discs for a6 for black
 */
public class A6_LineFlipper_a1_a8_2_0_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA4();
        lines.blackFlipA5();
        return 4;
    }
}
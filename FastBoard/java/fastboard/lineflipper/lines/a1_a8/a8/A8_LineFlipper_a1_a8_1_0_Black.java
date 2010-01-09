package fastboard.lineflipper.lines.a1_a8.a8;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:37:03 AM
 * This flips along a1_a8, 1 discs for a8 for black
 */
public class A8_LineFlipper_a1_a8_1_0_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA7();
        return 2;
    }
}
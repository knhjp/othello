package fastboard.lineflipper.lines.a1_a8.a7;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:42:30 AM
 * This flips along a1_a8, 1 discs for a7 for black
 */
public class A7_LineFlipper_a1_a8_1_0_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA6();
        return 2;
    }
}
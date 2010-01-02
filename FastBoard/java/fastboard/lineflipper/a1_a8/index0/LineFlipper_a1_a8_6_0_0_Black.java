package fastboard.lineflipper.a1_a8.index0;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:37:03 AM
 * This flips along a1_a8, 6 discs for index 0 (a8) for black
 */
public class LineFlipper_a1_a8_6_0_0_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA2();
        lines.blackFlipA3();
        lines.blackFlipA4();
        lines.blackFlipA5();
        lines.blackFlipA6();
        lines.blackFlipA7();
        return 12;
    }
}

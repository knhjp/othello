package fastboard.lineflipper.lines.a1_a8.a1;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:37:03 AM
 * This flips along a1_a8, 6 discs for a1 for black
 */
public class A1_LineFlipper_a1_a8_0_6_Black implements LineFlipper {
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
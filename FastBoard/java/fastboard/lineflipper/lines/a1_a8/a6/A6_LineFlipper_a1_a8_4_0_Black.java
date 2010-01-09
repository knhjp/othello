package fastboard.lineflipper.lines.a1_a8.a6;

import fastboard.lineflipper.LineFlipper;
import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 2, 2010
 * Time: 7:42:30 AM
 * This flips along a1_a8, 5 discs for a7 for black
 */
public class A6_LineFlipper_a1_a8_4_0_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA2();
        lines.blackFlipA3();
        lines.blackFlipA4();
        lines.blackFlipA5();
        return 8;
    }
}
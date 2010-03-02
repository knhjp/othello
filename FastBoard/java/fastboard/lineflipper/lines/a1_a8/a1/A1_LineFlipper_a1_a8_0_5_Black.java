package fastboard.lineflipper.lines.a1_a8.a1;

import fastboard.fastflip.FastBoardFlips;
import fastboard.lineflipper.LineFlipper;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Mar 1, 2010
 * Time: 8:09:12 PM
 * This flips along a1_a8, 5 discs for a1 for black
 */
public class A1_LineFlipper_a1_a8_0_5_Black implements LineFlipper {
    @Override public int flipLine(FastBoardFlips lines) {
        lines.blackFlipA2();
        lines.blackFlipA3();
        lines.blackFlipA4();
        lines.blackFlipA5();
        lines.blackFlipA6();
        return 10;
    }
}

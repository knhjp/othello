package fastboard.lineflipper;

import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 1, 2010
 * Time: 5:52:52 PM
 * LineFlipper flips discs on a line given the line current configuration
 */
public interface LineFlipper {
    LineFlipper[] blackLineFlippers_a1_a8 = null;
    LineFlipper[] blackLineFlippers_a1_h1 = null;

    /**
     * Flips a series of discs on a line
     * @param lines the current configuration of the board
     * @return the number of discDiff changed
     */
    int flipLine(FastBoardFlips lines);
}

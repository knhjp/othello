package fastboard.lineflipper;

import fastboard.FastBoardLines;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 1, 2010
 * Time: 5:52:52 PM
 * LineFlipper flips discs on a line given the line current configuration
 */
public interface LineFlipper {
    /**
     * Flips a series of discs on a line
     * @param lines the current configuration of the board
     * @return the number of discDiff changed
     */
    int flipLine(FastBoardLines lines);
}

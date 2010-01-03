package fastboard.fastmake;

import fastboard.fastflip.FastBoardFlips;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 3, 2010
 * Time: 2:18:32 PM
 * This interface is meant to be like FastFlip, providing a way to make moves based on the line configurations
 */
public interface FastMake {
    FastMake[][] fastMakes = null;

    /**
     * Given the current configuration of the lines, it decides which discs to flip to make a move
     * @param lines the current representation. The position will be updated here as well
     * @return change in disc differences (to be added with the current disc difference)
     */
    int makeMove(FastBoardFlips lines);
}

package fastboard.consistency;

import fastboard.FastBoard;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Feb 6, 2010
 * Time: 10:58:04 AM
 * This class is meant to check the consistency of a FastBoard (a1 is the same status for all lines and
 * blackMinusWhite should be consistent with the line configurations)
 */
public class FastBoardConsistencyChecker {
    private final FastBoardSquareChecker[] checkers;

    public FastBoardConsistencyChecker(FastBoardSquareChecker[] checkers) {
        this.checkers = checkers;
    }

    public boolean isConsistent(FastBoard fastBoard) {
        for (FastBoardSquareChecker checker : checkers) {
            
        }
        return true;
    }
}

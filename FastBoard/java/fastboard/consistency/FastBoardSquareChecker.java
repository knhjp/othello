package fastboard.consistency;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Feb 6, 2010
 * Time: 11:14:06 AM
 * This is the interface for checking whether or not a square of the FastBoard is consistent
 */
public interface FastBoardSquareChecker {
    /**
     * Check that a particular square on the FastBoard is consistent
     * @return the blackMinusWhite contribution of this square
     */
    int checkSquareIsConsistent();
}

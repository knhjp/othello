package base.board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 10:29:07 AM
 * This is the interface to represent a board (a position)
 */
public interface Board {
    /**
     * Given the location of the board, return the content
     * @param location This is the location of the board, 11 = A1, 18 =H1
     * @return 0 for an empty square, -1 for white, and 1 for black
     */
    int getSquare(int location);

    /**
     * Reset the board back to the initial position
     */
    void resetToStart();

    /**
     * Determines whether or not a valid move can be made in certain location of the board
     * @param location The location of the board you would like to know if it is a valid move
     * @return true if a move can be made here, false otherwise
     */
    boolean isMoveValid(int location);
}

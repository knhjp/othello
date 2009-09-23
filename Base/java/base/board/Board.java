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
     * @param color the color that is the next to move
     * @param location The location of the board you would like to know if it is a valid move  @return true if a move can be made here, false otherwise
     * @return true if move is valid, force otherwise
     */
    boolean isMoveValid(int color, int location);

    /**
     * Precondition: The move is really a valid move
     * @param color the color that is the next to move
     * @param location the location of where the move is being made
     */
    void makeMove(int color, int location);

    /**
     * Copies the input board
     * @param board the board that you wish to copy
     */
    void copyBoard(Board board);

    /**
     *
     * @return The number of black discs (1) minus the number of white discs (-1)
     */
    int getBlackMinusWhite();

    static int[] allMoves = {
        11, 18, 81, 88, //corners

        //sweet 16
        33, 36, 63, 66, //corners
        34, 35, 43, 46, 53, 56, 64, 65,

        13, 16, 31, 38, 61, 68, 83, 86, //b-squares
        14, 15, 41, 48, 51, 58, 84, 85, //a-squares
        12, 17, 21, 28, 71, 78, 82, 87, //c-squares

        24, 25, 42, 47, 52, 57, 74, 75,
        23, 26, 32, 37, 62, 67, 73, 76,

        22, 27, 72, 77, //x-squares
    };
}

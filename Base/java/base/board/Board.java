package base.board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 10:29:07 AM
 * This is the interface to represent a board (a position)
 */
public interface Board {
    //Given the location of the board, return the content
    int getSquare(int location);
    void resetToStart();
}

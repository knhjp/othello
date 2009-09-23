package search;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 6:15:00 PM
 * This is the interface for searches
 */
public interface TreeSearch {
    public final int negInf = -65;
    int search(int color, Board[] boards, int empties, boolean alreadyPassed);
}

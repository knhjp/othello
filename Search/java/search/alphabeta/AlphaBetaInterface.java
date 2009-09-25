package search.alphabeta;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 24, 2009
 * Time: 9:05:35 PM
 * This makes a consistent interface to alpha-beta search
 */
public interface AlphaBetaInterface {
    int search(int color, Board[] boards, int empties, boolean alreadyPassed, int alpha, int beta);
}

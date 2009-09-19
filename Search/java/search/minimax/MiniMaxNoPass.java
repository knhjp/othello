package search.minimax;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 19-Sep-2009
 * Time: 12:37:51 PM
 * This class handles MiniMax search when there has been no passes made yet
 */
public class MiniMaxNoPass extends AbstractMiniMax {

    @Override int handlePass(int color, Board[] board, int empties) {
        return 0;
    }
}

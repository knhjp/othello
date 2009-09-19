package search.minimax;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 19-Sep-2009
 * Time: 12:40:40 PM
 * This class handles the Minimax search when there is already one pass
 */
public class MiniMaxOnePass extends AbstractMiniMax {
    @Override int handlePass(int color, Board[] board, int empties) {
        return board[empties].getBlackMinusWhite() * color;
    }
}

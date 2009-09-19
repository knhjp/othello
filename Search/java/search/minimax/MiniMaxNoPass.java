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
    private final MiniMaxOnePass miniMaxOnePass;

    public MiniMaxNoPass(MiniMaxOnePass miniMaxOnePass) {
        this.miniMaxOnePass = miniMaxOnePass;
    }

    @Override int handlePass(int color, Board[] board, int empties) {
        return miniMaxOnePass.search(color,board,empties);
    }
}

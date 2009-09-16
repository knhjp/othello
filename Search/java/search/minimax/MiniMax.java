package search.minimax;

import search.TreeSearch;
import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 6:12:11 PM
 * This class does the naive minimax search
 */
public class MiniMax implements TreeSearch {
    @Override public int search(int color, Board[] board, int empties) {
        int bestScore = -65;
        for (int curLocation = 11 ; curLocation<89; curLocation++) {
            if (curLocation%10 == 9) {
                curLocation +=2;
            }

            if (board[empties].isMoveValid(color,curLocation)) {
                board[empties-1].copyBoard(board[empties]);
                bestScore = Math.max(bestScore,color * search(-color,board,empties-1));
            }
        }

        //todo: handle the case with a pass

        return bestScore * color;
    }
}

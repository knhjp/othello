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
    private int nodeCount;

    public MiniMax() {
        nodeCount=0;
    }

    @Override public int search(int color, Board[] boards, int empties, boolean alreadyPassed) {
        nodeCount++;
        int bestScore = TreeSearch.negInf;
        for (int curLocation = 11 ; curLocation<89; curLocation++) {
            if (curLocation%10 == 9) {
                curLocation +=2;
            }

            if (boards[empties].isMoveValid(color,curLocation)) {
                boards[empties-1].copyBoard(boards[empties]);
                boards[empties-1].makeMove(color,curLocation);
                bestScore = Math.max(bestScore,-search(-color,boards,empties-1,false));
            }
        }

        if (bestScore == TreeSearch.negInf) { //this happens in case of a pass
            if (alreadyPassed) {
                return boards[empties].getBlackMinusWhite() * color;
            } else {
                return -search(-color,boards,empties,true);
            }
        } else {
            return bestScore;
        }
    }

    public int getNodeCount() {
        return nodeCount;
    }
}

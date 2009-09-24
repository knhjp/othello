package search.alphabeta.caching;

import base.board.Board;
import search.TreeSearch;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 23, 2009
 * Time: 8:01:05 PM
 * This aims to do the same thing as AlphaBeta, except it caches positions already seen
 */
public class AlphaBetaCaching {
    private int nodeCount;
    private final int numBuckets;
    private final PositionCache[] cache;

    public AlphaBetaCaching(int numBuckets) {
        this.numBuckets = numBuckets;
        this.cache = new PositionCache[numBuckets];
        nodeCount=0;
    }

    public int search(int color, Board[] boards, int empties, boolean alreadyPassed, int alpha, int beta) {
        nodeCount++;
        int curScore = TreeSearch.negInf;
        for (int curLocation : Board.allMoves) {
            if (boards[empties].isMoveValid(color,curLocation)) {
                boards[empties-1].copyBoard(boards[empties]);
                boards[empties-1].makeMove(color,curLocation);
                curScore = Math.max(curScore,-search(-color,boards,empties-1,false,-beta,-alpha));
                alpha = Math.max(alpha, curScore);
                if (beta <= alpha) {//beta cutoff
                    break;
                }
            }
        }

        if (curScore != TreeSearch.negInf) {
            return alpha;
        } else { //this happens in case of a pass
            if (alreadyPassed) {
                return boards[empties].getBlackMinusWhite() * color;
            } else {
                return -search(-color,boards,empties,true,-beta,-alpha);
            }
        }
    }

    public int getNodeCount() {
        return nodeCount;
    }
}

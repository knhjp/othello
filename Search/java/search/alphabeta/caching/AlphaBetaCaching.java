package search.alphabeta.caching;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 23, 2009
 * Time: 8:01:05 PM
 * This aims to do the same thing as AlphaBeta, except it caches positions already seen
 */
public class AlphaBetaCaching {
    private int nodeCount;
    public AlphaBetaCaching(int numBuckets) {
        nodeCount=0;
    }

    public int search(int color, Board[] boards, int empties, boolean alreadyPassed, int alpha, int beta) {
        nodeCount++;
        boolean hasSearched = false;
        for (int curLocation : Board.allMoves) {
            if (boards[empties].isMoveValid(color,curLocation)) {
                hasSearched = true;
                boards[empties-1].copyBoard(boards[empties]);
                boards[empties-1].makeMove(color,curLocation);
                alpha = Math.max(alpha,-search(-color,boards,empties-1,false,-beta,-alpha));
                if (beta <= alpha) {//beta cutoff
                    return alpha;
                }
            }
        }

        if (hasSearched) {
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

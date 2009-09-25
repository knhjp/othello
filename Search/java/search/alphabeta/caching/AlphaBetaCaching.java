package search.alphabeta.caching;

import base.board.Board;
import search.TreeSearch;
import search.alphabeta.AlphaBeta;
import search.alphabeta.AlphaBetaInterface;
import com.sun.istack.internal.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 23, 2009
 * Time: 8:01:05 PM
 * This aims to do the same thing as AlphaBeta, except it caches positions already seen
 */
public class AlphaBetaCaching implements AlphaBetaInterface {
    private final int emptiesCutoff = 6;

    private int nodeCount;
    private final int numBuckets;
    private final AlphaBeta alphaBeta;
    private final PositionCache[] cache;

    public AlphaBetaCaching(int numBuckets, AlphaBeta alphaBeta) {
        this.numBuckets = numBuckets;
        this.alphaBeta = alphaBeta;
        this.cache = new PositionCache[numBuckets];
        for (int i=0 ; i<numBuckets ; i++) {
            this.cache[i] = new PositionCache();
        }
        nodeCount=0;
    }

    @Override public int search(final int color, final Board[] boards, final int empties, final boolean alreadyPassed,
                      final int alpha, final int beta) {
        nodeCount++;

        final int hashCode = boards[empties].hashCodeWithColor(color);
        final PositionCache rawCache = cache[hashCode % numBuckets];
        @Nullable final PositionCache positionCache;
        if (hashCode == rawCache.hashCode) { //we have seen this position before, maybe we can do something useful with this
            positionCache = rawCache;
            if (positionCache.lowerBound == positionCache.upperBound) { //if they equal to each other, we already know the score of the position
                return positionCache.lowerBound; //doesn't matter which one we return
            }
            if (positionCache.lowerBound >= beta) { //if the lowest possible value is already above our window, we have a cutoff
                return positionCache.lowerBound;
            }
            if (positionCache.upperBound <= alpha) { //likewise, if the position is going to be lower than our window
                return positionCache.upperBound;
            }

        } else {
            if (rawCache.empties < empties) {
                positionCache = rawCache;
                positionCache.setNewHashCode(hashCode,empties);
            } else {
                positionCache = null;
            }
        }

        AlphaBetaInterface alphaBetaInterface = empties == emptiesCutoff ? alphaBeta : this;
        int curScore = TreeSearch.negInf;
        for (int curLocation : Board.allMoves) {
            if (boards[empties].isMoveValid(color,curLocation)) {
                boards[empties-1].copyBoard(boards[empties]);
                boards[empties-1].makeMove(color,curLocation);
                curScore = Math.max(curScore,
                        -alphaBetaInterface.search(-color,boards,empties-1,false,-beta,-Math.max(alpha,curScore)));
                if (beta <= curScore) {//beta cutoff
                    break;
                }
            }
        }

        if (curScore != TreeSearch.negInf) {
            //update cache before returning
            if (positionCache!=null) {
                if (curScore <= alpha) { //if curScore is lower than alpha, we don't know the exact score, but we know it can't be better than curScore
                    positionCache.upperBound = curScore;
                } else if (curScore >= beta) {
                    positionCache.lowerBound = curScore;
                } else { //if between alpha and beta, we know *exactly* what the score is
                    positionCache.lowerBound = positionCache.upperBound = curScore;
                }
            }
            return curScore;
        } else { //this happens in case of a pass
            if (alreadyPassed) {
                return boards[empties].getBlackMinusWhite() * color;
            } else {
                return -search(-color,boards,empties,true,-beta,-alpha);
            }
        }
    }

    public int getNodeCount() {
        return nodeCount + alphaBeta.getNodeCount();
    }

    public int numEmptyCache() {
        int counter = 0;
        for (int i=0 ; i<numBuckets ; i++) {
            if (cache[i].hashCode==PositionCache.invalidHash) {
                counter++;
            }
        }
        return counter;
    }
}

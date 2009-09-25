package speedtest.alphabeta;

import simpleboard.SetupBoard;
import base.board.Board;
import search.TreeSearch;
import search.alphabeta.caching.AlphaBetaCaching;
import search.alphabeta.AlphaBeta;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 24, 2009
 * Time: 6:35:45 PM
 * Speed test for AlphaBetaCaching
 */
public class AlphaBetaCachingSpeedTest {
    public static void main(String[] args) {
        final int numBuckets = 1046527;
        AlphaBetaCaching alphaBeta = new AlphaBetaCaching(numBuckets, new AlphaBeta());

        int[] myBoard = {
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 0, 0, 0,-1, 0, 0, 0, 0, 3,
                3, 0, 0,-1,-1, 0, 0, 0, 0, 3,
                3,-1,-1,-1,-1, 1, 1, 1, 1, 3,
                3,-1, 1,-1,-1, 1, 1, 1, 1, 3,
                3,-1,-1,-1, 1, 1, 1,-1, 1, 3,
                3,-1,-1,-1,-1, 1, 1, 1, 1, 3,
                3, 0, 0,-1, 1,-1, 1, 1, 0, 3,
                3, 0,-1,-1,-1,-1,-1, 0, 0, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        SetupBoard board = new SetupBoard();
        board.resetToStart();
        board.setBoard(myBoard);

        int color = -1;
        int empties = 19;
        boolean alreadyPassed = false;
        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SetupBoard();
        }
        boards[empties] = board;

        int runs = 500;

        long beforeTime = System.currentTimeMillis();
        int score = 0;
        for (int i=0 ; i<runs ; i++) {
            score = alphaBeta.search(color, boards, empties, alreadyPassed, TreeSearch.negInf, TreeSearch.posInf);
        }
        long afterTime = System.currentTimeMillis();

        int expectedScore = 8;
        if (score!= expectedScore) {
            throw new IllegalStateException("This should have solved to "+expectedScore+" but solved to "+score);
        }

        int nodeCount = alphaBeta.getNodeCount();
        long totalTime = afterTime - beforeTime;
        long nodePerMs = nodeCount / totalTime;

        int numEmptyEntries = alphaBeta.numEmptyCache();
        double perEmpty = numEmptyEntries / (double)numBuckets;

        System.out.println("score:"+score);
        System.out.println("time:"+ totalTime);
        System.out.println("nodeCount:"+nodeCount);
        System.out.println("node/ms:"+ nodePerMs);
        System.out.println("%Empty:"+perEmpty);
    }
}

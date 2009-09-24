package speedtest.alphabeta;

import simpleboard.SetupBoard;
import base.board.Board;
import search.TreeSearch;
import search.alphabeta.caching.AlphaBetaCaching;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 24, 2009
 * Time: 6:35:45 PM
 * Speed test for AlphaBetaCaching
 */
public class AlphaBetaCachingSpeedTest {
    public static void main(String[] args) {
        final int numBuckets = 20000;
        AlphaBetaCaching alphaBeta = new AlphaBetaCaching(numBuckets);

        int[] myBoard = {
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
                3, 0, 0, -1, -1, -1, -1, -1, 0, 3,
                3, 1, 0, -1, -1, -1, -1, -1, 1, 3,
                3, 1, 1, -1, 1, -1, -1, 1, 0, 3,
                3, 1, -1, 1, 1, -1, 1, 1, 0, 3,
                3, 1, 1, -1, 1, 1, 1, 1, 1, 3,
                3, 1, 1, -1, 1, 1, 1, 1, 1, 3,
                3, 0, -1, -1, 1, 1, 1, 0, 1, 3,
                3, 0, 0, -1, 1, 1, 1, 1, 0, 3,
                3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

        SetupBoard board = new SetupBoard();
        board.resetToStart();
        board.setBoard(myBoard);

        int color = -1;
        int empties = 11;
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

        if (score!=10) {
            throw new IllegalStateException("This should have solved to 10");
        }

        int nodeCount = alphaBeta.getNodeCount();
        long totalTime = afterTime - beforeTime;
        long nodePerMs = nodeCount / totalTime;

        System.out.println("score:"+score);
        System.out.println("time:"+ totalTime);
        System.out.println("nodeCount:"+nodeCount);
        System.out.println("node/ms:"+ nodePerMs);
    }
}

package speedtest.minimax;

import search.minimax.MiniMax;
import simpleboard.SetupBoard;
import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 21, 2009
 * Time: 6:10:38 PM
 * This is for testing the performance of MiniMax
 */
public class MinimaxSpeedTest {
    public static void main(String[] args) {
        MiniMax miniMax = new MiniMax();

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

        long beforeTime = System.currentTimeMillis();
        int score = miniMax.search(color, boards, empties, alreadyPassed);
        long afterTime = System.currentTimeMillis();

        if (score!=10) {
            throw new IllegalStateException("This should have solved to 10");
        }

        int nodeCount = miniMax.getNodeCount();
        long totalTime = afterTime - beforeTime;
        long nodePerMs = nodeCount / totalTime;

        System.out.println("score:"+score);
        System.out.println("time:"+ totalTime);
        System.out.println("nodeCount:"+nodeCount);
        System.out.println("node/ms:"+ nodePerMs);
    }
}

package speedtest.alphabeta;

import simpleboard.SimpleBoard;
import base.board.BoardHelper;
import base.board.Board;
import search.alphabeta.caching.AlphaBetaCaching;
import search.alphabeta.AlphaBeta;
import search.TreeSearch;
import search.minimax.MiniMax;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 8:07:14 PM
 * This tests weird tranposition game:
 * F5D6C3D3C4F4C5B3C2E6C6B6B4F6G3B5A3E3D2F3G4E2A4D1F1B1E1F2C7A5G5C8G6H3D7H4A6H5H2H1G1B7C1B2A2A1A8A7G2F7E7E8

 * Then D8 Pass H7 H6 (Black to Move) or H7 H6 D8 (White To Move) with
 * same position but different color to play - good test for your
  * transposition table ? :)
 */
public class WeirdTranspositionComparison {
    public static void main(String[] args) {
        SimpleBoard board = new SimpleBoard();
        board.resetToStart();

        int[] moves = BoardHelper.stringToMoves("F5D6C3D3C4F4C5B3C2E6C6B6B4F6G3B5A3E3D2F3G4E2A4D1F1B1E1F2C7A5G5C8G6H3D7H4A6H5H2H1G1B7C1B2A2A1A8A7G2F7E7E8");

        int color = 1;
        int empties = 60;
        for (int move : moves) {
            board.makeMove(color,move);
            color = -color;
            empties--;
        }

        Board[] boards = new Board[60];
        for (int i=0 ; i<boards.length ; i++) {
            boards[i] = new SimpleBoard();
        }
        boards[empties] = board;

        final int numBuckets = 1046527;
        AlphaBetaCaching alphaBetaCaching = new AlphaBetaCaching(numBuckets, new AlphaBeta());

        int cacheScore = alphaBetaCaching.search(color, boards, empties, false, TreeSearch.negInf, TreeSearch.posInf);

        AlphaBeta alphaBeta = new AlphaBeta();

        int simpleScore = alphaBeta.search(color, boards, empties, false, TreeSearch.negInf, TreeSearch.posInf);

        MiniMax miniMax = new MiniMax();

        int minMaxScore = miniMax.search(color,boards,empties,false);

        System.out.println("empties:"+empties+", color:"+color);
        System.out.println("cacheScore:"+cacheScore);
        System.out.println("simpleScore:"+simpleScore);
        System.out.println("miniMaxScore:"+minMaxScore);
    }
}

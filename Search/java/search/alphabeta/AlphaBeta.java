package search.alphabeta;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 21, 2009
 * Time: 7:02:09 PM
 * This class does an alpha beta search
 */
public class AlphaBeta {
    public int search(int color, Board[] boards, int empties, boolean alreadyPassed, int alpha, int beta) {
        boolean hasSearched = false;
        for (int curLocation = 11 ; curLocation<89; curLocation++) {
            if (curLocation%10 == 9) {
                curLocation +=2;
            }

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
        
}
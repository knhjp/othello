package base.eval;

import base.board.Board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 10:46:03 AM
 * This is an interface to represent an evaluator that, given a Board, it will give you a score
 */
public interface Evaluator<B extends Board> {
    double eval(B board);
}

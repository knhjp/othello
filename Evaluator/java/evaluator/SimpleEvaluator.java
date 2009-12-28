package evaluator;

import base.board.Board;
import base.eval.Evaluator;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 22-Dec-2009
 * Time: 5:11:24 PM
 * This class is meant to be a simple version to see how we should implement an evaluator
 */
public class SimpleEvaluator implements Evaluator {
    @Override public double eval(Board board) {
        return 0;
    }
}

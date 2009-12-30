package evaluator.simple;

import base.board.Board;
import base.eval.Evaluator;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 22-Dec-2009
 * Time: 5:11:24 PM
 * This class is meant to be a simple version to see how we should implement an evaluator
 */
public class SimpleEvaluator implements Evaluator, Externalizable {
    //for externalization
    public SimpleEvaluator() {
    }

    @Override public double eval(Board board) {
        return 0;
    }

    @Override public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        
    }
}

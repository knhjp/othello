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
    //horizonal
    private int[] a1_h1;
    private int[] a2_h2;
    private int[] a3_h3;
    private int[] a4_h4;
    private int[] a5_h5;
    private int[] a6_h6;
    private int[] a7_h7;
    private int[] a8_h8;

    //vertical
    private int[] a1_a8;
    private int[] b1_b8;
    private int[] c1_c8;
    private int[] d1_d8;
    private int[] e1_e8;
    private int[] f1_f8;
    private int[] g1_g8;
    private int[] h1_h8;

    // diagonal /
    private int[] a3_c1;
    private int[] a4_d1;
    private int[] a5_e1;
    private int[] a6_f1;
    private int[] a7_g1;
    private int[] a8_h1;
    private int[] b8_h2;
    private int[] c8_h3;
    private int[] d8_h4;
    private int[] e8_h5;
    private int[] f8_h6;

    //diagonal \
    private int[] f1_h3;
    private int[] e1_h4;
    private int[] d1_h5;
    private int[] c1_h6;
    private int[] b1_h7;
    private int[] a1_h8;
    private int[] a2_g8;
    private int[] a3_f8;
    private int[] a4_e8;
    private int[] a5_d8;
    private int[] a6_c8;

    //for externalization
    public SimpleEvaluator() {
    }

    @Override public int eval(Board board) {
        return 0;
    }

    @Override public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }

    @Override public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        
    }
}

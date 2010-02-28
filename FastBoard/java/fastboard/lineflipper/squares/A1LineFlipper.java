package fastboard.lineflipper.squares;

import fastboard.lineflipper.LineFlipper;
import fastboard.lineflipper.calc.NumFlip;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 8, 2010
 * Time: 7:48:09 PM
 * This class is meant to deal with line flipping for making a move on square a1
 */
public class A1LineFlipper {
    public final LineFlipper[] a1_lineFlippers_a1_a8;
    public final LineFlipper[] a1_lineFlippers_a1_h1 = null;
    public final LineFlipper[] a1_lineFlippers_a1_h8 = null;

    public A1LineFlipper(NumFlip[][] numFlips, LineFlipper[][] flippers_a1_a8) {
        a1_lineFlippers_a1_a8 = new LineFlipper[3 * 3 * 3 * 3 * 3 * 3 * 3 * 3];
        for (int i=0 ; i< a1_lineFlippers_a1_a8.length; i++) {
            NumFlip curNumFlip = numFlips[7][i];
            a1_lineFlippers_a1_a8[i]=flippers_a1_a8[curNumFlip.upNum][curNumFlip.downNum];
        }
    }
}

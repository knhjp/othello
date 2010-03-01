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
    public final LineFlipper[] a1_lineFlippers_a1_h1;
    public final LineFlipper[] a1_lineFlippers_a1_h8;

    public A1LineFlipper(NumFlip[][] numFlips,
                         LineFlipper[][] flippers_a1_a8,
                         LineFlipper[][] flippers_a1_h1,
                         LineFlipper[][] flippers_a1_h8) {
        this.a1_lineFlippers_a1_a8 = new LineFlipper[3 * 3 * 3 * 3 * 3 * 3 * 3 * 3];
        for (int i=0 ; i< a1_lineFlippers_a1_a8.length; i++) {
            NumFlip curNumFlip = numFlips[7][i];
            a1_lineFlippers_a1_a8[i]=flippers_a1_a8[curNumFlip.upNum][curNumFlip.downNum];
        }

        this.a1_lineFlippers_a1_h1 = new LineFlipper[3 * 3 * 3 * 3 * 3 * 3 * 3 * 3];
        for (int i=0 ; i<a1_lineFlippers_a1_h1.length ; i++) {
            NumFlip curNumFlip = numFlips[7][i];
            a1_lineFlippers_a1_h1[i] = flippers_a1_h1[curNumFlip.upNum][curNumFlip.downNum];
        }

        this.a1_lineFlippers_a1_h8 = new LineFlipper[3 * 3 * 3 * 3 * 3 * 3 * 3 *3];
        for (int i=0 ; i<a1_lineFlippers_a1_h8.length ; i++) {
            NumFlip curNumFlip = numFlips[7][i];
            a1_lineFlippers_a1_h8[i] = flippers_a1_h8[curNumFlip.upNum][curNumFlip.downNum];
        }
    }
}

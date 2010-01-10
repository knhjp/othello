package fastboard.lineflipper.calc;

import fastboard.checkmove.calc.FastCheckCalc;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 10, 2010
 * Time: 11:54:09 AM
 * This class calculates how many pieces would be flip given a certain line configuration
 */
public class LineFlipperNumFlipCalc {

    /**
     * Calculates how many pieces get flipped given a configuration
     * @return an int[][] for the results. Result[index][line] means how  many discs you would flip for a given
     * index and line configuration
     */
    public NumFlip[][] calcNumFlipForBlack() {
        NumFlip[][] ret = new NumFlip[FastCheckCalc.squaresForALine][];

        for (int index=0 ; index<ret.length ; index++) {
            ret[index] = new NumFlip[FastCheckCalc.threeToTheEighth];

            for (int line=0 ; line<FastCheckCalc.threeToTheEighth ; line++) {
                ret[index][line] = numFlipForBlackForThisLine(line,index);
            }
        }

        return ret;
    }

    private NumFlip numFlipForBlackForThisLine(int line, int index) {
        return null;
    }
}

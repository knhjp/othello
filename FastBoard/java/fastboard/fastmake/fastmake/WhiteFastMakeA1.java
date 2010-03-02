package fastboard.fastmake.fastmake;

import fastboard.lineflipper.LineFlipper;
import fastboard.lineflipper.calc.NumFlip;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Mar 1, 2010
 * Time: 7:39:50 PM
 * This updates the current board depending on the existing position for A1 for white
 */
public class WhiteFastMakeA1 extends AbstractFastMakeA1 {
    public WhiteFastMakeA1(NumFlip[][] numFlips) {
        super(numFlips);
    }

    @Override LineFlipper[][] calcA1_a8() {
        return new LineFlipper[][]{{}};
    }

    @Override LineFlipper[][] calcA1_h1() {
        return new LineFlipper[][]{{}};
    }

    @Override LineFlipper[][] calcA1_h8() {
        return new LineFlipper[][]{{}};
    }
}

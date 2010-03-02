package fastboard.fastmake.fastmake;

import fastboard.lineflipper.LineFlipper;
import fastboard.lineflipper.calc.NumFlip;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 3, 2010
 * Time: 2:24:19 PM
 * This updates the current board depending on the existing position for A1
 */
public class BlackFastMakeA1 extends AbstractFastMakeA1 {
    public BlackFastMakeA1(NumFlip[][] numFlips) {
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

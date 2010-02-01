package fastboard.fastmake;

import fastboard.checkmove.linedecoder.LineDecoderGenerator;
import fastboard.fastmake.fastmake.FastMakeA1;
import fastboard.lineflipper.calc.LineFlipperNumFlipCalc;
import fastboard.lineflipper.calc.NumFlip;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 20, 2010
 * Time: 8:19:18 PM
 * This class is used to generate all the FastMakes instead of using
 * a static field
 */
public class FastMakeGenerator {
    private final FastMake[][] fastMakes;

    public FastMakeGenerator(LineDecoderGenerator generator) {
        final LineFlipperNumFlipCalc calc = new LineFlipperNumFlipCalc();
        final NumFlip[][] blackNumFlips = calc.calcNumFlip(generator.getBlackLineDecoders());
        final NumFlip[][] whiteNumFlips = calc.calcNumFlip(generator.getWhiteLineDecoders());

        fastMakes = new FastMake[][]{
                {},
                {},
                {
                        null, null, null, null, null, null, null, null, null, null,
                        null, new FastMakeA1(blackNumFlips)
                }
        };
    }
}

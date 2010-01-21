package fastboard.fastmake;

import fastboard.fastmake.fastmake.FastMakeA1_Black;
import fastboard.lineflipper.calc.LineFlipperNumFlipCalc;
import fastboard.lineflipper.calc.NumFlip;
import fastboard.checkmove.linedecoder.LineDecoderGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 20, 2010
 * Time: 8:19:18 PM
 * This class is used to generate all the FastMakes instead of using
 * a static field
 */
public class FastMakeGenerator {
    public FastMakeGenerator() {
        final LineDecoderGenerator generator = new LineDecoderGenerator();
        final LineFlipperNumFlipCalc calc = new LineFlipperNumFlipCalc();
        final NumFlip[][] blackNumFlips = calc.calcNumFlip(generator.getBlackLineDecoders());
        final NumFlip[][] whiteNumFlips = calc.calcNumFlip(generator.getWhiteLineDecoders());

        FastMake[][] fastMakes = {
                {},
                {},
                {
                        null, null, null, null, null, null, null, null, null, null,
                        null, new FastMakeA1_Black(null)
                }
        };
    }
}

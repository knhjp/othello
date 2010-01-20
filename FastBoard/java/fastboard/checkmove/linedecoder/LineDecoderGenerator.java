package fastboard.checkmove.linedecoder;

import fastboard.checkmove.linedecoder.color.BlackLineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 19, 2010
 * Time: 8:12:59 PM
 * This produces line decoders for different colors
 */
public class LineDecoderGenerator {
    private final BlackLineDecoder[] blackDecoders;

    public LineDecoderGenerator() {
        final LineDecoder[] decoders = new LineDecoder[]{
                new LineDecoder0(),
                new LineDecoder1(),
                new LineDecoder2(),
                new LineDecoder3(),
                new LineDecoder4(),
                new LineDecoder5(),
                new LineDecoder6(),
                new LineDecoder7(),
        };

        blackDecoders = new BlackLineDecoder[]{
                new BlackLineDecoder(decoders[0]),
                new BlackLineDecoder(decoders[1]),
                new BlackLineDecoder(decoders[2]),
                new BlackLineDecoder(decoders[3]),
                new BlackLineDecoder(decoders[4]),
                new BlackLineDecoder(decoders[5]),
                new BlackLineDecoder(decoders[6]),
                new BlackLineDecoder(decoders[7]),
        };
    }
}

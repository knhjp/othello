package fastboard.checkmove.linedecoder;

import fastboard.checkmove.linedecoder.color.BlackLineDecoder;
import fastboard.checkmove.linedecoder.color.WhiteLineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 19, 2010
 * Time: 8:12:59 PM
 * This produces line decoders for different colors
 */
public class LineDecoderGenerator {
    private final BlackLineDecoder[] blackLineDecoders;
    private final WhiteLineDecoder[] whiteLineDecoders;

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

        this.blackLineDecoders = new BlackLineDecoder[]{
                new BlackLineDecoder(decoders[0]),
                new BlackLineDecoder(decoders[1]),
                new BlackLineDecoder(decoders[2]),
                new BlackLineDecoder(decoders[3]),
                new BlackLineDecoder(decoders[4]),
                new BlackLineDecoder(decoders[5]),
                new BlackLineDecoder(decoders[6]),
                new BlackLineDecoder(decoders[7]),
        };

        this.whiteLineDecoders = new WhiteLineDecoder[]{
                new WhiteLineDecoder(decoders[0]),
                new WhiteLineDecoder(decoders[1]),
                new WhiteLineDecoder(decoders[2]),
                new WhiteLineDecoder(decoders[3]),
                new WhiteLineDecoder(decoders[4]),
                new WhiteLineDecoder(decoders[5]),
                new WhiteLineDecoder(decoders[6]),
                new WhiteLineDecoder(decoders[7]),
        };
    }
}

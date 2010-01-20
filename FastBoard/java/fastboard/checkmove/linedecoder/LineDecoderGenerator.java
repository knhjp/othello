package fastboard.checkmove.linedecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 19, 2010
 * Time: 8:12:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class LineDecoderGenerator {
    private final LineDecoder[] decoders = new LineDecoder[]{
            new LineDecoder0(),
            new LineDecoder1(),
            new LineDecoder2(),
            new LineDecoder3(),
            new LineDecoder4(),
            new LineDecoder5(),
            new LineDecoder6(),
            new LineDecoder7(),
    };
    public LineDecoderGenerator() {
    }
}

package fastboard.checkmove.linedecoder.color;

import fastboard.checkmove.linedecoder.LineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 14, 2010
 * Time: 6:46:03 PM
 * This interface acts like a LineDecoder, but it is seen from the side of a color (either black or white)
 */
public interface ColorLineDecoder {
    BlackLineDecoder[] blackDecoders = new BlackLineDecoder[]{
            new BlackLineDecoder(LineDecoder.decoders[0]),
            new BlackLineDecoder(LineDecoder.decoders[1]),
            new BlackLineDecoder(LineDecoder.decoders[2]),
            new BlackLineDecoder(LineDecoder.decoders[3]),
            new BlackLineDecoder(LineDecoder.decoders[4]),
            new BlackLineDecoder(LineDecoder.decoders[5]),
            new BlackLineDecoder(LineDecoder.decoders[6]),
            new BlackLineDecoder(LineDecoder.decoders[7]),
    };
    boolean isMyColor(int line);
    boolean isOppColor(int line);
    boolean isEmpty(int line);
}

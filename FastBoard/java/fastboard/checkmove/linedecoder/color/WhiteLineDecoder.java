package fastboard.checkmove.linedecoder.color;

import fastboard.checkmove.linedecoder.LineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 14, 2010
 * Time: 7:02:53 PM
 * This class decodes a line from the perspective of white
 */

public class WhiteLineDecoder implements ColorLineDecoder {
    private final LineDecoder lineDecoder;
    public WhiteLineDecoder(LineDecoder lineDecoder) {
        this.lineDecoder = lineDecoder;
    }

    @Override public boolean isMyColor(int line) {
        return lineDecoder.isWhite(line);
    }

    @Override
    public boolean isOppColor(int line) {
        return lineDecoder.isBlack(line);
    }

    @Override
    public boolean isEmpty(int line) {
        return lineDecoder.isEmpty(line);
    }
}

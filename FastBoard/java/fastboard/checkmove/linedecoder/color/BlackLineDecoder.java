package fastboard.checkmove.linedecoder.color;

import fastboard.checkmove.linedecoder.LineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 14, 2010
 * Time: 8:52:03 PM
 * This class decodes a line from the perspective of black
 */
public class BlackLineDecoder implements ColorLineDecoder {
    private final LineDecoder lineDecoder;

    public BlackLineDecoder(LineDecoder lineDecoder) {
        this.lineDecoder = lineDecoder;
    }

    @Override public boolean isMyColor(int line) {
        return lineDecoder.isBlack(line);
    }

    @Override public boolean isOppColor(int line) {
        return lineDecoder.isWhite(line);
    }

    @Override public boolean isEmpty(int line) {
        return lineDecoder.isEmpty(line);
    }
}

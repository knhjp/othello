package fastboard.checkmove.linedecoder.color;

import fastboard.checkmove.linedecoder.LineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Jan 14, 2010
 * Time: 8:52:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class BlackLineDecoder implements ColorLineDecoder {
    private final LineDecoder lineDecoder;

    public BlackLineDecoder(LineDecoder lineDecoder) {
        this.lineDecoder = lineDecoder;
    }

    @Override public boolean isMyColor(int line) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public boolean isOppColor(int line) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public boolean isEmpty(int line) {
        return lineDecoder.isEmpty(line);
    }
}

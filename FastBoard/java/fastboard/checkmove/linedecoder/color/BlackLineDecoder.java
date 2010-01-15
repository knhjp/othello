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
    public BlackLineDecoder(LineDecoder lineDecoder) {
    }

    @Override public boolean isMyColor() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public boolean isOppColor() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public boolean isEmpty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}

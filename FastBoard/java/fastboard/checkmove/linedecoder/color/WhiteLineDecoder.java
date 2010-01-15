package fastboard.checkmove.linedecoder.color;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 14, 2010
 * Time: 7:02:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class WhiteLineDecoder implements ColorLineDecoder {
    @Override public boolean isMyColor(int line) {
        return false;
    }

    @Override
    public boolean isOppColor(int line) {
        return false;
    }

    @Override
    public boolean isEmpty(int line) {
        return false;
    }
}

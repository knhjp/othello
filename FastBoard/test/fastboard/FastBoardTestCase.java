package fastboard;

import base.testcase.OthelloTestCase;
import fastboard.checkmove.linedecoder.LineDecoderGenerator;
import fastboard.checkmove.linedecoder.color.BlackLineDecoder;
import fastboard.checkmove.linedecoder.color.WhiteLineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 20-Jan-2010
 * Time: 6:12:07 PM
 * This class contains objects that are commonly used in FastBoard testing
 */
public class FastBoardTestCase extends OthelloTestCase {
    protected final BlackLineDecoder[] blackLineDecoders;
    protected final WhiteLineDecoder[] whiteLineDecoders;

    public FastBoardTestCase() {
        LineDecoderGenerator generator = new LineDecoderGenerator();
        this.blackLineDecoders = generator.getBlackLineDecoders();
        this.whiteLineDecoders = generator.getWhiteLineDecoders();

    }
}

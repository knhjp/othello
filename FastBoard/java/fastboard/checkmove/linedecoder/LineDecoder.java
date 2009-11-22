package fastboard.checkmove.linedecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 7, 2009
 * Time: 7:58:23 PM
 * This helper class it used to determine whether or not a disc is of a particular color for a given line
 */
public interface LineDecoder {
    LineDecoder[] decoders = new LineDecoder[]{
            new LineDecoder0(),
            new FastFlipCalcHelper1(),
            new FastFlipCalcHelper2(),
            new FastFlipCalcHelper3(),
            new FastFlipCalcHelper4(),
            new FastFlipCalcHelper5(),
            new FastFlipCalcHelper6(),
            new FastFlipCalcHelper7(),
    };

    boolean isWhite(int line);
    boolean isBlack(int line);
    boolean isEmpty(int line);
}

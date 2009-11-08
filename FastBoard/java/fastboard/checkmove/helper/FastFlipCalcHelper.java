package fastboard.checkmove.helper;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 7, 2009
 * Time: 7:58:23 PM
 * This helper class it used to determine whether or not a disc is of a particular color
 */
public interface FastFlipCalcHelper {
    boolean isWhite(int line);
    boolean isBlack(int line);
    boolean isEmpty(int line);
}

package fastboard.lineflipper.calc;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jan 10, 2010
 * Time: 12:20:39 PM
 * A simple class to store how many pieces we are flipping on each direction
 */
public class NumFlip {
    public final int upNum;
    public final int downNum;

    public NumFlip(int upNum, int downNum) {
        this.upNum = upNum;
        this.downNum = downNum;
    }
}

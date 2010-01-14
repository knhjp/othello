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

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumFlip numFlip = (NumFlip) o;

        if (downNum != numFlip.downNum) return false;
        if (upNum != numFlip.upNum) return false;

        return true;
    }

    @Override public int hashCode() {
        int result = upNum;
        result = 31 * result + downNum;
        return result;
    }
}

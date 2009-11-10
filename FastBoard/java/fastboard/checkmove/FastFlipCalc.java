package fastboard.checkmove;

import fastboard.checkmove.helper.FastFlipCalcHelper;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 7, 2009
 * Time: 6:11:03 PM
 * This class calculates "lines" to determine whether or not a move is valid due to this line
 */
public class FastFlipCalc {
    private static int threeToTheEighth = 3*3*3*3*3*3*3*3;

    public boolean[] calcIsMoveValidForBlack(final int index) {
        boolean[] ret = new boolean[threeToTheEighth];

        for (int line=0 ; line<threeToTheEighth ; line++) {
            ret[line] = isMoveValidForBlackForThisLine(line,index);
        }

        return ret;
    }

    boolean isMoveValidForBlackForThisLine(int line, int index) {
        if (FastFlipCalcHelper.helpers[index].isEmpty(line)) {
                if (index>1) {
                    int curIndex = index - 1;
                    if (FastFlipCalcHelper.helpers[curIndex].isWhite(line)) {
                        do {
                            curIndex--;
                        } while (curIndex!=0 && FastFlipCalcHelper.helpers[curIndex].isWhite(line));
                        if (FastFlipCalcHelper.helpers[curIndex].isBlack(line)) {
                            return true;
                        }
                    }
                }

                if (index <6) {
                    int curIndex = index + 1;
                    if (FastFlipCalcHelper.helpers[curIndex].isWhite(line)) {
                        do {
                            curIndex++;
                        } while (curIndex!=7 && FastFlipCalcHelper.helpers[curIndex].isWhite(line));
                        if (FastFlipCalcHelper.helpers[curIndex].isBlack(line)) {
                            return true;
                        }
                    }
                }
            }
        return false;
    }
}

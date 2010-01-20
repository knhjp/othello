package fastboard.checkmove.calc;

import fastboard.checkmove.linedecoder.LineDecoder;
import fastboard.checkmove.linedecoder.color.ColorLineDecoder;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Nov 7, 2009
 * Time: 6:11:03 PM
 * This class calculates "lines" to determine whether or not a move is valid due to this line
 */
public class FastCheckCalc {
    public final static int threeToTheEighth = 3*3*3*3*3*3*3*3;
    public final static int squaresForALine = 8;

    public boolean[][] calcIsMoveValid(ColorLineDecoder[] lineDecoders) {
        boolean[][] ret = new boolean[squaresForALine][];

        for (int index=0 ; index<ret.length ; index++) {
            ret[index] = new boolean[threeToTheEighth];

            for (int line=0 ; line<threeToTheEighth ; line++) {
                ret[index][line] = isMoveValidForThisLine(lineDecoders,line,index);
            }
        }

        return ret;
    }

    boolean isMoveValidForThisLine(ColorLineDecoder[] lineDecoders,int line, int index) {
        if (lineDecoders[index].isEmpty(line)) {
                if (index>1) {
                    int curIndex = index - 1;
                    if (lineDecoders[curIndex].isOppColor(line)) {
                        do {
                            curIndex--;
                        } while (curIndex!=0 && lineDecoders[curIndex].isOppColor(line));
                        if (lineDecoders[curIndex].isMyColor(line)) {
                            return true;
                        }
                    }
                }

                if (index<6) {
                    int curIndex = index + 1;
                    if (lineDecoders[curIndex].isOppColor(line)) {
                        do {
                            curIndex++;
                        } while (curIndex!=7 && lineDecoders[curIndex].isOppColor(line));
                        if (lineDecoders[curIndex].isMyColor(line)) {
                            return true;
                        }
                    }
                }
            }
        return false;
    }

    public boolean[][] calcIsMoveValidForBlack() {
        boolean[][] ret = new boolean[squaresForALine][];

        for (int index=0 ; index<ret.length ; index++) {
            ret[index] = new boolean[threeToTheEighth];

            for (int line=0 ; line<threeToTheEighth ; line++) {
                ret[index][line] = isMoveValidForBlackForThisLine(line,index);
            }
        }

        return ret;
    }

    boolean isMoveValidForBlackForThisLine(int line, int index) {
        if (LineDecoder.decoders[index].isEmpty(line)) {
                if (index>1) {
                    int curIndex = index - 1;
                    if (LineDecoder.decoders[curIndex].isWhite(line)) {
                        do {
                            curIndex--;
                        } while (curIndex!=0 && LineDecoder.decoders[curIndex].isWhite(line));
                        if (LineDecoder.decoders[curIndex].isBlack(line)) {
                            return true;
                        }
                    }
                }

                if (index<6) {
                    int curIndex = index + 1;
                    if (LineDecoder.decoders[curIndex].isWhite(line)) {
                        do {
                            curIndex++;
                        } while (curIndex!=7 && LineDecoder.decoders[curIndex].isWhite(line));
                        if (LineDecoder.decoders[curIndex].isBlack(line)) {
                            return true;
                        }
                    }
                }
            }
        return false;
    }

    public boolean[][] calcIsMoveValidForWhite() {
        boolean[][] ret = new boolean[squaresForALine][];

        for (int index=0 ; index<ret.length ; index++) {
            ret[index] = new boolean[threeToTheEighth];

            for (int line=0 ; line<threeToTheEighth ; line++) {
                ret[index][line] = isMoveValidForWhiteForThisLine(line,index);
            }
        }

        return ret;
    }

    boolean isMoveValidForWhiteForThisLine(int line, int index) {
        if (LineDecoder.decoders[index].isEmpty(line)) {
                if (index>1) {
                    int curIndex = index - 1;
                    if (LineDecoder.decoders[curIndex].isBlack(line)) {
                        do {
                            curIndex--;
                        } while (curIndex!=0 && LineDecoder.decoders[curIndex].isBlack(line));
                        if (LineDecoder.decoders[curIndex].isWhite(line)) {
                            return true;
                        }
                    }
                }

                if (index<6) {
                    int curIndex = index + 1;
                    if (LineDecoder.decoders[curIndex].isBlack(line)) {
                        do {
                            curIndex++;
                        } while (curIndex!=7 && LineDecoder.decoders[curIndex].isBlack(line));
                        if (LineDecoder.decoders[curIndex].isWhite(line)) {
                            return true;
                        }
                    }
                }
            }
        return false;
    }
}

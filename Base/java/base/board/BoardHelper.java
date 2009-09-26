package base.board;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 7:34:50 PM
 * This class contains code for assisting dealing with Board
 */
public class BoardHelper {
    public static int[] stringToMoves(String sequence) {
        int[] temp = new int[60];
        int counter = 0;

        String lowerCase = sequence.toLowerCase();

        for (int i=0; i<lowerCase.length()-1 ; i++) {
            char curChar = lowerCase.charAt(i);
            int diff = curChar - 'a';
            if (diff>=0 && diff<8) {
                char nextChar = lowerCase.charAt(i + 1);
                int nextDiff = nextChar - '1';
                if (nextDiff>=0 && nextDiff<8) {
                    temp[counter] = (diff+1) * 10 + nextDiff +1;
                    counter++;
                    i++;
                }
            }
        }

        int[] ret = new int[counter];
        System.arraycopy(temp,0,ret,0,counter);
        return ret;
    }
}

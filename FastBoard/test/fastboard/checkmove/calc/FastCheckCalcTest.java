package fastboard.checkmove.calc;

import base.testcase.OthelloTestCase;
import fastboard.lineconverter.LineConverter;
import fastboard.checkmove.linedecoder.color.BlackLineDecoder;
import fastboard.checkmove.linedecoder.color.ColorLineDecoder;
import fastboard.checkmove.linedecoder.color.WhiteLineDecoder;
import fastboard.checkmove.linedecoder.LineDecoder;
import fastboard.checkmove.linedecoder.LineDecoderGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 10-Nov-2009
 * Time: 3:09:58 PM
 * This tests FastFlipCalc to make sure the arrays that it produced seems valid
 */
public class FastCheckCalcTest extends OthelloTestCase {
    public void testIsMoveValidForThisLine() {
        final LineDecoderGenerator decoderGenerator = new LineDecoderGenerator();
        final BlackLineDecoder[] blackLineDecoders = decoderGenerator.getBlackLineDecoders();
        final WhiteLineDecoder[] whiteLineDecoders = decoderGenerator.getWhiteLineDecoders();

        FastCheckCalc calc = new FastCheckCalc();

        int line;
        int index;

        line = LineConverter.convertStringToLine("________");
        index = 0;
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("_____xo_");
        index = 0;
        assertTrue(calc.isMoveValidForThisLine(blackLineDecoders, line,index));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("_____ox_");
        index = 0;
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders, line,index));
        assertTrue(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("____xoo_");
        index = 0;
        assertTrue(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("____oxx_");
        index = 0;
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertTrue(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        index = 1;
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("____xo_o");
        assertTrue(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("____ox_x");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,index));
        assertTrue(calc.isMoveValidForThisLine(whiteLineDecoders,line,index));

        line = LineConverter.convertStringToLine("__oooox_");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,0));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,1));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,2));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,3));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,4));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,5));
        assertTrue(calc.isMoveValidForThisLine(blackLineDecoders,line,6));
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,7));

        assertTrue(calc.isMoveValidForThisLine(whiteLineDecoders,line,0));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,1));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,2));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,3));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,4));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,5));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,6));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,7));

        //test overflow
        line = LineConverter.convertStringToLine("___ooooo");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,5));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,5));

        line = LineConverter.convertStringToLine("___xxxxx");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,5));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,5));

        line = LineConverter.convertStringToLine("ooooooo_");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,0));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,0));

        line = LineConverter.convertStringToLine("xxxxxxx_");
        assertFalse(calc.isMoveValidForThisLine(blackLineDecoders,line,0));
        assertFalse(calc.isMoveValidForThisLine(whiteLineDecoders,line,0));
    }

    public void testCalcIsMoveValid() {
        final LineDecoderGenerator decoderGenerator = new LineDecoderGenerator();
        final BlackLineDecoder[] blackLineDecoders = decoderGenerator.getBlackLineDecoders();
        final WhiteLineDecoder[] whiteLineDecoders = decoderGenerator.getWhiteLineDecoders();

        FastCheckCalc calc = new FastCheckCalc();

        boolean[][] result = calc.calcIsMoveValid(blackLineDecoders);

        int line = LineConverter.convertStringToLine("xoo__oox");
        assertFalse(result[0][line]);
        assertFalse(result[1][line]);
        assertFalse(result[2][line]);
        assertTrue(result[3][line]);
        assertTrue(result[4][line]);
        assertFalse(result[5][line]);
        assertFalse(result[6][line]);
        assertFalse(result[7][line]);

        result = calc.calcIsMoveValid(whiteLineDecoders);

        line = LineConverter.convertStringToLine("oxx__xxo");
        assertFalse(result[0][line]);
        assertFalse(result[1][line]);
        assertFalse(result[2][line]);
        assertTrue(result[3][line]);
        assertTrue(result[4][line]);
        assertFalse(result[5][line]);
        assertFalse(result[6][line]);
        assertFalse(result[7][line]);

    }

    public void testIsMoveValidForBlackForThisLine() {
        FastCheckCalc calc = new FastCheckCalc();

        int line;
        int index;

        line = LineConverter.convertStringToLine("________");
        index = 0;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("_____xo_");
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("____xoo_");
        index = 0;
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        index = 1;
        assertFalse(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("____xo_o");
        assertTrue(calc.isMoveValidForBlackForThisLine(line,index));

        line = LineConverter.convertStringToLine("__oooox_");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,0));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,1));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,2));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,3));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,4));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,5));
        assertTrue(calc.isMoveValidForBlackForThisLine(line,6));
        assertFalse(calc.isMoveValidForBlackForThisLine(line,7));

        //test overflow
        line = LineConverter.convertStringToLine("___ooooo");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,5));

        line = LineConverter.convertStringToLine("ooooooo_");
        assertFalse(calc.isMoveValidForBlackForThisLine(line,0));
    }

    public void testCalcIsMoveValidForBlack() {
        FastCheckCalc calc = new FastCheckCalc();

        boolean[][] result = calc.calcIsMoveValidForBlack();

        int line = LineConverter.convertStringToLine("xoo__oox");
        assertFalse(result[0][line]);
        assertFalse(result[1][line]);
        assertFalse(result[2][line]);
        assertTrue(result[3][line]);
        assertTrue(result[4][line]);
        assertFalse(result[5][line]);
        assertFalse(result[6][line]);
        assertFalse(result[7][line]);

    }

    public void testCalcIsMoveValidForWhite() {
        FastCheckCalc calc = new FastCheckCalc();

        boolean[][] result = calc.calcIsMoveValidForWhite();

        int line = LineConverter.convertStringToLine("oxx__xxo");
        assertFalse(result[0][line]);
        assertFalse(result[1][line]);
        assertFalse(result[2][line]);
        assertTrue(result[3][line]);
        assertTrue(result[4][line]);
        assertFalse(result[5][line]);
        assertFalse(result[6][line]);
        assertFalse(result[7][line]);

    }
}

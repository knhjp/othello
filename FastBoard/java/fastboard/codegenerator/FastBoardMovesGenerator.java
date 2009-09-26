package fastboard.codegenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: Sep 25, 2009
 * Time: 10:09:11 PM
 * This class writes code for fast move flipping
 */
public class FastBoardMovesGenerator {
    public static void main(String[] args) throws IOException {
        String path = "/home/knhjp/dev/othello/FastBoard/java/fastboard/generated/FastBoardMoves.java";
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write("package fastboard.generated;");
        writer.newLine();
        writer.newLine();
        writer.write("/**");
        writer.newLine();
        writer.write(" * Created by FastBoardMovesGenerator.");
        writer.newLine();
        writer.write(" * User: knhjp");
        writer.newLine();
        writer.write(" * Date: Sep 25, 2009");
        writer.newLine();
        writer.write(" * Time: 10:10:09 PM");
        writer.newLine();
        writer.write(" * This is an auto-generated class! Please edit FastBoardMovesGenerator instead if you want to make changes.");
        writer.newLine();
        writer.write(" */");
        writer.newLine();
        writer.write("public class FastBoardMoves {");
        writer.newLine();
        writer.write("}");
        writer.newLine();

        writer.close();
    }
}

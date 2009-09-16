package simpleboard;

import base.board.Board;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: knhjp
 * Date: 16-Sep-2009
 * Time: 2:09:05 PM
 * This class is meant to be a simple implementation of Board -- it's not going to be the fastest
 */
public class SimpleBoard implements Board {
    private final static int[] initBoard = new int[]{
            3,3,3,3,3,3,3,3,3,3,
            3,0,0,0,0,0,0,0,0,3,
            3,0,0,0,0,0,0,0,0,3,
            3,0,0,0,0,0,0,0,0,3,
            3,0,0,0,-1,1,0,0,0,3,
            3,0,0,0,1,-1,0,0,0,3,
            3,0,0,0,0,0,0,0,0,3,
            3,0,0,0,0,0,0,0,0,3,
            3,0,0,0,0,0,0,0,0,3,
            3,3,3,3,3,3,3,3,3,3};
    private final static int[] directions = new int[]{-11,-10,-9,-1,1,9,10,11};
    private final int[] board = new int[100];
    public SimpleBoard() {
        
    }

    public SimpleBoard(SimpleBoard board) {
        copyBoard(board);
    }

    @Override public void copyBoard(Board board) {
        System.arraycopy(((SimpleBoard)board).board,0,this.board,0,this.board.length);
    }

    @Override public int getSquare(int location) {
        return board[location];
    }

    @Override public void resetToStart() {
        System.arraycopy(initBoard,0,board,0,initBoard.length);
    }

    @Override public boolean isMoveValid(int color, int location) {
        if (board[location] != 0) {
            return false;
        }

        for (int direction : directions) {
            int offset = location + direction;
            if (board[offset] == -color) {
                do {
                    offset += direction;
                } while (board[offset] == -color) ;
                if (board[offset] == color) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override public void makeMove(int color, int location) {
        for (int direction : directions) {
            int offset = location + direction;
            while (board[offset] == -color) {
                offset += direction;
            }
            if (board[offset] == color) {
                do {
                    offset -= direction;
                    board[offset] = color;
                } while (offset != location);
            }
        }
    }

    @Override public int getBlackMinusWhite() {
        return 0; //todo: unit test me and fix me
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleBoard that = (SimpleBoard) o;

        if (!Arrays.equals(board, that.board)) return false;

        return true;
    }

    @Override public int hashCode() {
        int result = directions != null ? Arrays.hashCode(directions) : 0;
        result = 31 * result + (board != null ? Arrays.hashCode(board) : 0);
        return result;
    }
}

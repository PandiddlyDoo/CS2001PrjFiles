import java.util.ArrayList;
import java.util.Arrays;

public class KnightsMove {

    private int[][] board;
    final int NUM_ROWS=8, NUM_COLS=8;
    private int moveCounter=1;
    private int locRow, locCol;

    private final int[] H_SHIFT={2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] V_SHIFT={-1, -2, -2, -1, 1, 2, 2, 1};

    public KnightsMove(int startRow, int startCol){
        locCol=startCol;
        locRow=startRow;
        board=new int [NUM_ROWS][NUM_COLS];
        placePiece(locRow,locCol);

    }

    public boolean makeMove(){
        boolean moveMade=false;
        ArrayList<Integer> moves=getAvailableMoves(locRow,locCol);

        if (moves.size()>0){
            int move=moves.get(0);
            moveMade=placePiece(locRow+V_SHIFT[move], locCol+H_SHIFT[move]);
            locRow=locRow+V_SHIFT[move];
            locCol=locCol+H_SHIFT[move];
        }


        return moveMade;
    }

    public ArrayList<Integer> getAvailableMoves(int row, int col){
        ArrayList<Integer> moves=new ArrayList<>();

        for(int i=0; i<H_SHIFT.length; i++){
            int rowOffset = V_SHIFT[i]+row;
            int colOffset=H_SHIFT[i]+col;
            if(validMove(rowOffset,colOffset)){
                moves.add(i);
            }
        }
        return moves;
    }

    public boolean placePiece(int row, int col){
        boolean piecePlaced=false;
        if (validMove(row, col)) {
            board[row][col]=moveCounter;
            moveCounter++;
            piecePlaced=true;
        }
        return piecePlaced;
    }

    public boolean validMove(int row, int col){

        boolean validTop=row>=0;
        boolean validBottom=row<board.length;
        boolean validLeft=col>=0;

        return validTop && validBottom && validLeft && col<board[row].length && board[row][col]<1;

    }

    public void printBoard(){
        for(int[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }
}

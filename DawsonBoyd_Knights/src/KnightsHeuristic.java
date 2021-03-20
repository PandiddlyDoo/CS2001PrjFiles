import java.util.ArrayList;
import java.util.Arrays;

public class KnightsHeuristic {

    private int[][] board;
    final int NUM_ROWS=8, NUM_COLS=8;
    private int moveCounter=1;
    private int succCount=0, rowStartCount=0, colStartCount=0;
    private int locRow, locCol, accVal, bestMove, steps;

    private final int[] H_SHIFT={2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] V_SHIFT={-1, -2, -2, -1, 1, 2, 2, 1};

    //accessibility "weights"
    private final int[][] access= {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };

    public KnightsHeuristic(int startRow, int startCol){
        locCol=startCol;
        locRow=startRow;
        board=new int [NUM_ROWS][NUM_COLS];
        placePiece(locRow,locCol);
        //running 64 times
        for (int i=0; i<64; i++){
            runKnights();
        }
    }

    public void runKnights(){
        //counting steps while making moves each completed bord gets counted as a success
        while(makeMove()){
            makeMove();
            steps++;
        }

        if (steps==33){
            printBoard();
            System.out.println("Success");
            succCount++;
        }else{
            printBoard();
            System.out.println("Fail");
        }

        System.out.println("Total successes: "+succCount);
        //resetting the board after every dead end or win
        resetKnights();
    }

    public void resetKnights(){
        //resetting all values that need resets
        steps=1;
        moveCounter=1;
        locCol=0;
        locRow=0;
        //loop to move through different tile positions
        if (colStartCount<8){
            colStartCount++;
            locCol= colStartCount;
        }else{
            rowStartCount++;
            locRow=rowStartCount+1;
            colStartCount=0;
        }
        //method call to fill board with 0s again
        clearBoard();


    }
    //basically untouched from lecture. only difference is it chooses the best move
    public boolean makeMove(){
        boolean moveMade=false;
        ArrayList<Integer> moves=getAvailableMoves(locRow,locCol);

        if (moves.size()>0){
            int move=moves.get(bestMove);
            moveMade=placePiece(locRow+V_SHIFT[move], locCol+H_SHIFT[move]);
            locRow=locRow+V_SHIFT[move];
            locCol=locCol+H_SHIFT[move];
        }


        return moveMade;
    }

    public ArrayList<Integer> getAvailableMoves(int row, int col){
        ArrayList<Integer> moves=new ArrayList<>();

        accVal=9;
        int lowV=0;
        //the fun part of this project. Checking against the 2d array for the weight value. if it's lower than the current lowest
        //it saves that one as the best. after all possible moves are calculated we can use the best move makeMove();.
        for(int i=0; i<H_SHIFT.length; i++){
            int rowOffset = V_SHIFT[i]+row;
            int colOffset=H_SHIFT[i]+col;
            if(validMove(rowOffset,colOffset)){
                moves.add(i);
                lowV++;

                if (access[rowOffset][colOffset]<accVal) {
                    accVal=access[rowOffset][colOffset];
                    bestMove=lowV-1;
                }

            }
        }
        return moves;
    }
    //untouched
    public boolean placePiece(int row, int col){
        boolean piecePlaced=false;
        if (validMove(row, col)) {
            board[row][col]=moveCounter;
            moveCounter++;
            piecePlaced=true;
        }
        return piecePlaced;
    }
    //untouched
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
    //method to fill the array with 0s again. Used to be a big nested for loop but intellij helped make it cleaner
    public void clearBoard(){
        for (int[] ints : board) {
            Arrays.fill(ints, 0);
        }
    }
}
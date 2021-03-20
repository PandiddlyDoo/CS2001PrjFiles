import java.util.ArrayList;
import java.util.Arrays;

public class KnightsBrute {

    private int[][] board;
    final int NUM_ROWS=8, NUM_COLS=8;
    private int moveCounter=1;
    private int locRow, locCol;

    ArrayList<Integer> aboveSixty= new ArrayList<>();
    ArrayList<Integer> fiftyToSixty= new ArrayList<>();
    ArrayList<Integer> fortyToFifty= new ArrayList<>();
    ArrayList<Integer> belowForty= new ArrayList<>();

    private final int[] H_SHIFT={2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] V_SHIFT={-1, -2, -2, -1, 1, 2, 2, 1};

    public KnightsBrute(int startRow, int startCol){
        locCol=startCol;
        locRow=startRow;
        board=new int [NUM_ROWS][NUM_COLS];
        placePiece(locRow,locCol);

        //The essence of brute force... we run until it works :)
        int attemptCounter = 0;
        while (moveCounter<64){

            if(makeMove()){
                makeMove();
            }
            //This is where my fun starts. If we fail we count the attempt and send the data over to the fail sorter!
            //(along with resetting similar to the heuristic version.)
            if (!makeMove()){
                failSorter();
                resetKnights();
                attemptCounter++;
            }
        }

        System.out.println("Yikes! It took "+ attemptCounter +" attempts to finish a tour!");
        System.out.println("Winning board:");
        printBoard();

        System.out.println("Fails under 40: "+belowForty.size());
        System.out.println("Fails under 50: "+fortyToFifty.size());
        System.out.println("Fails under 60: "+fiftyToSixty.size());
        System.out.println("Near misses (60-64) scroll up to view: "+aboveSixty.size());

    }

    public void resetKnights(){

        //our only difference here is using randoms as our new start location
        moveCounter=1;
        locCol= (int) (Math.random() * 8) +1;
        locRow= (int) (Math.random() * 8) +1;

        clearBoard();

    }

    public boolean makeMove(){
        boolean moveMade=false;
        ArrayList<Integer> moves=getAvailableMoves(locRow,locCol);

        if (moves.size()>0){
            //again using randoms to select which move to make
            int move=moves.get((int) (Math.random() * moves.size()));
            moveMade=placePiece(locRow+V_SHIFT[move], locCol+H_SHIFT[move]);
            locRow=locRow+V_SHIFT[move];
            locCol=locCol+H_SHIFT[move];
        }


        return moveMade;
    }
    //l79-l116 untouched from lecture version in this one.
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
    //again our tucked away method to clear the board
    public void clearBoard(){
        for (int[] ints : board) {
            Arrays.fill(ints, 0);
        }
    }
    //here we sort each failure and add it to an array list. In the original version I made I printed out every single attempt.
    //That proved problematic since this thing can take millions of attempts so instead I opt to adding each to an arraylist.
    //This could be done with a simple counter but this way lets us access them if we want (I don't recommend).
    public void failSorter(){

        if (moveCounter>=60){
            aboveSixty.add(moveCounter);
            System.out.println("Near miss! "+moveCounter);
        }else if (moveCounter<60&&moveCounter>=50){
            fiftyToSixty.add(moveCounter);
        }else if (moveCounter<50&&moveCounter>=40){
            fortyToFifty.add(moveCounter);
        }else{
            belowForty.add(moveCounter);
        }
    }

}
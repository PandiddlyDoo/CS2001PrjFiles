/**Knights Basic Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */
import java.util.Scanner;

public class KnightsMoveRunner {

    public static void main(String[] args) {
        int r, c, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting row: ");
        r=sc.nextInt();
        System.out.println("Enter starting col: ");
        c=sc.nextInt();
        System.out.println("Enter number of moves: ");
        m=sc.nextInt();

        KnightsMove kt = new KnightsMove(r, c);

        for (int i=0; i<m; i++){
            kt.makeMove();
        }

        kt.printBoard();

    }
}

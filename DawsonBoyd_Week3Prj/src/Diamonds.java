/**Diamonds Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */
import java.util.Scanner;

public class Diamonds {

    public static void main(String[] args) {

        int n; //user input for number of rows

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive odd number 1-19:");

        do {
            n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("That's not odd!");
            } else if (n < 0) {
                System.out.println("That's not positive!");
            } else if (n > 19) {
                System.out.println("That's too large!");
            }
        }while(n < 0 || n %2 == 0);


        for (int i = 1; i < n; i += 2){ //number of iterations based on user input

            for (int j = 0; j < n - 1 - i / 2; j++){//correct number of spaces

                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){// correct number of *

                System.out.print("*");
            }

            System.out.println();
        }

        //same here but in reverse
        for (int i = n; i > 0; i -= 2) {

            for (int j = 0; j < n - 1 - i / 2; j++) {

                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

/**ComparingInts Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */
import java.util.Scanner;

public class ComparingInts {

    public static void main(String[] args) {
        //Declare int variables
        int n1, n2;

        //Input 2 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        n1=input.nextInt();
        System.out.println("Enter second number:");
        n2=input.nextInt();

        //Compare the 2 numbers and print result
        if (n1 > n2){
            System.out.println(n1 + " is larger");
        }else if (n1 < n2) {
            System.out.println(n2 + " is larger");
        }else {
            System.out.println("These numbers are equal");
        }
    }
}

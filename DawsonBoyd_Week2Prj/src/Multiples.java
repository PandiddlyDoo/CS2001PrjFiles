/**Multiples Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        int n1, n2;

        //Input 2 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n1=input.nextInt();
        System.out.println("Enter a number to check multiplicity:");
        n2=input.nextInt();

        //compare using mod
        if (n1%n2==0){
            System.out.println(n2 + " is a multiple of " + n1);
        }else{
            System.out.println(n2 + " is not a multiple of " + n1);
        }
    }
}

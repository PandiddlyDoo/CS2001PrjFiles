/**LargestAndSmallest Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        //Declaring and instantiating ints. Setting min/max values
        int n, biggest=Integer.MIN_VALUE, smallest=Integer.MAX_VALUE;

        //Loop to input all numbers and set values for biggest and smallest
        for (int i=0; i < 5; i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            n=input.nextInt();

            if (n > biggest) {
                biggest=n;
            } if (n < smallest){
                smallest=n;
            }
        }

        //Displaying results
        System.out.println("Largest: " + biggest);
        System.out.println("Smallest: " + smallest);
    }
}

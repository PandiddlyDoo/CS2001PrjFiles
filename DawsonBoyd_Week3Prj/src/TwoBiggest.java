/**TwoBiggest Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

import java.util.Scanner;

public class TwoBiggest {

    public static void main(String[] args) {
        //Declaring and instantiating ints. Setting min values
        int n, biggest=Integer.MIN_VALUE, secondBig=Integer.MIN_VALUE;

        //Loop to input all numbers and set values for biggest
        for (int i=0; i < 10; i++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            n=input.nextInt();

            if (n > biggest) {
                secondBig=biggest;
                biggest=n;
            }
        }

        //Displaying results
        System.out.println("Largest: " + biggest);
        System.out.println("Second largest: " + secondBig);
    }
}
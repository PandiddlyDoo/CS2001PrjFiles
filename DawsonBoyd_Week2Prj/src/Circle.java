/**Circle Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        //Declaring vars
        int r;
        double f;

        //scanner to collect radius
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        r=input.nextInt();

        //Calculating and printing
        f= 2*r;
        System.out.printf("diameter= %f\n", f);

        f= 2*Math.PI*r;
        System.out.printf("circumference= %f\n", f);

        f=Math.PI*(r*r);
        System.out.printf("area= %f\n", f);
    }
}

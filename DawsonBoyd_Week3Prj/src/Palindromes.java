/**Palindromes Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        int n1, n2, n4,  n5, number=0; //you can see we skip 3 here as in a 5 letter palindrome the middle doesn't matter
        boolean counter=false;

        Scanner input = new Scanner(System.in);

        //Our digit counter to verify a 5 digit input (Intellij's Git integration showed me the !counter trick :D)
        while (!counter) {

            System.out.println("Enter a five digit number:");
            number=input.nextInt();

            if (number<100000 && number>9999) {
                counter = true;
            }
        }
        //My messy number separator from last week
        n1 = number / 10000;
        n2= (number%10000) / 1000;
        n4= (((number%10000) % 1000) % 100) / 10;
        n5= (((number%10000) % 1000) %100) % 10;

        //checking for reflectivity!
        if (n1==n5 && n2==n4){
            System.out.println(number + " is a palindrome!");
        }else System.out.println(number + " is not a palindrome. :(");

    }
}

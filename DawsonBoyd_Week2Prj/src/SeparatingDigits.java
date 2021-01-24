import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {

        //ints for numbers, divided numbers, and string for spaces
        int n, d1, d2, d3, d4, d5;
        String s="   ";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit number:");
        n=input.nextInt();

        //Tried for a while to find a clean way to do this with a loop... ended up being more messy than intended
        d1 = n / 10000;
        d2= (n%10000) / 1000;
        d3= ((n%10000) % 1000) / 100;
        d4= (((n%10000) % 1000) % 100) / 10;
        d5= (((n%10000) % 1000) %100) % 10;

        //using flags and a string for the spaces saves room here
        System.out.printf("%d%s%d%s%d%s%d%s%d", d1, s, d2, s, d3, s, d4, s, d5);

    }
}

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Hi " + name + "! I'm Dawson");
        in.close();
        System.out.println("I'm excited to start OOP!");
        System.out.println("I took CS0 with Charles last semester and really enjoyed the class.");
        System.out.println("It looks like this class will push my limits and I'm excited to get into it!");
    }
}

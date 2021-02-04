/**Triples Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */
public class Triples {

    public static void main(String[] args) {

        /*Triple nested for loop
        a^2+b^2=c^2 <- our rule
        brute force solution but that's what the book wanted*/

        int loops=100; //int for # of iterations for easy scalability

        for (int a=0; a<loops; a++){

            for (int b=0; b<loops; b++){

                for (int c=0; c<loops; c++){
                    if (a*a+b*b==c*c){
                        System.out.println("side1: "+a+" side2: "+b+" hypotenuse: "+c);
                    }
                }
            }
        }
    }
}

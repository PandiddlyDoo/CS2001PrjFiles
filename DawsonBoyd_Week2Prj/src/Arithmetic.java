/**Arithmetic MVC Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticView view =new ArithmeticView();
        ArithmeticModel model=new ArithmeticModel(0, 0, 0, 0, 0, 0);
        ArithmeticController control =new ArithmeticController(view, model);
    }
}

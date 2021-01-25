/**OddOrEven MVC Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci 2001
 */

public class OddOrEven {

    public static void main(String[] args) {
        OddOrEvenView view =new OddOrEvenView();
        OddOrEvenModel model=new OddOrEvenModel(0);
        OddOrEvenController control =new OddOrEvenController(view, model);
    }
}
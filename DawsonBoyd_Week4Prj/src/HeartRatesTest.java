/**HeartRate MVC Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRatesView  view = new HeartRatesView();
        HeartRatesModel model = new HeartRatesModel("none", "none", 0, 0, 0);
        HeartRatesController control = new HeartRatesController(view,  model);
    }
}

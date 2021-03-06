/**Josephus MVC Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */

public class Main {
    public static void main(String[] args) {
        JosephusView  view = new JosephusView();
        JosephusModel model = new JosephusModel();
        JosephusController control = new JosephusController(view,  model);
    }
}
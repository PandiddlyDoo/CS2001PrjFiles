/**Invoice MVC Project
 * @author Dawson Boyd
 * @version Spring 2021
 * CSci2001
 */

public class InvoiceTest {
    public static void main(String[] args) {
        InvoiceView  view = new InvoiceView();
        InvoiceModel model = new InvoiceModel("none", "none", 0, 0);
        InvoiceController control = new InvoiceController(view,  model);
    }
}

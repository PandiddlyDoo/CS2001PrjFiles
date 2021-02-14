public class InvoiceTest {
    public static void main(String[] args) {
        InvoiceView  view = new InvoiceView();
        InvoiceModel model = new InvoiceModel("none", "none", 0, 0);
        InvoiceController control = new InvoiceController(view,  model);
    }
}

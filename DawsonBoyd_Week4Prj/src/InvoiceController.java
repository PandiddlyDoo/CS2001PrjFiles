import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoiceController implements ActionListener {
    InvoiceView v;
    InvoiceModel m;

    public InvoiceController(InvoiceView v, InvoiceModel m){
        this.m=m;
        this.v=v;
        v.getSubmitButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InvoiceModel testInvoice = new InvoiceModel("0453-14C", "Flathead screwdriver",1, 13.45);
        v.getResults().setText(testInvoice.getNumber()+ "\n" + testInvoice.getDescription() + "\n" + testInvoice.getQuantity() + "\n" + testInvoice.getPrice());
    }
}

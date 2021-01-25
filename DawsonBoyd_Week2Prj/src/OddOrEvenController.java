import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddOrEvenController implements ActionListener {
    OddOrEvenView v;
    OddOrEvenModel m;

    public OddOrEvenController(OddOrEvenView  v, OddOrEvenModel m){
        this.m=m;
        this.v=v;
        v.getEqualsButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        m.setNumber(Integer.parseInt(v.getNumberField().getText()));
        v.getResults().setText(m.isEven());

    }
}
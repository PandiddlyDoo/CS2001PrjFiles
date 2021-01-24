import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticController implements ActionListener {
    ArithmeticView v;
    ArithmeticModel m;

    public ArithmeticController(ArithmeticView  v, ArithmeticModel m){
        this.m=m;
        this.v=v;
        v.getEqualsButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        m.setOp1(Integer.parseInt(v.getOp1Field().getText()));
        m.setOp2(Integer.parseInt(v.getOp2Field().getText()));
        m.setSum(m.sumOperands());
        m.setDifference(m.subtractOperands());
        m.setProduct(m.multiplyOperands());
        m.setQuotient(m.divideOperands());
        v.getResults().setText("Sum="+m.getSum()+"\nDifference="+m.getDifference()+"\nProduct="+m.getProduct()+"\nQuotient="+m.getQuotient());

    }
}

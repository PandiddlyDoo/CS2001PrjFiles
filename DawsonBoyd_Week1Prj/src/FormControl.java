import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormControl implements ActionListener {
    FormView v;
    FormModel m;

    public FormControl(FormView v, FormModel m){
        this.m=m;
        this.v=v;
        v.getSubmitButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        m.setFName(v.getFNameField().getText());
        m.setLName(v.getLNameField().getText());
        m.setEAdd(v.getEAddField().getText());
        m.setHAdd(v.getHAddField().getText());
        m.setName(m.combineNames());
        v.getDataLabel().setText(m.getName()+ "\n" + m.getEAdd() + "\n" + m.getHAdd());

    }
}

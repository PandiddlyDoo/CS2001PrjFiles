import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JosephusController implements ActionListener {
    JosephusView v;
    JosephusModel m;

    public JosephusController(JosephusView v, JosephusModel m){
        this.m=m;
        this.v=v;
        v.getSubmitButton().addActionListener(this);
    }

//    public void deathMessage(int dead){
//        v.getResults().append("\nNumber "+dead+" has died.");
//    }
//
//    public void lastMessage(int safe){
//        v.getResults().append("\nNumber "+safe+" is safe.");
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        m.Josephus(Integer.parseInt(v.getStartField().getText()),  Integer.parseInt(v.getSkipField().getText()), Integer.parseInt(v.getPeopleField().getText()));

    }
}
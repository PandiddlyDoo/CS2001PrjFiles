import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeartRatesController implements ActionListener {
    HeartRatesView v;
    HeartRatesModel m;

    public HeartRatesController(HeartRatesView v, HeartRatesModel m){
        this.m=m;
        this.v=v;
        v.getSubmitButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        HeartRatesModel user =new HeartRatesModel(v.getfNameField().getText(), v.getlNameField().getText(),
                Integer.parseInt(v.getMonthField().getText()), Integer.parseInt(v.getDayField().getText()), Integer.parseInt(v.getYearField().getText()));

        //The way I was going to do it before I realized I could use the constructor. I don't know which one is "proper" MVC form
        //since the way its currently being done kinda works inside the "Controller" class. Clarification would be appreciated.
        /*
        m.setfName(v.getfNameField().getText());
        m.setlName(v.getlNameField().getText());
        m.setMonth(Integer.parseInt(v.getMonthField().getText()));
        m.setDay(Integer.parseInt(v.getDayField().getText()));
        m.setYear(Integer.parseInt(v.getYearField().getText()));
        */

        v.getResults().setText(user.getfName()+" "+user.getlName()+ "\nBecause you were born on "+user.getMonth()+"/"+user.getDay()+"/"+user.getYear()+
                ".\nYou are "+user.getAge()+" years old.\nAccording to the AHA, your maximum heart rate should be "+user.getMaxHeartRate()+"bpm." +
                "\nYour target heart rate should be between "+user.getLowerHeartRate()+" and "+user.getMaxHeartRate()+ "bpm.");
    }
}


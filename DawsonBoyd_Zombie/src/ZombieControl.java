
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZombieControl implements ActionListener {
    private ZombieFrame view;
    private ApocalypseSimulator model;
    public String userInput;

    public ZombieControl(ZombieFrame view, ApocalypseSimulator model) {
        this.view = view;
        this.model = model;
        view.getSubmitButton().addActionListener(this);
    }

    public void startOfGame(int days, int minZombies, int maxZombies, int food, int people) {
        view.getOutputArea().setText("You have " + days + " days to survive. \nEach night between " + minZombies + " and " + maxZombies + " zombies will attack \n"
                + "You have enough food for " + (food / days) + " people to survive for " + days + "  days."
                +"\nBut uh oh, you have "+people+" people! Good luck! Type \"sleep\" to start your first sleepless night.");
    }

    public void critMessage(){
        view.getOutputArea().append("\nCritical hit! The zombie's remains splatter across the wall!");
    }

    public void killMessage(){
        view.getOutputArea().append("\nYou kill the zombie!");
    }

    public void deathMessage(){
        view.getOutputArea().append("\nOh no! You are mauled to death by the undead.");
    }

    public void survivalMessage(){
        view.getOutputArea().append("\n-----------------------------------");
        view.getOutputArea().append("\nCongratulations! You survived the night! "+Constants.DAYS+" days remain."
        +"\nyou currently have "+Constants.PEOPLE+" people remaining, "+Constants.FOOD+" food remaining, and "+Constants.AMMO+" ammo remaining."
        +"\nType \"sleep\" to fight off another wave or \"venture\" to risk a journey into a wasteland for supplies. \n(Chance that you may not return) (Immediately starts next night)");
    }

    public void ventureMessage(){
        view.getOutputArea().append("\n-----------------------------------");
        view.getOutputArea().append("\nYou return from your venture."
                +"\nYou now have "+Constants.PEOPLE+" people remaining, "+Constants.FOOD+" food remaining, and "+Constants.AMMO+" ammo remaining.");
        view.getOutputArea().append("\n-----------------------------------");
    }

    public void winMessage(){
        view.getOutputArea().append("\n-----------------------------------");
        view.getOutputArea().append("\nCongratulations! You survived all "+Constants.DAYS+ " days!"
                +"\nyou finished with "+Constants.PEOPLE+" people remaining, "+Constants.FOOD+" food remaining, and "+Constants.AMMO+" ammo remaining.");
    }

    public void foodLossMessage(){
        view.getOutputArea().append("\n-----------------------------------");
        view.getOutputArea().append("\nOh no!! You ran out of food and lost! D:");

    }

    public void peopleLossMessage(){
        view.getOutputArea().append("\n-----------------------------------");
        view.getOutputArea().append("\nOh no!! Everyone died! D:");
    }

    //ActionPerformed to allow for user input.
    @Override
    public void actionPerformed(ActionEvent e) {
        view.getOutputArea().append("\n");
        model.inputText(view.getInputField().getText());
        view.getOutputArea().append(model.outputText(""));
        userInput=view.getInputField().getText();
        if (userInput.equals("sleep")){
            model.sleep();
            userInput="";
        }
        if (userInput.equals("venture")) {
            model.venture();
            userInput = "";
        }
    }


}
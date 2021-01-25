import javax.swing.*;
import java.awt.*;

public class OddOrEvenView extends JFrame {
    //declare
    private JButton equalsButton;
    private JTextField numberField, results;
    private JLabel numberLabel;

    public OddOrEvenView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    //instantiate
    public void setUpGUI(){
        numberField= new JTextField(4);
        results=new JTextField(4);
        equalsButton=new JButton("Calculate!");
        numberLabel=new JLabel("Enter number");
    }

    //Add
    public void addComponents(){
        add(numberLabel);
        add(numberField);
        add(equalsButton);
        add(results);
    }


    public JButton getEqualsButton() {
        return equalsButton;
    }

    public JTextField getNumberField() {
        return numberField;
    }

    public JTextField getResults() {
        return results;
    }
}
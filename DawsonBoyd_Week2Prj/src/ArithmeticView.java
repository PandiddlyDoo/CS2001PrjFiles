import javax.swing.*;
import java.awt.*;

public class ArithmeticView extends JFrame {
    //declare
    private JButton equalsButton;
    private JTextField op1Field, op2Field;
    private JTextArea results;
    private JLabel op1Label, op2Label;

    public ArithmeticView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    //instantiate
    public void setUpGUI(){
        op1Field= new JTextField(4);
        op2Field=new JTextField(4);
        results=new JTextArea(10, 10);
        equalsButton=new JButton("Calculate!");
        op1Label=new JLabel("Number 1");
        op2Label=new JLabel("Number 2");
    }

    //Add
    public void addComponents(){
        add(op1Label);
        add(op1Field);
        add(op2Label);
        add(op2Field);
        add(equalsButton);
        add(results);
    }


    public JButton getEqualsButton() {
        return equalsButton;
    }

    public JTextField getOp1Field() {
        return op1Field;
    }

    public JTextField getOp2Field() {
        return op2Field;
    }

    public JTextArea getResults() {
        return results;
    }
}

import javax.swing.*;
import java.awt.*;

public class FormView extends JFrame {
    private JButton submitButton;
    private JTextField fNameField, lNameField, eAddField, hAddField;
    private JLabel fNameLabel, lNameLabel, eAddLabel, hAddLabel;

    //I know this was supposed to be a JLabel, However I couldn't figure out a way to create a new line without html or swingX
    private JTextArea dataLabel;

    public FormView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    public void setUpGUI() {
        submitButton = new JButton("Submit");
        fNameField = new JTextField(12);
        lNameField = new JTextField(12);
        eAddField = new JTextField(12);
        hAddField=new JTextField(12);
        fNameLabel = new JLabel("First Name:");
        lNameLabel = new JLabel("Last Name:");
        eAddLabel = new JLabel("eMail Address:");
        hAddLabel=new JLabel("Home Address:");
        dataLabel=new JTextArea(5, 30);
    }

    public void addComponents(){
        add(fNameLabel);
        add(fNameField);
        add(lNameLabel);
        add(lNameField);
        add(eAddLabel);
        add(eAddField);
        add(hAddLabel);
        add(hAddField);
        add(submitButton);
        add(dataLabel);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JTextField getFNameField() {
        return fNameField;
    }

    public JTextField getLNameField() {
        return lNameField;
    }

    public JTextField getEAddField() {
        return eAddField;
    }

    public JTextField getHAddField() {
        return hAddField;
    }

    public JTextArea getDataLabel() {
        return dataLabel;
    }
}

import javax.swing.*;
import java.awt.*;

//GUI Class untouched from lecture files

public class ZombieFrame extends JFrame {
    private JPanel inputPanel, outputPanel, titlePanel;
    private JTextField inputField;
    private JButton submitButton;
    private JLabel inputLabel, titleLabel;
    private JTextArea outputArea;
    private JScrollPane scroll;


    public ZombieFrame(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUpInputs();
        setUpOutput();
        setUpTitle();
        pack();
        setVisible(true);
    }

    public void setUpInputs(){
        inputPanel=new JPanel(new FlowLayout());
        inputLabel=new JLabel("Input Command: ");
        inputField=new JTextField(25);
        submitButton=new JButton("submit command");

        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(submitButton);

        add(inputPanel, BorderLayout.SOUTH);
    }

    public void setUpOutput(){
        outputPanel=new JPanel(new FlowLayout());
        outputArea=new JTextArea(25,50);
        scroll=new JScrollPane(outputArea);
        outputPanel.add(scroll);
        add(outputPanel, BorderLayout.CENTER);
    }
    public void setUpTitle(){
        titlePanel=new JPanel(new FlowLayout());
        titleLabel=new JLabel("ZOMBIE ATTACK");
        titlePanel.add(titleLabel);
        add(titlePanel,BorderLayout.NORTH);
    }



    public JTextField getInputField() {
        return inputField;
    }

    public void setInputField(JTextField inputField) {
        this.inputField = inputField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JTextArea getOutputArea() {
        return outputArea;
    }

    public void setOutputArea(JTextArea outputArea) {
        this.outputArea = outputArea;
    }
}


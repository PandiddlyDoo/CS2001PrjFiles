import javax.swing.*;
import java.awt.*;

public class JosephusView extends JFrame {
    private JPanel fieldPanel, outputPanel, titlePanel;
    private JTextField startField, skipField, peopleField;
    private JButton submitButton;
    private JLabel startLabel, skipLabel, peopleLabel, titleLabel;
    private JTextArea outputArea;
    private JScrollPane scroll;

    public JosephusView(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUpInputs();
        setUpOutput();
        setUpTitle();
        pack();
        setVisible(true);
    }

    public void setUpInputs(){
        fieldPanel=new JPanel(new FlowLayout());
        startField=new JTextField(2);
        skipField=new JTextField(2);
        peopleField=new JTextField(2);
        startLabel=new JLabel("Starting index:");
        skipLabel=new JLabel("Number of people to skip:");
        peopleLabel=new JLabel("number of people in circle:");
        submitButton=new JButton("Submit!");

        add(fieldPanel);
        fieldPanel.add(startLabel);
        fieldPanel.add(startField);
        fieldPanel.add(skipLabel);
        fieldPanel.add(skipField);
        fieldPanel.add(peopleLabel);
        fieldPanel.add(peopleField);
        fieldPanel.add(submitButton);

        add(fieldPanel, BorderLayout.SOUTH);
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
        titleLabel=new JLabel("JOSEPHUS PROBLEM");
        titlePanel.add(titleLabel);
        add(titlePanel,BorderLayout.NORTH);
    }


    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JTextField getStartField() {
        return startField;
    }

    public void setStartField(JTextField startField) {
        this.startField = startField;
    }

    public JTextField getSkipField() {
        return skipField;
    }

    public void setSkipField(JTextField skipField) {
        this.skipField = skipField;
    }

    public JTextField getPeopleField() {
        return peopleField;
    }

    public void setPeopleField(JTextField peopleField) {
        this.peopleField = peopleField;
    }

    public JTextArea getOutputArea() {
        return outputArea;
    }

    public void setOutputArea(JTextArea outputArea) {
        this.outputArea = outputArea;
    }

    public JLabel getStartLabel() {
        return startLabel;
    }

    public void setStartLabel(JLabel startLabel) {
        this.startLabel = startLabel;
    }

    public JLabel getSkipLabel() {
        return skipLabel;
    }

    public void setSkipLabel(JLabel skipLabel) {
        this.skipLabel = skipLabel;
    }

    public JLabel getPeopleLabel() {
        return peopleLabel;
    }

    public void setPeopleLabel(JLabel peopleLabel) {
        this.peopleLabel = peopleLabel;
    }

    public JPanel getFieldPanel() {
        return fieldPanel;
    }

    public void setFieldPanel(JPanel fieldPanel) {
        this.fieldPanel = fieldPanel;
    }
}
import javax.swing.*;
import java.awt.*;

public class JosephusView extends JFrame {
    private JButton submitButton;
    private JTextField startField, skipField, peopleField;
    private JTextArea results;
    private JLabel startLabel, skipLabel, peopleLabel;
    private JPanel fieldPanel;
    private JScrollPane scroll;

    public JosephusView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    public void setUpGUI(){
        fieldPanel=new JPanel(new FlowLayout());
        fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.X_AXIS)); //seems to do nothing
        startField=new JTextField(2);
        skipField=new JTextField(2);
        peopleField=new JTextField(2);
        startLabel=new JLabel("Starting index:");
        skipLabel=new JLabel("Number of people to skip:");
        peopleLabel=new JLabel("number of people in circle:");
        submitButton=new JButton("Submit!");
        results=new JTextArea(15, 15);
        scroll=new JScrollPane(fieldPanel);
        results.add(scroll);
    }

    public void addComponents(){

        add(fieldPanel);
        fieldPanel.add(startLabel);
        fieldPanel.add(startField);
        fieldPanel.add(skipLabel);
        fieldPanel.add(skipField);
        fieldPanel.add(peopleLabel);
        fieldPanel.add(peopleField);
        add(submitButton);
        add(results);
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

    public JTextArea getResults() {
        return results;
    }

    public void setResults(JTextArea results) {
        this.results = results;
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
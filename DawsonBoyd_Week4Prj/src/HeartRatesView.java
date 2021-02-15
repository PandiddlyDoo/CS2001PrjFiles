import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HeartRatesView extends JFrame {
    private JButton submitButton;
    private JTextField fNameField, lNameField, monthField, dayField, yearField;
    private JTextArea results;
    private JLabel fNameLabel, lNameLabel, monthLabel, dayLabel, yearLabel;
    private JPanel fieldPanel;

    public HeartRatesView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    public void setUpGUI(){
        fieldPanel=new JPanel();
        fieldPanel.setLayout(new BoxLayout(fieldPanel, BoxLayout.X_AXIS)); //seems to do nothing
        fNameField=new JTextField(10);
        lNameField=new JTextField(10);
        monthField=new JTextField(2);
        dayField=new JTextField(2);
        yearField=new JTextField(4);
        fNameLabel=new JLabel("First name:");
        lNameLabel=new JLabel("Last name:");
        monthLabel=new JLabel("Month (00):");
        dayLabel=new JLabel("Day (00):");
        yearLabel=new JLabel("Year (0000):");
        submitButton=new JButton("Submit!");
        results=new JTextArea(15, 15);
    }

    public void addComponents(){

        //Tried to get a boxlayout to work but couldn't figure it out and started to late to ask for help
        add(fieldPanel);
        fieldPanel.add(fNameLabel);
        fieldPanel.add(fNameField);
        fieldPanel.add(lNameLabel);
        fieldPanel.add(lNameField);
        fieldPanel.add(monthLabel);
        fieldPanel.add(monthField);
        fieldPanel.add(dayLabel);
        fieldPanel.add(dayField);
        fieldPanel.add(yearLabel);
        fieldPanel.add(yearField);
        add(submitButton);
        add(results);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JTextField getfNameField() {
        return fNameField;
    }

    public void setfNameField(JTextField fNameField) {
        this.fNameField = fNameField;
    }

    public JTextField getlNameField() {
        return lNameField;
    }

    public void setlNameField(JTextField lNameField) {
        this.lNameField = lNameField;
    }

    public JTextField getMonthField() {
        return monthField;
    }

    public void setMonthField(JTextField monthField) {
        this.monthField = monthField;
    }

    public JTextField getDayField() {
        return dayField;
    }

    public void setDayField(JTextField dayField) {
        this.dayField = dayField;
    }

    public JTextField getYearField() {
        return yearField;
    }

    public void setYearField(JTextField yearField) {
        this.yearField = yearField;
    }

    public JTextArea getResults() {
        return results;
    }

    public void setResults(JTextArea results) {
        this.results = results;
    }
}

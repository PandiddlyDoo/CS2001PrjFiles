import javax.swing.*;
import java.awt.*;

public class InvoiceView extends JFrame {
    private JButton submitButton;
    private JTextArea results;

    public InvoiceView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setUpGUI();
        addComponents();
        pack();
        setVisible(true);
    }

    public void setUpGUI(){
        submitButton=new JButton("Find part!");
        results=new JTextArea(15, 10);

    }

    public void addComponents(){
        add(submitButton);
        add(results);
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JTextArea getResults() {
        return results;
    }

    public void setResults(JTextArea results) {
        this.results = results;
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormApplet extends JApplet {
    private JTextField nameField, ageField;
    private JButton submitButton;
    private JLabel resultLabel;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(this::createGUI);
        } catch (Exception e) {
            System.out.println("Error creating GUI: " + e.getMessage());
        }
    }

    private void createGUI() {
        setLayout(new FlowLayout());

        add(new JLabel("Name: "));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Age: "));
        ageField = new JTextField(5);
        add(ageField);

        submitButton = new JButton("Submit");
        add(submitButton);

        resultLabel = new JLabel(" ");
        add(resultLabel);

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            resultLabel.setText("Submitted: " + name + ", Age: " + age);
        });
    }
}

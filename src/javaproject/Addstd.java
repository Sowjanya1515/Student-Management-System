package javaproject;

import javax.swing.*;
import java.awt.*;

public class Addstd {

    public Addstd() {
        JFrame frame = new JFrame("Add Student");
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(4,2));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel rollLabel = new JLabel("Roll:");
        JTextField rollField = new JTextField();
        JLabel branchLabel = new JLabel("Branch:");
        JTextField branchField = new JTextField();
        JButton saveBtn = new JButton("Save");

        frame.add(nameLabel); frame.add(nameField);
        frame.add(rollLabel); frame.add(rollField);
        frame.add(branchLabel); frame.add(branchField);
        frame.add(new JLabel()); frame.add(saveBtn);

        saveBtn.addActionListener(e -> {
            try {
                String name = nameField.getText();
                int roll = Integer.parseInt(rollField.getText());
                String branch = branchField.getText();

                StudentData.students.add(new Student(name, roll, branch));
                JOptionPane.showMessageDialog(frame, "Student Added!");
                frame.dispose();
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Enter valid details.");
            }
        });

        frame.setVisible(true);
    }
}

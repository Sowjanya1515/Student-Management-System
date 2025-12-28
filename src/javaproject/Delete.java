

package javaproject;

import javax.swing.*;
import java.awt.*;

public class Delete {

    public Delete() {
        JFrame frame = new JFrame("Delete Student");
        frame.setSize(400,200);
        frame.setLayout(new GridLayout(3,2));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel rollLabel = new JLabel("Enter Roll Number:");
        JTextField rollField = new JTextField();
        JButton deleteBtn = new JButton("Delete");

        frame.add(rollLabel); frame.add(rollField);
        frame.add(new JLabel()); frame.add(deleteBtn);

        deleteBtn.addActionListener(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                boolean removed = StudentData.students.removeIf(s -> s.roll == roll);
                if(removed) {
                    JOptionPane.showMessageDialog(frame, "Student Deleted!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Student not found!");
                }
                frame.dispose();
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid roll number!");
            }
        });

        frame.setVisible(true);
    }
}


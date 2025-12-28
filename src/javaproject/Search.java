package javaproject;

import javax.swing.*;
import java.awt.*;

public class Search {

    public Search() {
        JFrame frame = new JFrame("Search Student");
        frame.setSize(400,200);
        frame.setLayout(new GridLayout(3,2));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel rollLabel = new JLabel("Enter Roll Number:");
        JTextField rollField = new JTextField();
        JButton searchBtn = new JButton("Search");

        frame.add(rollLabel); frame.add(rollField);
        frame.add(new JLabel()); frame.add(searchBtn);

        searchBtn.addActionListener(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                boolean found = false;
                for(Student s : StudentData.students) {
                    if(s.roll == roll) {
                        JOptionPane.showMessageDialog(frame, s.toString());
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    JOptionPane.showMessageDialog(frame, "Student not found!");
                }
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid roll number!");
            }
        });

        frame.setVisible(true);
    }
}

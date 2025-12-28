package javaproject;

import javax.swing.*;
import java.awt.*;

public class Viewstd {

    public Viewstd() {
        JFrame frame = new JFrame("View Students");
        frame.setSize(400,300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea area = new JTextArea();

        // Explicitly use the toString() for readable output
        for(Student s : StudentData.students) {
            area.append(s.toString() + "\n");
        }
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area);
        frame.add(scroll, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

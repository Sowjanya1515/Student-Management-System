package javaproject;

import javax.swing.*;
import java.awt.*;

public class Mainscreen {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management System");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,1));

        JLabel title = new JLabel("Student Management System", SwingConstants.CENTER);
        JButton addBtn = new JButton("Add Student");
        JButton viewBtn = new JButton("View Students");
        JButton exitBtn = new JButton("Exit");
        JButton searchBtn = new JButton("Search Student");
        JButton deleteBtn = new JButton("Delete Student");

        frame.setLayout(new GridLayout(6,1));
        frame.add(title);
        frame.add(addBtn);
        frame.add(viewBtn);
        frame.add(searchBtn);
        frame.add(deleteBtn);
        frame.add(exitBtn);

        addBtn.addActionListener(e -> new Addstd());
        viewBtn.addActionListener(e -> new Viewstd());
        searchBtn.addActionListener(e -> new Search());
        deleteBtn.addActionListener(e -> new Delete());
        exitBtn.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}

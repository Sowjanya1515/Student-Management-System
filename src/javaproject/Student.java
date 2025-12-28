package javaproject;

public class Student {
    String name;
    int roll;
    String branch;

    // Constructor
    public Student(String name, int roll, String branch) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    }

    // Proper toString() to show readable output
    @Override
    public String toString() {
        return "Name: " + name + " | Roll: " + roll + " | Branch: " + branch;
    }
}

package com.programs;
import java.util.*;

class Student1 implements Comparable<Student1> {
    private int id;
    private String firstName;
    private double cgpa;

    public Student1(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student1 other) {
        if (this.cgpa != other.cgpa) {
            return Double.compare(other.cgpa, this.cgpa); // sort by CGPA in decreasing order
        } else if (!this.firstName.equals(other.firstName)) {
            return this.firstName.compareTo(other.firstName); // sort by first name in alphabetical order
        } else {
            return Integer.compare(this.id, other.id); // sort by ID in increasing order
        }
    }
}

public class ComparatorDemCHATGPT {
    public static void main(String[] args) {
        List<Student1> Student1s = new ArrayList<>();
        Student1s.add(new Student1(1, "Alice", 3.8));
        Student1s.add(new Student1(2, "Bob", 3.9));
        Student1s.add(new Student1(3, "Charlie", 3.7));
        Student1s.add(new Student1(4, "David", 3.9));

        Collections.sort(Student1s,Collections.reverseOrder());

        for (Student1 s : Student1s) {
            System.out.println(s.getId() + " " + s.getFirstName() + " " + s.getCgpa());
        }
    }
}
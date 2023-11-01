package com.example.week09part2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        Student student1 = new Student(1, "ABC1", "XYZ1");
        student1.addMarks("COMP 1011", 70);
        student1.addMarks("COMP 1012", 99);
        student1.addMarks("COMP 1013", 24);
        student1.addMarks("COMP 1013", 24);

        Student student2 = new Student(2, "ABC3", "XYZ2");
        student2.addMarks("COMP 1011", 11);
        student2.addMarks("COMP 1012", 22);
        student2.addMarks("COMP 1013", 33);

        Student student3 = new Student(3, "ABC3", "XYZ3");
        student3.addMarks("COMP 1011", 44);
        student3.addMarks("COMP 1012", 55);
        student3.addMarks("COMP 1013", 65);

        // array list
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student1);
        studentArrayList.add(student3);

        // hash set
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.addAll(studentArrayList);

        // tree set
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.addAll(studentArrayList);

        // stream
        studentArrayList.stream().filter(abc -> abc.getStudentId() > 0)
                .sorted()
                .forEach(System.out::println);
    }
}
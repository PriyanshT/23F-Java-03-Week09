package com.example.week09part2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Student implements Comparable<Student> {
    private int studentId;
    private String firstName, lastName;
    private HashMap<String, Integer> courses;

    public Student(int studentId, String firstName, String lastName) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        courses = new HashMap<>();
    }

    public void addMarks(String courseCode, int marks){
        if(marks >= 0 && marks <= 100){
            if(courseCode.matches("[A-Z]{4}\\s\\d{4}")){ // [A-Z][A-Z][A-Z][A-Z] [0-9][0-9][0-9][0-9]
                courses.put(courseCode, marks);
            } else {
                throw new IllegalArgumentException("Course code must start with first 4 capital characters," +
                        "followed by a space, followed by 4 digits.");
            }
        } else {
            throw new IllegalArgumentException("Marks should be in the range [0-100].");
        }
    }

    public Set<String> getCourseCodes(){
        return courses.keySet();
    }

    public Collection<Integer> getMarks(){
        return courses.values();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.getStudentId() - otherStudent.getStudentId();
    }
}

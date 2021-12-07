package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private Course course;

    public Student(Course course){
        System.out.println("constructor called");
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
        System.out.println("setter called");
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }
}

package de.neuefische.day7.model;

import java.util.List;
import java.util.Random;

public class StudentDB {
    private List<Student> students;

    public StudentDB(List<Student> students) {
        this.students = students;
    }

    public List<Student> list() {
        return students;
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public Student randomStudent() {
        Student result;
        Random random = new Random();
        int randomIndex = random.nextInt(students.size());
        return students.get(randomIndex);
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }
}


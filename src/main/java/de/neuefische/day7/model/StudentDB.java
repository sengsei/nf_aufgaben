package de.neuefische.day7.model;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private final Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return Arrays.toString(students);
    }

    public Student randomStudent() {
        Student result;
        Random random = new Random();
        int randomIndex = random.nextInt(students.length);
        return students[randomIndex];
    }
}

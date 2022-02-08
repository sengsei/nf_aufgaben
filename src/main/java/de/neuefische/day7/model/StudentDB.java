package de.neuefische.day7.model;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {
    private Student[] students;

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

    public void add(Student student) {
        int lengthOfNewStudentArray = students.length + 1;
        Student[] studentsActual = new Student[lengthOfNewStudentArray];
        System.arraycopy(students, 0, studentsActual, 0, students.length);
        studentsActual[students.length] = student;
        students = studentsActual;
    }

    public void remove(Student student) {
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(student)) {
                students = ArrayUtils.remove(students,i );
                }
            }
        }
    }


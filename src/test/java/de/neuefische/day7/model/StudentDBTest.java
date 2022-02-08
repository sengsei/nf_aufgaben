package de.neuefische.day7.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldGetlistOfStudents() {
        Student s1 = new Student("Klaus", "Meier", 1234);
        Student s2 = new Student("Alice", "Bob", 12354);
        Student[] students = {s1, s2};
        StudentDB studentDB = new StudentDB(students);

        assertEquals(students, studentDB.list());
    }

    @Test
    void shouldReturnFormatedStringOfStudents() {
        Student s1 = new Student("Klaus", "Meier", 1234);
        Student[] students = {s1};
        StudentDB studentDB = new StudentDB(students);

        assertEquals("[Student{firstname='Klaus', lastname='Meier', id=1234}]", studentDB.toString());
    }

    @Test
    void showRandomStudents() {
        Student s1 = new Student("Klaus", "Meier", 1234);
        Student s2 = new Student("Alice", "Bob", 1235);
        Student s3 = new Student("Bob", "Alice", 1236);
        Student[] students = {s1, s2, s3};
        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB.randomStudent());


    }




}
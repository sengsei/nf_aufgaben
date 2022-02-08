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

    @Test
    void addStudentToArrayTest() {
        Student s1 = new Student("Alice", "Bob", 1235);
        Student[] students = new Student[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);

        assertEquals("Student{firstname='Alice', lastname='Bob', id=1235}", s1.toString());
    }

    @Test
    void removeStudentToArrayTest() {
        Student s1 = new Student("Alice", "Bob", 1235);
        Student[] students = new Student[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);
        studentDB.remove(s1);

        assertEquals("[]", studentDB.toString());
    }


}
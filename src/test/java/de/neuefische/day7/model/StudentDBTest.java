package de.neuefische.day7.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldGetlistOfStudents() {
        Student s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        PhysicsStudent s2 = new PhysicsStudent("Alice", "Bob", 12354);
        Student[] students = {s1, s2};
        StudentDB studentDB = new StudentDB(students);

        assertEquals(students, studentDB.list());
    }

    @Test
    void shouldReturnFormatedStringOfStudents() {
        PhysicsStudent s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        PhysicsStudent[] students = {s1};
        StudentDB studentDB = new StudentDB(students);

        assertEquals("[Student{firstname='Klaus', lastname='Meier', id=1234}]", studentDB.toString());
    }

    @Test
    void showRandomStudents() {
        PhysicsStudent s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        PhysicsStudent s2 = new PhysicsStudent("Alice", "Bob", 1235);
        PhysicsStudent s3 = new PhysicsStudent("Bob", "Alice", 1236);
        PhysicsStudent[] students = {s1, s2, s3};
        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB.randomStudent());
    }

    @Test
    void addStudentToArrayTest() {
        PhysicsStudent s1 = new PhysicsStudent("Alice", "Bob", 1235);
        PhysicsStudent[] students = new PhysicsStudent[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);

        assertEquals("Student{firstname='Alice', lastname='Bob', id=1235}", s1.toString());
    }

    @Test
    void removeStudentToArrayTest() {
        PhysicsStudent s1 = new PhysicsStudent("Alice", "Bob", 1235);
        PhysicsStudent[] students = new PhysicsStudent[0];
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);
        studentDB.remove(s1);

        assertEquals("[]", studentDB.toString());
    }


}
package de.neuefische.day7.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void shouldGetlistOfStudents() {
        Student s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        PhysicsStudent s2 = new PhysicsStudent("Alice", "Bob", 12354);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        StudentDB studentDB = new StudentDB(students);

        assertEquals(students, studentDB.list());
    }

    @Test
    void shouldReturnFormatedStringOfStudents() {
        PhysicsStudent s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        StudentDB studentDB = new StudentDB(students);

        assertEquals("[Student{firstname='Klaus', lastname='Meier', id=1234}]", studentDB.toString());
    }

    @Test
    void showRandomStudents() {
        PhysicsStudent s1 = new PhysicsStudent("Klaus", "Meier", 1234);
        PhysicsStudent s2 = new PhysicsStudent("Alice", "Bob", 1235);
        PhysicsStudent s3 = new PhysicsStudent("Bob", "Alice", 1236);
        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(s1, s2, s3));
        StudentDB studentDB = new StudentDB(students);
        System.out.println(studentDB.randomStudent());
    }

    @Test
    void addStudentToArrayTest() {
        PhysicsStudent s1 = new PhysicsStudent("Alice", "Bob", 1235);
        List<Student> students = new ArrayList<>();
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);

        assertEquals("Student{firstname='Alice', lastname='Bob', id=1235}", s1.toString());
    }

    @Test
    void removeStudentToArrayTest() {
        PhysicsStudent s1 = new PhysicsStudent("Alice", "Bob", 1235);
        List<Student> students = new ArrayList<>();
        StudentDB studentDB = new StudentDB(students);
        studentDB.add(s1);
        studentDB.remove(s1);

        assertEquals("[]", studentDB.toString());
    }


}
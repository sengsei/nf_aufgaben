package de.neuefische.day7part2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void anzahlModuleBioAndPhy() {
        BiologieStudent b1 = new BiologieStudent("Alice", "Bob", 123);
        PhysicsStudent p1 = new PhysicsStudent("Bob", "Alice", 123456);

        assertEquals(20, p1.anzahlModule());
        assertEquals(25, b1.anzahlModule());
    }

    @Test
    void addStudentToMap() {
        BiologieStudent b1 = new BiologieStudent("Alice", "Bob", 123);
        Map<Integer, Student> students = new HashMap<>();
        students.put(b1.getId(), b1);

        assertEquals("Student{firstname='Alice', lastname='Bob', id=123}", students.get(123).toString());
    }

    @Test
    void removeStudentFromMap() {
        BiologieStudent b1 = new BiologieStudent("Alice", "Bob", 123);
        Map<Integer, Student> students = new HashMap<>();
        students.put(b1.getId(), b1);
        students.remove(123);

        assertEquals(null, students.get(123));

    }
}
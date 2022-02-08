package de.neuefische.day7.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRecTest {

    @Test
    void changeFirstName() {
        StudentRec s1 = new StudentRec("Alice", "Bob", 1234);
        var s2 = s1.changeFirstName("Tux");

        assertEquals("Tux",s2.firstname());
    }
}
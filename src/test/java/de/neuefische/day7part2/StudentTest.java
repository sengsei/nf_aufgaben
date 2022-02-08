package de.neuefische.day7part2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void anzahlModuleBioAndPhy() {
        BiologieStudent b1 = new BiologieStudent("Alice", "Bob", 123);
        PhysicsStudent p1 = new PhysicsStudent("Bob", "Alice", 123456);

        assertEquals(20, p1.anzahlModule());
        assertEquals(25, b1.anzahlModule());
    }
}
package de.neuefische.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void shouldBeStudent2() {
        // given
        String[] student = new String[10];
        student[2] = "Student <2>";

        // when
        String[] resultArray = Arrays.fillStudentArray(student);
        String result = resultArray[2];

        // then
        assertEquals("Student <2>",result);
    }

}
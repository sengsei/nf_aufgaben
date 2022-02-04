package de.neuefische.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void shouldBeStudent2() {
        // given
        int number = 10;

        // when
        String[] resultArray = Arrays.fillStudentArray(number);
        String result = resultArray[2];

        // then
        assertEquals("Student <2>",result);
    }

}
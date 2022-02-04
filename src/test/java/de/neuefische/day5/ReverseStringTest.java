package de.neuefische.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void shouldBWord_eolleH(){
        // given
        String word = "Hello";

        // when
        String result = ReverseString.reverseStringWithRecursion(word);

        //then
        assertEquals("olleH", result);
    }

}
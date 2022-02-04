package de.neuefische.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibWith1() {
        // given
        int number = 1;

        // when
        int result = Fibonacci.fib(number);

        // then
        assertEquals(1, result);
    }

    @Test
    void fibWith4() {
        // given
        int number = 4;

        // when
        int result = Fibonacci.fib(number);

        // then
        assertEquals(3, result);
    }
}
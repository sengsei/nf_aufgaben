package de.neuefische.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    @Test
    void calcfacwith0() {
        // given
        int number = 0;

        // when
        int result = Fakultaet.calcfac(number);

        // then
        assertEquals(1, result);
    }

    @Test
    void calcfacwith1() {
        // given
        int number = 1;

        // when
        int result = Fakultaet.calcfac(number);

        // then
        assertEquals(1, result);
    }

    @Test
    void calcfacwith6() {
        // given
        int number = 6;

        // when
        int result = Fakultaet.calcfac(number);

        // then
        assertEquals(720, result);
    }

    @Test
    void calcfacwith0While() {
        // given
        int number = 0;

        // when
        int result = Fakultaet.calcfacWithWhile(number);

        // then
        assertEquals(1, result);
    }

    @Test
    void calcfacwith1While() {
        // given
        int number = 1;

        // when
        int result = Fakultaet.calcfacWithWhile(number);

        // then
        assertEquals(1, result);
    }

    @Test
    void calcfacwith6While() {
        // given
        int number = 6;

        // when
        int result = Fakultaet.calcfacWithWhile(number);

        // then
        assertEquals(720, result);
    }
}
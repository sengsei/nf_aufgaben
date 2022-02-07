package de.neuefische.day6;

import de.neuefische.day6.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getFirstnameTest() {
        //given
        Student student = new Student();
        student.setFirstname("Klaus");
        //when
        String result = student.getFirstname();
        //then
        assertEquals("Klaus", result);
    }

    @Test
    void setFirstnameTest() {
        //given
        Student student = new Student();
        //when
        student.setFirstname("Klaus");
        //then
        assertEquals("Klaus", student.getFirstname());
    }

    @Test
    void getLastnameTest() {
        //given
        Student student = new Student();
        student.setLastname("Müller");
        //when
        String result = student.getLastname();
        //then
        assertEquals("Müller", result);
    }

    @Test
    void setLastnameTest() {
        //given
        Student student = new Student();
        //when
        student.setLastname("Müller");
        //then
        assertEquals("Müller", student.getLastname());
    }

    @Test
    void getMatNrTest() {
        //given
        Student student = new Student();
        //when
        student.setMatNr("123456");
        //then
        assertEquals("123456", student.getMatNr());
    }

    @Test
    void setMatNrTest() {
        //given
        Student student = new Student();
        //when
        student.setMatNr("12345");
        //then
        assertEquals(student.getMatNr(), "12345");
    }

    @Test
    void isEnrolledTest() {
        //given
        Student student = new Student();
        //when
        student.setEnrolled(true);
        //then
        assertTrue(student.isEnrolled());
    }

    @Test
    void setEnrolledTest() {
        //given
        Student student = new Student();
        //when
        student.setEnrolled(false);
        //then
        assertFalse(student.isEnrolled());
    }

    @Test
    void useConstructorWithtoStringTest() {
        //given
        Student student = new Student("Klaus", "Meier", "123456", true);
        //when
        String result = student.toString();
        //then
        assertEquals("Student{firstname='Klaus', lastname='Meier', matNr='123456', enrolled=true}", result);
    }
}
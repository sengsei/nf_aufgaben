package de.neuefische.day7part2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class StudentDB {
    private Map<Integer, Student> students;

    public StudentDB(Map<Integer, Student> students) {
        this.students = students;
    }

    public Map<Integer, Student> list() {
        return students;
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public Student randomStudent() {
        Student result;
        Random random = new Random();
        int randomIndex = random.nextInt(students.size());
        return students.get(randomIndex);
    }

    public void add(Student student) {
        students.put(student.getId(), student);
    }

    public void remove(Student student) {
        students.remove(student.getId());
    }
}


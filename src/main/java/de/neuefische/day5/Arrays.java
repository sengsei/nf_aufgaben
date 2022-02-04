package de.neuefische.day5;

public class Arrays {

    String[] students = new String[10];

    public static String[] fillStudentArray(String[] students) {
        for (int i = 0; i < students.length; i++){
            students[i] = "Student <" + i + ">";
        }
        return students;
    }
}

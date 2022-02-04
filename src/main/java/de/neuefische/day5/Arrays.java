package de.neuefische.day5;

public class Arrays {



    public static String[] fillStudentArray(int number) {

        String[] students = new String[number];
        for (int i = 0; i < students.length; i++){
            students[i] = "Student <" + i + ">";
        }
        return students;
    }
}

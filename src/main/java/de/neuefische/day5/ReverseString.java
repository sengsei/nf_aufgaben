package de.neuefische.day5;

public class ReverseString {

    public static String reverseStringWithRecursion(String word) {

        if (word.length() < 1) return "";

        return reverseStringWithRecursion(word.substring(1))
                + word.charAt(0);
    }
}

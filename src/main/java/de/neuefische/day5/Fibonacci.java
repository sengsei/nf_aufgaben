package de.neuefische.day5;

public class Fibonacci {

    public static int fib(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }
}
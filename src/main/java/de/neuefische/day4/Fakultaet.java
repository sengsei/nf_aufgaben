package de.neuefische.day4;

public class Fakultaet {

    public static int calcfac(int number) {
        if (number == 0) {
            return 1;
        }
        int fac = 1;
        for (int i = 1; i <= number; i++ ) {
            //fac *= i;
            fac = fac * i;

        }

        return fac;
    }

    public static int calcfacWithWhile(int number) {
        int fac = 1;
        if (number == 0) {
            return fac;
        }

        int i = 1;
        while (i <= number){
            fac *= i;
            i++;

        }

        return fac;
    }

    public static int calcfacWithRecursion(int number) {

        if (number == 0) {
            return 1;
        }

        return number * calcfacWithRecursion(number - 1);
    }

}

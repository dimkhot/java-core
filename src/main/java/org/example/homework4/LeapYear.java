package org.example.homework4;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(450));
        System.out.println(isLeapYear(800));
        System.out.println(isLeapYear(364));
        System.out.println(isLeapYear(-145));
        System.out.println(isLeapYear(100000));
    }

    private static boolean isLeapYear(int daysInYear) {
        System.out.println("Is Leap Year method call with this " + daysInYear + " value");
        if (daysInYear >= 1 && daysInYear <= 9999) {
            if (isDivisible(daysInYear, 4) && !isDivisible(daysInYear, 100)) {
                return true;
            } else if (isDivisible(daysInYear, 100) && isDivisible(daysInYear, 400)) {
                return true;
            }

        }
        return false;
    }

    private static boolean isDivisible(int a, int b) {
        return a % b == 0;
    }
}

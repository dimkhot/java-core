package org.example.homework4;

public class MinToDaysAndYears {
    public static void main(String[] args) {
        System.out.println(printYearsAndDays(62222885));
        System.out.println(printYearsAndDays(1232885));
        System.out.println(printYearsAndDays(-2234));
        System.out.println(printYearsAndDays((long) 0.25));
    }

    private static String printYearsAndDays(long minutes) {
        int minInYear = 525600;
        int minInDay = 1440;
        System.out.println("printYearsAndDays method started with value: " + minutes);
        if (minutes < 0) {
            return "Invalid Value";
        } else {
            int yearsCount = (int) (minutes / minInYear);
            int daysCount = (int) (minutes % minInYear) / minInDay;
            return minutes + " min = " + yearsCount + " y " + " and " + daysCount + " d";
        }
    }
}

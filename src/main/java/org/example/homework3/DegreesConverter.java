package org.example.homework3;

public class DegreesConverter {
    public static void main (String[] args){
        double celsius = 36.0;
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Convertion to Fahrenheit - " + fahrenheit);
        System.out.println("Convertion to Kelvin - " + kelvin);
    }
}

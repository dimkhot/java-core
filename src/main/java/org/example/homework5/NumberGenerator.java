package org.example.homework5;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int counter = 0;
        int[] ints = new int[11];
        for (int i = 0; i < ints.length; i++) {
            int randomNumber = random.nextInt(10) + 1;

            System.out.println(randomNumber);
            if (ints[randomNumber] == randomNumber){
                System.out.println("Last random " + randomNumber);
                break;
            } else {
                ints[randomNumber] = randomNumber;
                sum += randomNumber;
                counter++;
            }

        }
        System.out.println(sum);
        System.out.println("Counter " + counter);
    }
}

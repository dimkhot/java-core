package org.example.homework5;

import java.util.Random;

public class SortAdnPrintArray {
    public static void main(String[] args) {
        int[] numbers = getIntegers(10);
        printArray(numbers);
        int[] test = {4, 66, 25, 43, 21, 8, 43, 53, 68, 64};
        int[] sortedNumbers = sortIntegers(test);
        printArray(sortedNumbers);
    }

    private static int[] sortIntegers(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null");
            return new int[0];
        } else {
            boolean flag = false;
            int counter = 0;
            do {
                flag = true;
                for (int i = 0; i < arr.length - 1 - counter; i++) {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                        flag = false;
                    }
                }
                counter++;
            } while (flag == false);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contains %d\n", i, array[i]);
        }
    }

    private static int[] getIntegers(int size) {
        int[] ints = new int[size];
        Random rand = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100);
        }
        return ints;
    }
}

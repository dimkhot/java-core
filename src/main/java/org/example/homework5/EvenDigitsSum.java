package org.example.homework5;

public class EvenDigitsSum {
    public static void main(String[] args) {
        int number = 12456788;
        System.out.println(getEvenDigitSum(number));
    }

    private static int getEvenDigitSum(int number) {
        if (number >= 0){
            int sum = 0;
            while (number != 0){
                if (number%2==0){
                    sum += number%10;
                }
                number = number/10;
            }
            return sum;
        }else return -1;
    }
}

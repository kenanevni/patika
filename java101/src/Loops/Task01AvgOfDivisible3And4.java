package Loops;
/*
 * Write a program that calculates the average of numbers divisible by 3 and 4 from the numbers 0
 * through the number entered.
 * */

import java.util.Scanner;

public class Task01AvgOfDivisible3And4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberLimit = input.nextInt();
        int avg = 0, sum = 0, k = 0;

        // numberLimit included

        for (int i = 1; i <= numberLimit; i++) {
            if (i % 12 == 0) {
                sum += i;
                k++;
            }

        }
        avg = sum / k;
        System.out.println("From 0 to "+ numberLimit +" average of numbers divisible with 3 and 4 = " + avg);
    }

}

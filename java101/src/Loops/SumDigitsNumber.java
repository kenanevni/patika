package Loops;

import java.util.Scanner;

public class SumDigitsNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println("Sum Of the Digits Of " + number + " is " + sumDigitsNumber(number));


    }
    public static int sumDigitsNumber(int number) {
        int tempNumber;
        int sum = 0;

        while (number != 0) {
            tempNumber = number % 10;
            sum += tempNumber;
            number /= 10;

        }
        return sum;

    }

}

package Loops;

import java.util.Scanner;

public class SumDigitsNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println("Sum Of the Digits Of " + number + " is " + sumDigitsNumber(number));


    }

}

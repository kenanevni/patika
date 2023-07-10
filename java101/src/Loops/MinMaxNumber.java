package Loops;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        int min=2147483647;
        int max = -2147483648 ;
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Min and Max Number Finder");
        System.out.println("Please enter how many number would you like to compare");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            numbers = input.nextInt();

            if (numbers > max) {
                max = numbers;
            }
            if (numbers < min) {
                min = numbers;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

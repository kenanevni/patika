package Loops;

import java.util.Scanner;

public class PowerOfNumbersToLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program aim to print Powers of from 2 to given numbers till reach given limit");
        System.out.println("Please enter base number");
        int baseNumber = scanner.nextInt();
        System.out.println("Please enter limit");
        int limit = scanner.nextInt();
        int k = 2;
        do {
            for (int i = 1, l = 0; i < limit; i *= k, l++) {
                System.out.println(k + " to " + l + ". power is " + i);
            }
            System.out.println("**********");
            k++;

        } while (k <= baseNumber);


    }
}

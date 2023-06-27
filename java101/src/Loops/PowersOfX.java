package Loops;

import java.util.Scanner;

public class PowersOfX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets learn Powers of 2\n Please enter base number");
        int baseNumber = scan.nextInt();
        System.out.println("Please enter limit");
        int limit = scan.nextInt();

        for (int i = 1, k = 0; i <= limit; k++, i *= baseNumber) {
            System.out.println(baseNumber + " to " + k + ". power is " + i);


        }
    }
}

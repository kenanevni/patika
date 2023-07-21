package Loops;

import java.util.Scanner;

public class NFactorial {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer ");
        int n = scanner.nextInt();
       int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial*=i;

        }
        System.out.println("factorial = " + factorial);


    }
}

package Loops;

import java.util.Scanner;

public class PowersOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lets learn n to  r Powers \n Please enter number n");
        int n = scan.nextInt();
        System.out.println("Please enter r");
        int r = scan.nextInt();
        int result = 1;
        for (int i = n, k = 0; k < r; k++) {

            result *= i;
        }
        System.out.println("result = " + result);

    }
}

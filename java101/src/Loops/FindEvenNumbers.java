package Loops;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a even number");
            }
        }


    }
}

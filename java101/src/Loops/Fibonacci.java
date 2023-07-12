package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();

    }

    public static void fibonacci() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int firstItem = 0;
        int secondItem = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstItem + " ");
            int nextItem = firstItem + secondItem;
            firstItem = secondItem;
            secondItem = nextItem;
        }


    }
}

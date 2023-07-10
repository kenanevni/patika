package Loops;

import java.util.Scanner;

public class LCMAndHCFWithForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Highest Common Factor and Least Common Multiple Finder");
        System.out.println("Please enter two integer");
        int a = input.nextInt();
        int b = input.nextInt();

    }
    //Highest Common Factor of two integer
    public static int hcf(int a, int b) {
        int remainder = 1;
        int temp;
        Scanner input = new Scanner(System.in);


        for (int i = 0; remainder > 0; i++) {
            remainder = a % b;
            a = b;
            b = remainder;

        }

        return a;

    }
    //Least Common Multiple
    public static int lcf(int a, int b) {
        int lcf = (a * b) / hcf(a, b);
        return lcf;
    }


}

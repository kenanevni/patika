package Loops;

import java.util.Scanner;

public class LCMAndHCFWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Highest Common Factor and Least Common Multiple Finder");
        System.out.println("Please enter two integer");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Highest Common Factor (HCF) = " + hcf(a, b));
        System.out.println("Least Common Multiple (LCF) = " + lcf(a, b));

    }

    //Highest Common Factor of two integer
    public static int hcf(int a, int b) {
        int remainder = 1;
        Scanner input = new Scanner(System.in);
        while(remainder>0){
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

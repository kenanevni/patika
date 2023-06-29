package Loops;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int digitNumberCounter = 0;
        int tempInput = input;
        //let's find digit-number of input
        while (input != 0) {
            input /= 10;
            digitNumberCounter++;
        }
        System.out.println("tempInput = " + tempInput);
        System.out.println("input = " + input);
        System.out.println("digitNumberCounter = " + digitNumberCounter);
        //let's find numeric values of input
        while (tempInput != 0) {
            tempInput %=10;
        }


        System.out.println("tempInput2 = " + tempInput);
    }
}

package Loops;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int digitNumberCounter = 0;
        int tempInput = input;
        int numericValueOfInput;
        int digitNumberPow;
        int result = 0;
        //let's find digit-number of input
        while (tempInput != 0) {
            tempInput /= 10;
            digitNumberCounter++;
        }//because of whlile loop tempInput = 0

        //let's find numeric values of input
        tempInput = input;
        while (tempInput != 0) {
            numericValueOfInput = tempInput % 10;
            digitNumberPow = 1;
            for (int i = 0; i < digitNumberCounter; i++) {
                digitNumberPow *= numericValueOfInput;
            }
            result += digitNumberPow;
            tempInput /= 10;
            System.out.println("numericValueOfInput = " + numericValueOfInput);
            System.out.println("digitNumberPow = " + digitNumberPow);
            System.out.println("sub total = " + result);
        }


        if (result == input) {
            System.out.println("Input number is " + input + "\nResult is " + result + "\nThis is a Armstrong number");
        } else
            System.err.println("Input number is " + input + "\nResult is " + result + "\nThis is NOT a Armstrong number");

    }
}

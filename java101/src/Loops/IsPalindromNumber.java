package Loops;

import java.util.Scanner;

public class IsPalindromNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrom());

    }

    static boolean isPalindrom() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int temp = number;
        int reversedNumber = 0;
        int lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            //System.out.println("reversedNumber = " + reversedNumber);
            temp /= 10;
        }
        if (number == reversedNumber) {
            return true;
        } else return false;
    }

}

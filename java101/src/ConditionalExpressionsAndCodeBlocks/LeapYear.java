package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Leap Year Calculator");
        System.out.println("Enter the year and lets check ? Leap Or Not");
        int leapYear = input.nextInt();

        if (leapYear % 400 == 0) {
            System.out.println(leapYear + " is  leapYear");
        } else if ((leapYear % 4 == 0) && (leapYear % 100 != 0)) {
            System.out.println(leapYear + " is  leapYear");
        }else
            System.out.println(leapYear + " is NOT leapYear");
    }
}

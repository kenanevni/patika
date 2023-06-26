package Loops;
/*We write a program that accepts input from the user until a negative value is entered and adds the odd numbers from the entered values and prints it on the screen.*/

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int total = 0;//default value  0 ineffective element
        do {
            n = scan.nextInt();
            if (n % 2 != 0) { // if n is odd adding total
                total += n;
            }
        } while (n > 0);
        System.out.println("total = " + total);
    }
}

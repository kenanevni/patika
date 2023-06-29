package Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int digitNumberCounter = 0;
        //let's find digit-number of input
        while (input != 0) {
            input /= 10;
            digitNumberCounter++;
        }
        System.out.println("digitNumberCounter = " + digitNumberCounter);


    }
}

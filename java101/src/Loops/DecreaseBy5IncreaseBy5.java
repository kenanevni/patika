package Loops;

import java.util.Scanner;

public class DecreaseBy5IncreaseBy5 {

    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        decreaseIncrease(number);
    }

    static void decreaseIncrease(int number) {

        if (number < -4 )
            return;

        else {
            System.out.print(number+ " ");

            // Statement 2
            decreaseIncrease(number - 5);

            // printFun(test + 5);
            System.out.print(number+ " ");
            return;
        }
    }
}




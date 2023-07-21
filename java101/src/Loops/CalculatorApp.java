package Loops;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1- Addition\n" +
                "2- Subtract\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Power\n" +
                "6- Factorial\n" +
                "7- Remainder\n" +
                "8- Rectangle Area And Perimeter";

        do {
            System.out.println(menu);
            System.out.print("Please enter your choice");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    substraction();
                    break;
                case 3:
                    multplacation();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    remainder();
                    break;
                case 8:
                    rectangle();
                    break;

                default:
                    System.out.println("You entered wrong number");
            }
        } while (repeat());


    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);

    }
    static void substraction () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a - b);
    }
    static void multplacation () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a * b);
    }
    static void division () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        if (b == 0) {
            System.err.println(a + "CAN NOT dıvıde by 0");
        }else System.out.println( a / b);
    }
    static void power () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number n");
        int n = scan.nextInt();
        System.out.println("Please enter r");
        int r = scan.nextInt();
        int result = 1;
        for (int i = n, k = 0; k < r; k++) {

            result *= i;
        }
        System.out.println(result);
    }
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
    static void remainder() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter dividing number");
        int dividinNumber = input.nextInt();
        System.out.println("Please enter divider number");
        int divider = input.nextInt();
        if (divider == 0) {
            System.err.println(dividinNumber + " CAN NOT divide by zero");

        } else System.out.println(dividinNumber % divider);

    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter long edge");
        int longEdge = input.nextInt();
        System.out.println("Please enter short edge");
        int shortEdge = input.nextInt();
        System.out.println("Perimeter is " + 2 * (longEdge + shortEdge) + "\n" +
                "Area is " + longEdge * shortEdge);
    }





    static boolean repeat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to make another operation? \nPlease type antthing for Yes or type NO or N " + "(capital or small case does not matter) for " + "No");
        String response = input.next();
        if ((response.equalsIgnoreCase("no") || (response.equalsIgnoreCase("n"))))

            return false;

        else return true;


    }

}

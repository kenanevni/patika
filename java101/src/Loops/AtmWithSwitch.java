package Loops;

import java.util.Scanner;

public class AtmWithSwitch {
    public static int balance;
    public static int attemp = 3;

    public static void main(String[] args) {
        credentials();

    }

    public static void credentials() {

        Scanner input = new Scanner(System.in);

        int choice;
        while (attemp > 0) {
            System.out.println("Welcome to ATM");
            System.out.println(" please enter your username");
            String userName = input.nextLine();
            System.out.println(" please enter your password");
            String password = input.nextLine();
            if (userName.equals("customer") && password.equals("pass")) {
                System.out.println("Credentials matched welcome " + userName);
                do {
                    System.out.println("Please make your choice");
                    System.out.println("1-Deposit\n" + "2-Withdraw\n" + "3-Check Balance\n" + "4-Exit");
                    choice = input.nextInt();
                    menu(choice);

                } while (choice != 4);
                {
                    System.out.println("Thanks. See yoo later.");
                    break;
                }


            } else {
                attemp--;
                System.err.println("Wrong credentials please re enter your credentials.");
                System.err.println("Remained attemp : " + attemp);
                if (attemp == 0) {
                    System.err.println("Soory your account is blocked Please contact to admin.");
                }
            }
        }


    }

    public static void menu(int select) {
        Scanner input = new Scanner(System.in);
        int amount;

        switch (select) {
            case 1:
                System.out.println("Please enter deposit amount");
                amount = input.nextInt();
                deposit(amount);
                System.out.println("balance = " + balance);
                break;
            case 2:
                System.out.println("Please enter withdraw amount");
                amount = input.nextInt();
                withdraw(amount);
                System.out.println("balance = " + balance);
                break;
            case 3:
                System.out.println("balance = " + balance);
                break;
            default:
                System.out.println("balance = " + balance);


        }

    }

    public static int deposit(int money) {
        balance += money;
        return balance;
    }

    public static int withdraw(int money) {
        if (money > balance) {
            System.err.println("insufficient balance");
        } else balance -= money;
        return balance;

    }
}

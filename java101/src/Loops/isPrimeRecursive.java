package Loops;
import java.util.Scanner;

public class isPrimeRecursive {

    static boolean isPrime(int num, int divisor) {
        if (divisor <= 1) {
            return true;
        } else {
            if (num % divisor == 0) {
                return false;
            } else {
                return isPrime(num, divisor - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = isPrime(number, number - 1);
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
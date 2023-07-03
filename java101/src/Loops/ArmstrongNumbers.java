package Loops;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.println("Armstrong numbers up to " + limit + ":");
        for (int number = 0; number <= limit; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
        public static boolean isArmstrongNumber(int number) {

            int tempNumber = number;
            int sum = 0;
            while (tempNumber != 0) {
                int numericValueOfInput = tempNumber % 10;
                int digitNumberPow = 1;
                for (int i = 0; i < getNumberOfDigits(number); i++) {
                    digitNumberPow *= numericValueOfInput;
                }
                sum += digitNumberPow;
                tempNumber /= 10;
            }
            return sum == number;

        }


    }


}

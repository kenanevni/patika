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
    }


}

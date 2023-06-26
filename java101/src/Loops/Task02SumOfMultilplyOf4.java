package Loops;
import java.util.Scanner;
public class Task02SumOfMultilplyOf4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,sum = 0;

        do {
            n = scan.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        }

        while (n % 2 == 0);
        System.out.println("Sum of Divisible 4 numbers " +sum);
    }
}

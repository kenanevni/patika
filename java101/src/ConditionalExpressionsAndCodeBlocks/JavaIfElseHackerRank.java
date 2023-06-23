package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class JavaIfElseHackerRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Given an integer, n, perform the following conditional actions
        İf n is odd, print Weird
        İf n is even and in the inclusive range of 2 to 5, print Not Weird
        İf n is even and in the inclusive range of 6 to 20, print Weird
        İf n is even and greater than 20, print Not Weird
        Constraints 1<=n<= 100
    */
        int n = input.nextInt();
        boolean isError = false;
        if (n >= 1 && n <= 100) {
            if (n % 2 == 1) {
                isError = true;
            } else {
                if (n < 5) {
                    isError = false;
                } else if (n >= 6 && n <= 20) {
                    isError = true;
                } else isError = false;

            }

            if (isError) {
                System.out.println("Weird");
            } else System.out.println("Not Weird");
        }
    }
}

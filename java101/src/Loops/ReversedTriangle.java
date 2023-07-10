package Loops;
import java.util.Scanner;
public class ReversedTriangle {
    public static void main(String[] args) {
        reversedTriangle();

    }
    public static void reversedTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter line of triangle");
        int line = input.nextInt();
        for (int currentRow = line ; currentRow >= 1; currentRow--) {
            //lets print spaces
            for (int spaces = 1; spaces <= line - currentRow; spaces++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int stars = 1; stars <= 2 * currentRow - 1; stars++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line


        }

    }
}

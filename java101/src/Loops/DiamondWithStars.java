package Loops;
public class DiamondWithStars {
    public static void main(String[] args) {
        int rows = 5; // number of rows in the diamond

        // Upper half of the diamond
        for (int currentRow = 1; currentRow <= rows; currentRow++) {
            // Print spaces before the stars
            for (int spaces = 1; spaces <= rows - currentRow; spaces++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int stars = 1; stars <= 2 * currentRow - 1; stars++) {
                System.out.print("*");
            }

            System.out.println(); // move to the next line
        }

        // Lower half of the diamond
        for (int currentRow = rows - 1; currentRow >= 1; currentRow--) {
            // Print spaces before the stars
            for (int spaces = 1; spaces <= rows - currentRow; spaces++) {
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

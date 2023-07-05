package Loops;
import java.util.Scanner;
public class TriangleWithStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of row");
        int rows = input.nextInt();
        System.out.println("here is your triangle with stars for loop");
        triangleWithStarsForLoop(rows);
        System.out.println("here is your triangle with stars while loop");
        triangleWithStarsWhileLoop(rows);
    }

    public static void triangleWithStarsForLoop(int rows) {



        for (int currentRow = 1; currentRow <= rows; currentRow++) {
            // Print spaces before the stars
            for (int spaces = rows - currentRow; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int stars = 1; stars <= (2 * currentRow - 1); stars++) {
                System.out.print("*");
            }

            System.out.println(); // move to the next line
        }
        }
    public static void triangleWithStarsWhileLoop(int rows) {
        int currentRow = 1; // initialize the current row counter
        int spaces = rows - 1; // number of spaces before the stars in each row
        int stars = 1; // initialize the number of stars for the first row

        while (currentRow <= rows) {
            // Print spaces before the stars
            int spaceCount = 1;
            while (spaceCount <= spaces) {
                System.out.print(" ");
                spaceCount++;
            }

            // Print stars for the current row
            int starCount = 1;
            while (starCount <= stars) {
                System.out.print("*");
                starCount++;
            }

            System.out.println(); // move to the next line
            spaces--; // decrease the number of spaces for the next row
            stars += 2; // increase the number of stars for the next row
            currentRow++; // move to the next row
        }
    }
    }








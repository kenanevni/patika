package Arrays;
import java.util.Scanner;
public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        Scanner input = new Scanner(System.in);
        System.out.println("This is matrix that contain 2 row and two column Please enter matrix values");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j]=input.nextInt();
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");

        }


    }
}

package Arrays;

public class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+ " ");
            }
            System.out.println(" ");

        }

    }

}

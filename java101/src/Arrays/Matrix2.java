package Arrays;

import static Arrays.PrintMatrix.printMatrix;

public class Matrix2 {
    public static void main(String[] args) {
        PrintMatrix printMatrix = new PrintMatrix();

        int[][] matrix = new int[3][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*100);
            }
        }
        printMatrix(matrix);

    }




}

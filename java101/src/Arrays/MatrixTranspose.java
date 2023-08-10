package Arrays;

import static Arrays.PrintMatrix.printMatrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int arr2d[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        printMatrix(arr2d);
        System.out.println(" ");
        transposeMatrix(arr2d);

    }

    static void transposeMatrix(int[][] arr2d) {



        int[][] transposedMatrix = new int[arr2d[0].length][arr2d.length];


        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length ; col++) {
                transposedMatrix[col][row] = arr2d[row][col];
            }
        }

        printMatrix(transposedMatrix);
        /*   for (int row = 0; row < transposedMatrix.length; row++) {
                    for (int column = 0; column < transposedMatrix[row].length ; column++) {
                        System.out.print(transposedMatrix[row][column]+ " ");
                    }
                    System.out.println(" ");

                }*/


    }
}

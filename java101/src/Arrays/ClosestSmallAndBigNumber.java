package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestSmallAndBigNumber {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 5, 36, 365, 33, 39, 9, 31, 25, 20, 19, 22};

        closestSmallAndBigNumber(list);

    }

    public static void closestSmallAndBigNumber(int[] array) {

        Scanner input = new Scanner(System.in);
        int givenNumber = input.nextInt();
        int smallerNumbersCount = 0;


        for (int j : array) {
            if (j < givenNumber) {
                smallerNumbersCount++;
            }
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("smallerNumbersCount = " + smallerNumbersCount);


        if (array[smallerNumbersCount] == givenNumber) {
            System.out.println("closest smaller number is " + array[smallerNumbersCount - 1]);
            System.out.println("closest bigger number is " + array[smallerNumbersCount + 1]);
        } else {
            System.out.println("closest smaller number is " + array[smallerNumbersCount - 1]);
            System.out.println("closest bigger number is " + array[smallerNumbersCount]);
        }


    }
}

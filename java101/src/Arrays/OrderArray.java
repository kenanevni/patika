package Arrays;
import java.util.Scanner;
public class OrderArray {
    public static void main(String[] args) {
        orderArray();


    }

    static void orderArray() {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];

        for (int i = 0; i <length ; i++) {
            array[i] = input.nextInt();
        }


        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int each:array
             ) {
            System.out.print(each +" ");
        }



    }
}

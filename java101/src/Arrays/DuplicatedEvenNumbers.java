package Arrays;

public class DuplicatedEvenNumbers {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 1, 2, 3, 4, 5, 5,6,6};
        duplicatedEvenNumbers(list);

    }

    static void duplicatedEvenNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] % 2 == 0) {
                    System.out.print(array[i] + " ");
                }
            }


        }
    }
}

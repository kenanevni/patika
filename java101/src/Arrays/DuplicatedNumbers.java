package Arrays;

public class DuplicatedNumbers {
    public static void main(String[] args) {
        int[] list = {1, 2, 3,1,2,3,4,5,};
        duplicatedNumbers(list);

    }

    static void duplicatedNumbers(int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i]+ " ");
                }
            }



        }
    }
}

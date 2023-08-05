package Arrays;

public class MinAndMaxOfArray {
    public static void main(String[] args) {
        int[] list = {1, 3, 6, 5, 22, 36, 554, 32, 8, -36, -52, 3, 23, 36};
        minAndMaxOfArray(list);
    }
    public static void minAndMaxOfArray(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int each:array) {
            if (each < min) {
                min = each;
            }
            if (each > max) {
                max=each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

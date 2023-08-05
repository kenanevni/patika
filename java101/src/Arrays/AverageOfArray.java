package Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;

        for (int each : arr ) {
            sum+=each;
        }
        int average = sum / arr.length;
        System.out.println("average = " + average);


    }
}

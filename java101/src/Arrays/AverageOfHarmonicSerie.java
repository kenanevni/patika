package Arrays;

public class AverageOfHarmonicSerie {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 8, 4, 6, 2, 15};
        System.out.println("averageOfHarmonicSerie(arr) = " + averageOfHarmonicSerie(arr));
    }

    public static double averageOfHarmonicSerie(int[] arr) {
        double sum = 0;
        for (int each : arr) {
            sum += 1 / each;

        }
        return sum / arr.length;
    }
}

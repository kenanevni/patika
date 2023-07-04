package Loops;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        double number = input.nextInt();
        System.out.println("Here is the harmonic series and sum of it");
        System.out.println(harmonicSeries(number));
    }
    public static double harmonicSeries(double number) {
        double sum = 0;
        for (double i = 1; i <= number; i++) {
            double harmonicNumber = 1 / i;
            sum += 1 / i;
            //System.out.print(String.format("%.2f",harmonicNumber)+ "+");
            System.out.println("1/" + i);
        }

        return sum;

    }

}

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


}

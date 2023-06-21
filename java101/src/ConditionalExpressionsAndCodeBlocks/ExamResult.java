package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        System.out.println("Welcome To Exam Result ");
        double math, physics, chem, eng, hist, mus, avg, total = 0;
        //create Scanner for input
        Scanner input = new Scanner(System.in);
        //Lets get lesson points from user
        System.out.println("Please enter your math point : ");
        math = input.nextDouble();
        // this conditioun will check boundaries
        // if ((math >= 0) && (math <= 100)) {
        //            total += math;
        //        }
        if ((math >= 0) && (math <= 100)) {
            total += math;
        }
        System.out.println("Please enter your phsyics point : ");
        physics = input.nextDouble();
        if ((physics >= 0) && (physics <= 100)) {
            total += physics;
        }
        System.out.println("Please enter your Chemistry point: ");
        chem = input.nextDouble();
        if ((chem >= 0) && (chem <= 100)) {
            total += chem;
        }
        System.out.println("Please enter your english point : ");
        eng = input.nextDouble();
        if ((eng >= 0) && (eng <= 100)) {
            total += eng;
        }
        System.out.println("Please enter your history point : ");
        hist = input.nextDouble();
        if ((hist >= 0) && (hist <= 100)) {
            total += hist;
        }
        System.out.println("Please enter your music point : ");
        mus = input.nextDouble();
        if ((mus >= 0) && (mus <= 100)) {
            total += mus;
        }
        //calculate average
        avg = total / 6;
        System.out.println("Average = " + avg);
        if (avg >= 55) {
            System.out.println("Congrulutations!!! Passed");
        }else {
            System.err.println("Sorry !!! Failed ");
        }


    }
}

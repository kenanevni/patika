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


    }
}

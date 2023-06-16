package Entrance;
import java.util.Scanner;

public class ExamResult {
    public static void main (String [] args){
        System.out.println("Welcome To Exam Result ");
        //create Scanner for input
        Scanner input = new Scanner(System.in);

        //Lets get lesson points from user
        System.out.println("Please enter your math point");
        double math = input.nextDouble();
        System.out.println("Please enter your phsyics point");
        double physics = input.nextDouble();
        System.out.println("Please enter your Chemistry point");
        double chem = input.nextDouble();
        System.out.println("Please enter your english point");
        double eng = input.nextDouble();
        System.out.println("Please enter your history point");
        double hist = input.nextDouble();
        System.out.println("Please enter your music point");
        double mus = input.nextDouble();

        //calculate average
        double avr = (math + physics + chem + eng + hist + mus) / 6;
        //added boolean for result check
        boolean passed = avr >=60;
        //added result check
        String result = passed ? "Passed" : "Failed";
        //print avg and result
        System.out.println("Your average point is " + avr + "\nYour result is \n" + result) ;








    }
}

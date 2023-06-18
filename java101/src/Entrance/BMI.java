package Entrance;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weigth,length,bmi;

        System.out.print("Please enter your weigth as Kg ");
        weigth = input.nextDouble();

        System.out.print("Please enter your length as Meter ");
        length = input.nextDouble();
        bmi = weigth/length*length;
        System.out.println("bmi = " + String.format("%.2f",bmi));

    }
}

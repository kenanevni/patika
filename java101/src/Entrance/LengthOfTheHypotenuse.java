package Entrance;

import java.util.Scanner;

public class LengthOfTheHypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideA, sideB, hypotenuse;
        System.out.println("Welcome, Please enter sides of the right triangle");
        sideA = input.nextDouble();
        sideB = input.nextDouble();
        hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        System.out.println("hypotenuse = " + hypotenuse);
    }
}

package Entrance;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);
        //define variables
        int sideA, sideB, sideC, halfPerimeter;
        double area;
        //welcome message
        System.out.println("Hi, please enter sides of triangle");
        //take sides of triangle
        sideA = input.nextInt();
        sideB = input.nextInt();
        sideC = input.nextInt();
        //formula u = halfPerimeter , area= √(u(u-a)(u-b)(u-c))
        halfPerimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
        System.out.println("Area of triangle = " + area);


    }
}

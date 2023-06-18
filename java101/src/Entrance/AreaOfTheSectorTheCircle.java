//Write a program that finds the area of a sector of circle with radius
// r and measure 𝛼 of the central angle.
package Entrance;
import java.util.Scanner;
public class AreaOfTheSectorTheCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle,radius,area;
        double pi = 3.14;
        //take radius from user
        System.out.print("Please enter radius ");
        radius = input.nextDouble();
        //take angle of the circle
        System.out.print("Please enter angle ");
        angle = input.nextDouble();
        area = (pi*radius*radius*angle)/360;
        System.out.println("area = " + String.format("%.2f", area));

    }
}

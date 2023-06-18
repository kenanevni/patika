//Taximeter Program
//        Write a program that prints the taximeter amount to the screen according to the distance traveled (KM) with Java.
//
//        Taximeter costs 2.20 TL per km.
//        The minimum amount to be paid is 20 TL. For wages under 20 TL, 20 TL will be charged.
//        The taximeter opening fee is 10 TL.

package Entrance;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double costPerKm = 2.2;
        double amount,total,tripLength;
        int starterCost = 10;
        int basePayment = 20;
        System.out.println("Welcome to Taximeter, Please enter Your Trip Length");
        tripLength = input.nextDouble();
        amount = (costPerKm * tripLength) + starterCost;
        System.out.println("amount = " + amount);

    }
}

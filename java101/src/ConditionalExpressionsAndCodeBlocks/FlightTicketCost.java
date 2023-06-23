/*
Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2). Otherwise,
"You Have Entered Wrong Data!" A warning should be given.
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
        If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price.
*/
package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class FlightTicketCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance;
        double amount = 0;
        double costPerKM = 0.10;
        double discountTripType = 0.80;
        double discountAge = 1;
        int tripType, age;
        boolean isError = false;
        System.out.print("please enter trip distance: ");
        distance = input.nextDouble();
        System.out.print("please enter passenger age: ");
        age = input.nextInt();
        System.out.print("plese enter you trip type: one way 1 round-trip 2 ");
        tripType = input.nextInt();

        //briefly discount formula if you want to make %20 discount multiply it 0.80 : -))

        if (distance > 0) {
            amount = distance * costPerKM;
        }else isError=true;

        if (age > 0) {
            if (age < 12) {
                discountAge = 0.50;
            } else if (age <= 24) {
                discountAge = 0.90;
            } else if (age > 65) {
                discountAge = 0.70;
            }
            amount *= discountAge;
        } else isError=true;


        if ((tripType == 1) || (tripType == 2)) {
            if (tripType == 2) {
                amount*=2;
            }
            amount *= discountTripType;
        }else isError=true;


        if (isError) {
           System.err.println("Ooops!!entered wrong data");
            }else
                System.out.println("amount = " + amount);
        }
    }



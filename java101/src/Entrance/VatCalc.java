package Entrance;

import java.util.Scanner;

public class VatCalc {
    public static void main(String[] args) {
        /* VAT Amount Calculator Program
Write a program that calculates the VAT value and the VAT amount of the money value
received from the user with Java and prints it on the screen.
(Note: Take the VAT amount as 18%)
Price without VAT = 10;

Price with VAT = 11.8;

VAT amount = 1.8;
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter price");
        double priceWithOutTax = input.nextDouble();
        double vatRate1 = 1.18;
        double priceWithTax = priceWithOutTax * vatRate1;
        double vatAmount = priceWithTax-priceWithOutTax;
        System.out.println("priceWithOutTax = " + priceWithOutTax);
        System.out.println("priceWithTax = " + String.format("%.2f",priceWithTax));
        System.out.println("vatAmount = " + String.format("%.2f", vatAmount));

    }
}

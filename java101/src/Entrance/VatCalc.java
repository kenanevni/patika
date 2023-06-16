package Entrance;

import java.util.Scanner;

public class VatCalc {
    public static void main(String[] args) {
        //If the amount entered is between 0 and 1000 TL, the VAT rate is 18%,
        // if the amount is greater than 1000 TL, write the program that calculates the VAT amount as 8%.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter price");
        double priceWithOutTax = input.nextDouble();
        double vatRate1 = 1.18;
        double vatRate2 = 1.08;
        boolean vatRateCheck = priceWithOutTax > 0 && priceWithOutTax <=1000;
        double  vatRate = vatRateCheck ? vatRate1 : vatRate2;
        double priceWithTax = priceWithOutTax * vatRate;
        double vatAmount = priceWithTax - priceWithOutTax;
        System.out.println("priceWithOutTax = " + priceWithOutTax);
        System.out.println("priceWithTax = " + String.format("%.2f", priceWithTax));
        System.out.println("vatAmount = " + String.format("%.2f", vatAmount));

    }
}

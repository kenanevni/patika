package Entrance;

import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice, pearWeight, appleWeight, tomatoWeight, bananaWeight, eggPlantWeight, total;

        pearPrice = 2.14;
        applePrice = 3.67;
        tomatoPrice = 1.11;
        bananaPrice = 0.95;
        eggplantPrice = 5;
        //take kg from user
        System.out.print("Please enter pear weigth as kg ");
        pearWeight = input.nextDouble();
        System.out.print("Please enter apple weigth as kg ");
        appleWeight = input.nextDouble();
        System.out.print("Please enter tomato weigth as kg ");
        tomatoWeight = input.nextDouble();
        System.out.print("Please enter banana weigth as kg ");
        bananaWeight = input.nextDouble();
        System.out.print("Please enter eggplant weigth as kg ");
        eggPlantWeight = input.nextDouble();
        total = (pearPrice * pearWeight) + (applePrice * appleWeight) + (tomatoPrice * tomatoWeight)
                + (bananaPrice * bananaWeight) + (eggplantPrice * eggPlantWeight);
        System.out.println("total = " + total);
    }
}

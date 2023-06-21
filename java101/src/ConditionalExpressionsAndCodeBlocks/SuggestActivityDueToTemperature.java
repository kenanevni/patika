/*
Suggest to "Ski" if the temperature is less than 5.
Suggest the "Cinema" event if the temperature is between 5 and 15.
Suggest the "Picnic" event if the temperature is between 10 and 25.
Suggest the "Swimming" event if the temperature is greater than 25.
*/
package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class SuggestActivityDueToTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();
        System.out.println("Please enter the weather temperature");
    /*    if (temperature < 5) {
            System.out.println("Go to Ski");            
        } else if (temperature<25) {
            if (temperature <= 15) {
                System.out.println("Go to cinema");
            }
            if (temperature >= 10) {
                System.out.println("Go to Picnic");
            }
        } else {
            System.out.println("Go to Swimming");
        }*/

    }
}

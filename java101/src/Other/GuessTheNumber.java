package Other;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static boolean isRange(int number) {

        return number > 0 && number < 101;

    }

    public static void upOrDown() {
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 0;
        int attempt = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        for (int i = right; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Guess the number between 0-100");
            int selected = input.nextInt();
            if (!isRange(selected)) {
                attempt++;
                if (attempt < 2) {
                    System.err.println("This is your first out of range attempt \n" +
                            " next time you will lose your attempt right ");
                    i--;
                } else {
                    wrong[right++] = selected;
                    System.err.println("Too many out of range attempt. Your right decreased.\n " +
                            "Total right is " + (5 - right));
                }
                continue;

            }


            if (selected == number) {
                System.out.println("Congrats!!!Well done : " + number);
                isWin = true;

            } else {
                if (5 - right == 0) {
                    continue;
                }else { System.err.println("Oops not correct!");
                    if (selected > number) {
                        System.out.println("Hint : " + selected + " number is bigger than hidden number.");

                    } else {
                        System.out.println("Hint : " + selected + " number is smaller than hidden number");
                    }

                    wrong[right++] = selected;
                    System.out.println("Remained attempt : " + (5 - right));}


            }


        }
        if (!isWin) {
            System.out.println("You Lost ! ");
            if (!isWrong) {
                System.out.println("Your Guesses : " + Arrays.toString(wrong));
            }
        }

    }
}
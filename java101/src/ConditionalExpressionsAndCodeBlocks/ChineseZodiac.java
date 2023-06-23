package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Chinese Zodiac Calculator");
        System.out.println("Please enter Year of Birth");
        int year = input.nextInt();
        String chineseZodiac = "";
        /* Rat Ox Tiger Rabbit Dragon Snake Horse Goat Monkey Rooster Dog Pig*/
        int remainder = year % 12;

        switch (remainder) {
            case 0:
                chineseZodiac = "Monkey";
                break;
            case 1:
                chineseZodiac = "Rooster";
                break;
            case 2:
                chineseZodiac = "Dog";
                break;
            case 3:
                chineseZodiac = "Pig";
                break;
            case 4:
                chineseZodiac = "Rat";
                break;
            case 5:
                chineseZodiac = "Ox";
                break;
            case 6:
                chineseZodiac = "Tiger";
                break;
            case 7:
                chineseZodiac = "Rabbit";
                break;
            case 8:
                chineseZodiac = "Dragon";
                break;
            case 9:
                chineseZodiac = "Snake";
                break;
            case 10:
                chineseZodiac = "Horse";
                break;
            case 11:
                chineseZodiac = "Goat";
                break;
        }
        System.out.println("Your Chinese Zodiac is: " + chineseZodiac);
    }
}

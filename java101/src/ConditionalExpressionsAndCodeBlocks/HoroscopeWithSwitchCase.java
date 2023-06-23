package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class HoroscopeWithSwitchCase {
    public static void main(String[] args) {
        /*
        Capricorn: December 22 - January 21
        Aquarius: January 22 - February 19
        Pisces: February 20 - March 20
        Aries : March 21 - April 20
        Taurus : April 21 - May 21
        Gemini: May 22 - June 22
        Cancer Zodiac Sign: June 23 - July 22
        Leo Zodiac Sign: July 23 - August 22
        Virgo Zodiac Sign: August 23 - September 22
        Libra Zodiac Sign: September 23 - October 22
        Scorpio: October 23 - November 21
        Sagittarius : November 22 - December 21*/
        Scanner input = new Scanner(System.in);
        boolean isError = false;
        String horoscope = "";
        int day, month;

        System.out.print("please enter your number of month : ");
        month = input.nextInt();
        System.out.print("please enter your number of day : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else horoscope = "Aquarius";
                } else isError = true;
                break;
            case 2:
                if (day > 0 && day <= 29) {
                    if (day < 20) {
                        horoscope = "Aquarius";
                    } else horoscope = "Pisces";
                } else isError = true;
                break;
            case 3:
                if (day > 0 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else horoscope = "Aries";
                } else isError = true;
                break;
            case 4:
                if (day > 0 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Aries";
                    } else horoscope = "Taurus";
                } else isError = true;
                break;
            case 5:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Taurus";
                    } else horoscope = "Gemini";
                } else isError = true;
                break;
            case 6:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Gemini";
                    } else horoscope = "Cancer";
                } else isError = true;
                break;
            case 7:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else horoscope = "Leo";
                } else isError = true;
                break;
            case 8:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Leo";
                    } else horoscope = "Virgo";
                } else isError = true;
                break;
            case 9:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Virgo";
                    } else horoscope = "Libra";
                } else isError = true;
                break;
            case 10:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Libra";
                    } else horoscope = "Scorpio";
                } else isError = true;
                break;
            case 11:
                if (day > 0 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Scorpio";
                    } else horoscope = "Sagittarius";
                } else isError = true;
                break;
            case 12:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else horoscope = "Capricorn";
                } else isError = true;
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.err.println("Your choice is out of range.");
        } else System.out.println("Your horoscope is " + "\" " + horoscope + "\"");
    }
}

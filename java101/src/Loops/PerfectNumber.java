package Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfect();

    }

    public static void isPerfect() {
        Scanner input = new Scanner(System.in);
        int perNum = input.nextInt();
        int temp = 0;
        for (int i = 1; i < perNum; i++) {
            if (perNum % i == 0) {
                temp += i;
            }
        }
        if (perNum == temp) {

            System.out.println(perNum + " is a Perfect Number");
        } else System.out.println(perNum + " is NOT perfect NUmber");

    }
}

package Loops;
import java.util.Scanner;
public class HackerRankMultipliers {
    public static void main(String[] args) {
        mutiplicationTable();

    }

    public static void mutiplicationTable() {
        int n;
        do {
            System.out.println("Please enter a number between 2 and 20");

            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            if (n >= 2 && n <= 20) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + (n * i));

                }
            }

        } while (!(n >= 2 && n <= 20));



    }
}

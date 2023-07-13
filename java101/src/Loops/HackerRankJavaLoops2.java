package Loops;

import java.util.Scanner;

public class HackerRankJavaLoops2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();
        if ((q >= 0 && q <= 500)) {
            for (int i = 0; i < q; i++) {
                int a = input.nextInt();
                int b = input.nextInt();
                int n = input.nextInt();


                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {


                    for (int j = 0; j < n; j++) {
                        a = a + b;
                        b = b * 2;
                        System.out.print(a + " ");

                    }
                    System.out.println();


                }

            }

        }


    }

}

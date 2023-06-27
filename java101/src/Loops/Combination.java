package Loops;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n number for combination calc.");
        int n = scanner.nextInt();
        System.out.print("Please enter n number for combination calc.");
        int r = scanner.nextInt();
        boolean isError = n > r && n > 0 && r > 0;
        int nFac = 1;
        int rFac = 1;
        int nMinusrFac = 1;
        int com = 0;
        //C(n,r) = n! / (r! * (n-r)!)
        if (isError) {
            for (int i = 1; i <= n; i++) {
                nFac = nFac * i;
            }
            System.out.println("nFac = " + nFac);
            for (int k = 1; k <= r; k++) {
                rFac = rFac * k;
            }
            System.out.println("rFac = " + rFac);
            for (int l = 1; l <= (n - r); l++) {
                nMinusrFac = nMinusrFac * l;
            }
            System.out.println("nMinusrFac = " + nMinusrFac);
            com = nFac / (rFac * nMinusrFac);
            System.out.println("combination (" + n + ", " + r + ") is = " + com);

        } else
            System.out.println("one of them breached " + n + " must > " + r + " and " + n + "  must > 0 and " + r + " " + "must > 0");


    }
}

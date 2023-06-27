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
        int nMinusrFac=1;
        int com=0;
        //C(n,r) = n! / (r! * (n-r)!)


    }
}

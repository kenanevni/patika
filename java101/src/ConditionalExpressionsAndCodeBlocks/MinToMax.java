package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Welcome there are three numbers, we'll sort them min to max");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1 : ");
        n1 = input.nextInt();
        System.out.println("Please enter number 2 : ");
        n2 = input.nextInt();
        System.out.println("Please enter number 3 : ");
        n3 = input.nextInt();

        if ((n1 != n2) && (n1 != n3) && (n2 != n3)) {

            if ((n1 < n2) && (n1 < n3)) {
                if (n2 < n3) {
                    System.out.println(n1 + "<" + n2 + "<" + n3);
                }else
                    System.out.println(n1 + "<" + n3 + "<" + n2);

            } else if ((n2 < n1) && (n2 < n3)) {
                if (n1 < n3) {
                    System.out.println(n2 + "<" + n1 + "<" + n3);
                }else
                    System.out.println(n2 + "<" + n3 + "<" + n1);

            } else {
                if (n1 < n2) {
                    System.out.println(n3 + "<" + n1 + "<" + n2);
                }else
                    System.out.println(n3 + "<" + n2 + "<" + n1);

            }
        }
         else {
            System.err.println("There are some equal numbers");
        }


    }
}



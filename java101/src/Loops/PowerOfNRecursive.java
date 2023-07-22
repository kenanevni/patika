package Loops;
import java.util.Scanner;


public class PowerOfNRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base naumber");
        int base = input.nextInt();
        System.out.println("Please enter top number");
        int top= input.nextInt();
        System.out.println("recursivePower(base, top) = " + recursivePower(base, top));


    }
    static int recursivePower(int base, int top) {
        int count = top;
        if (top == 0) {
            return 1;
        } else {
            return base * recursivePower(base, top - 1);
        }
    }
}


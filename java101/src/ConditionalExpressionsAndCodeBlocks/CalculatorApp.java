package ConditionalExpressionsAndCodeBlocks;
import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome calc. please enter your calculation\nex : " +
                "\n3 enter * enter 5 enter " +
                "\n10 enter % enter 2 enter" +
                "\n2 enter - enter 5 enter" +
                "\n95 enter / enter 3  enter etc");
        double n1 = input.nextDouble();
        String operator = input.next();
        double n2 = input.nextDouble();

        switch (operator) {
            case "+":
                System.out.println("Result " + (n1+n2));
                break;
            case "-":
                System.out.println("Result " + (n1-n2));
                break;
            case "*":
                System.out.println("Result " + (n1 * n2));
                break;
            case "/":
                if (n1 !=0) {
                    System.out.println("Result " + (n1 / n2));

                }else {
                    System.err.println("you cant dived 0 to any number");
                }
                break;
            case "%":
                System.out.println("Result " + (n1 % n2));
                break;
            default:
                System.out.println("Thanks");

        }
    }
}

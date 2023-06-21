package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;
/*If the password is wrong, ask the user whether he can reset his password,
if the user wants to reset it, check that the new password must not be the same as the password he entered incorrectly and forgot, and if the passwords are the same, the screen "Could not create password, please enter another password." If there is no problem, write the program that says "Password created".*/

public class UserLogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passwordFromInput1, passwordFromInput2, savedPassword, resetChoice, savedUserName;
        savedUserName = "lesya";
        savedPassword = "kama123";
        System.out.print("welcome please enter username: ");
        userName = input.nextLine();
        System.out.print("plase enter your password ");
        passwordFromInput1 = input.nextLine();
        boolean userCheck = userName.equals(savedUserName) && passwordFromInput1.equals(savedPassword);

        if (userCheck) {
            //if username and password correct
            System.out.println("welcome :-) "+ savedUserName);
        } else if (!userCheck) {
            System.out.println("wrong username or password! if I you are sure about username Would you like to" +
                    " reset password?");
            System.out.println("You can type \"Yes\" or \"No\"");
            resetChoice = input.nextLine();
            if (resetChoice.equalsIgnoreCase("yes")) {
                System.out.print("Please enter your new password: ");
                //passwordFromInput2 is entered secoond password
                passwordFromInput2 = input.nextLine();
                //check first entered and forgotten passwords
                boolean passCheck =
                        (!passwordFromInput2.equals(passwordFromInput1) ) && (!passwordFromInput2.equals(savedPassword));
                if (passCheck) {
                    savedPassword = passwordFromInput2;
                    System.out.println("Your Password is changed");
                } else {
                    System.err.println("Password cannot created. Please enter new Password");
                }
            }

            System.out.println("Goodbye!!!");
        }
    }
}

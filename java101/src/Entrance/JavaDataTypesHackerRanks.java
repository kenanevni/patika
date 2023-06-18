//q: Given an input integer, you must determine which primitive data types are capable of properly storing that input.
//answer with what has been taught so far in the lessons
package Entrance;
import java.util.Scanner;

public class JavaDataTypesHackerRanks {
public static void main(String [] args){

    /*byte	1 byte	Stores whole numbers from -128 to 127
    short	2 bytes	Stores whole numbers from -32,768 to 32,767
    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807*/
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter INTEGER number ");
    double t = sc.nextDouble();

    String onlyLong = ((t >= -9223372036854775808L && t < -2147483648) || (t > 2147483647 && t <= 9223372036854775807L)) ? "* long" : "";
    String intLong = ((t >= -2147483648 && t < -32768) || (t > 32767 && t <= 2147483647)) ? "* int \n* long" : "";
    String shortIntLong = ((t >= -32768 && t < -128) || (t > 127 && t <= 32767)) ? "* int \n* short \n* long" : "";
    String all =  (t>= -128 && t<=127) ? "*byte \n* int \n* short \n* long" : "";
    String outOfRange = (t < -9223372036854775808L  ||  t > 9223372036854775807L) ? "can't be fitted anywhere" : "";
    System.out.println(all + shortIntLong + intLong + onlyLong + outOfRange);


}
}

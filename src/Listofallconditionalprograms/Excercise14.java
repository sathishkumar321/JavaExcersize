package Listofallconditionalprograms;
// accepts three numbers and check All numbers are equal or not
import java.util.*;
public class Excercise14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();
        if (num1 == num2 && num1 == num3) {
            System.out.println("All numbers are equal");
        }
        else if ((num1 == num2) || (num1 == num3) || (num3 == num2)) {
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }
    }
}



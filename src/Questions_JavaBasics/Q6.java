package Questions_JavaBasics;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the sum (addition),
        multiply, subtract, divide and remainder of two numbers
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= scan.nextInt();
        System.out.println("Enter the second number");
        int num2= scan.nextInt();
        System.out.println("The result is"+"="+
                "\n"+(num1+num2)+
                "\n"+(num1-num2)+
                "\n"+(num1*num2)+
                "\n"+(num1/num2)+
                "\n"+(num1%num2));
    }
}

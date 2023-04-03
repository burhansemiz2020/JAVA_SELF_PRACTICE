package Questions_JavaBasics;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes two numbers as input and display the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1= scan.nextInt();
        System.out.println("Enter num2");
        int num2= scan.nextInt();
        System.out.println("The result is"+" = "+num1*num2);
    }
}

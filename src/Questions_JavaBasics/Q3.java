package Questions_JavaBasics;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //Write a Java program to divide two numbers and print on the screen.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=scan.nextInt();
        System.out.println("Enter the number 2");
        int num2= scan.nextInt();
        int numDiv=num1/num2;
        System.out.println("Result\n"+numDiv);
    }

}

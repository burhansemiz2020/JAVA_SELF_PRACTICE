package Questions_JavaBasics;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Write a Java program to print the sum of two numbers.
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number a");
        int a=scan.nextInt();
        System.out.println("enter the number b");
        int b= scan.nextInt();
        int sum= a + b;
        System.out.println("sum: "+sum);
    }
}

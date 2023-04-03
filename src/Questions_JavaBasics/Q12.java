package Questions_JavaBasics;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes three numbers as
        input to calculate and print the average of the numbers.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input num1"+"\n"+"Input num2"+"\n"+"Input num3");
        double num1=scan.nextDouble();
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();
        System.out.println("The result is"+"="+(num1+num2+num3)/3);
    }
}

package Questions_JavaBasics;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        /*
        Write a Java program to swap two variables.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input num1");
        int num1= scan.nextInt();
        System.out.println("Input num2");
        int num2= scan.nextInt();
        int temp=0;
        temp=num1;
        num1=num2;
        temp=num2;
        System.out.println("Swapped value num1:"+num1);
        System.out.println("Swapped value num2:"+num2);



    }
}

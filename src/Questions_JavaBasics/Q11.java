package Questions_JavaBasics;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the area and perimeter of a circle.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("input the diameter of the circle");
        double rad=scan.nextDouble();
        System.out.println("Perimetre is="+"\n"+(2*rad*Math.PI));
        System.out.println("Area is="+"\n"+(Math.PI*rad*rad));


    }
}

package Questions_JavaBasics;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*
        Write a Java program to print the area and perimeter of a rectangle.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input first side of the rectangle");
        double side1= scan.nextDouble();
        System.out.println("Input second side of the rectangle");
        double side2= scan.nextDouble();

        System.out.println("Area of the rectangle"+"="+"\n"+side1*side2);
        System.out.println("Perimeter of the rectangle"+"="+"\n"+2*(side1+side2));
    }
}

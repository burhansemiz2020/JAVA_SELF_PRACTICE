package Questions_Methods;

import java.util.Scanner;

public class Q03_Method_Double_SmallestNumber {
    public static void main(String[] args) {
        /*
        1. Write a Java method to find the
        smallest number among three numbers.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter num a: ");
        double a=scan.nextDouble();
        System.out.print("Enter num b: ");
        double b=scan.nextDouble();
        System.out.print("Enter num c: ");
        double c= scan.nextDouble();
        System.out.print("The smallest number is: " + smallest(a, b, c)+ "\n");


    }
    public static double smallest(double a, double b, double c){
        return Math.min(Math.min(a, b), c);
    }
}

package Questions_Methods;

import java.util.Scanner;

public class Q04_Method_Double_Average {
    public static void main(String[] args) {
        /*
        2. Write a Java method to compute
           the average of three numbers.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("num a         : ");
        double a= scan.nextDouble();
        System.out.print("num b         : ");
        double b= scan.nextDouble();
        System.out.print("num c         : ");
        double c= scan.nextDouble();

        System.out.print("The average is: " + average (a, b, c)+"\n");

    }
    public static double average(double a, double b, double c){
        return (a+b+c)/3;
    }
}

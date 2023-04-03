package Questions_Methods;

import java.util.Scanner;

public class Q04_Method_TestTheAverage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        double num1= scan.nextDouble();
        System.out.print("Enter the num2: ");
        double num2=scan.nextDouble();
        System.out.print("Enter the num3: ");
        double num3=scan.nextDouble();

        double result=Q04_Method_Double_Average.average(num1, num2, num3);
        System.out.println(result);

    }
}

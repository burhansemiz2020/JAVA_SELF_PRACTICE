package Questions_Methods;

import java.util.Scanner;

public class Q03_Method_TestTheSmallestNumber {
    public static void main(String[] args) {
        /*
        1. Write a Java method to find the smallest number among three numbers. Go to the editor
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29
        Expected Output:
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three number: ");
        double a= scan.nextInt();
        double b= scan.nextInt();
        double c= scan.nextInt();
        double result= Q03_Method_Double_SmallestNumber.smallest(a, b, c);
        if (a==b && b==c){
            System.out.println("The numbers are same, change one of them");
        }else {
            System.out.println(result);
        }




    }
}

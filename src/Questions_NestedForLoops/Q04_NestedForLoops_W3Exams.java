package Questions_NestedForLoops;

import java.util.Scanner;

public class Q04_NestedForLoops_W3Exams {
    public static void main(String[] args) {
        /*
        Write a program in Java to display
        the cube of the number upto given an integer.
        Test Data
        Input number of terms : 4
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a positif number");
        int a= scan.nextInt();

        for (int i = 1; i <= a ; i++) {
            System.out.println("Number is: " +i+
                    " and the cube of " +
                    "" +i+ " is :" +(i*i*i));

        }
    }
}

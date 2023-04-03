package Questions_NestedForLoops;

import java.util.Scanner;

public class Q07_NestedForLoopsW3Exam4 {
    public static void main(String[] args) {
        /*
        13. Write a program in Java to
        display the cube of the number
        upto given an integer
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int n= scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.print("Number is: " +i+
                    "\nThe cube of the " +i+ " is: " +(i*i*i)+ "\n");

        }

    }
}

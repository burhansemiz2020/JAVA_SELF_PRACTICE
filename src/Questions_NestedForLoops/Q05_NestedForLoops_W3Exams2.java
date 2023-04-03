package Questions_NestedForLoops;

import java.util.Scanner;

public class Q05_NestedForLoops_W3Exams2 {
    public static void main(String[] args) {
        /*
        Write a program in Java to display n
        terms of natural numbers and their sum.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number: ");
        int n=scan.nextInt();
        int sum=0;
        System.out.println("The first n natural numbers are : " +n);
        for (int i = 1; i <=n ; i++) {
            System.out.println(i + "");
            sum+=i;
        }
        System.out.println("The sum of the natural number upto " +n+ " ==>" +sum);
    }
}

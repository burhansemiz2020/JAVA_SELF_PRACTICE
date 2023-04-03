package Questions_ForLoops;

import java.util.Scanner;

public class Q17_ForLoops_Udemy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        int i=0;
        for (; i < n ; i++) {
            System.out.println("Im learning java...");
        }

        /*
        Output:
        Enter a number: 5
        Im learning java...
        Im learning java...
        Im learning java...
        Im learning java...
        Im learning java...
         */
        for (int j = n; j >0 ; j--) {
            System.out.println("j = " +j);


            }


        }

}

package Questions_ForLoops;

import java.util.Scanner;

public class Q21_ForLoops_W3 {
    public static void main(String[] args) {
        /*
        17. Write a program in Java to make such a 
        pattern like right angle triangle with a 
        number which will repeat a number in a row.
        The pattern is as follows : Go to the editor

            1
            22
            333
            4444
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num of the rows: ");
        int row=scan.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print(i);
            System.out.println("");

            }
        /*
        OUTPUT
        Enter the num of the rows: 5
        1
        22
        333
        4444
        55555
         */
            
        }
    }


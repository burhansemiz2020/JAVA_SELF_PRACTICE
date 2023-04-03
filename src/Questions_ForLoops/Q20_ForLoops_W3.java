package Questions_ForLoops;

import java.util.Scanner;

public class Q20_ForLoops_W3 {
    public static void main(String[] args) {
        /*
        16. Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor

        Test Data
        Input number of rows : 10
        Expected Output :

            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of the rows: ");
        int rows=scan.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <= i ; j++)
                System.out.print(j);
                System.out.println("");

            /*
                Enter the number of the rows: 10
                1
                12
                123
                1234
                12345
                123456
                1234567
                12345678
                123456789
                12345678910
             */

        }
            
        }
            
        }






package Questions_ForLoops;

import java.util.Scanner;

public class Q22_ForLoops_W3 {
    public static void main(String[] args) {
        /*
        18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : Go to the editor

        1
        2 3
        4 5 6
        7 8 9 10
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r= scan.nextInt();
        int k=1;

        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print(k++);
            System.out.println("");

        }

    }
}

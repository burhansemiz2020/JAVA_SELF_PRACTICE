package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_NestedForLoops12 {
    public static void main(String[] args) {
        /*
        Nested for loops ile carpim tablosu yapin verilen degere kadar
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*j + " ");

            }
            System.out.println("");
        }

    }
}

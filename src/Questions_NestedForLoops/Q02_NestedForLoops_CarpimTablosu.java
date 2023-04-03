package Questions_NestedForLoops;

import java.util.Scanner;
/*
 * * * * * * * *

 * * * * * *

 * * * *

 * *
 * */

public class Q02_NestedForLoops_CarpimTablosu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi aliniz
        Aldiginiz sayinin carpim tablosunda
        1 den 10 a kadar ki carpim degerlerini
        alt  alta
        ve yan yana listeleyin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1 den 10 a kadar bir sayi giriniz");
        int sayi=scan.nextInt();
        int k=1;
        int j=10;
        for (int i = 1; i <=j ; i++) {
            System.out.print(i*sayi + " ");
        }
        System.out.println("");
        for (int i = 1; i <=j ; i++) {
            System.out.println(i*sayi + " ");
        }
        System.out.println("");
        /*
        int sayi=4;

        for (int i=4; i >=1; i--) {
            for (int j=1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
         */
    }
}

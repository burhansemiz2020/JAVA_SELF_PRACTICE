package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours02_DataCasting03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir sayi alin,
        kullanici kac degerini girerse girsin,
        o sayiyi -128 ile 127 arasindaki bir
        sayiya donusturup yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= ((byte) scan.nextInt());
        System.out.println(num);
        /*
        Enter a number: 130
        -126

         */

    }
}

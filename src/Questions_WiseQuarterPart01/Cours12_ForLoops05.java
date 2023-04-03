package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num=scan.nextInt();

        int fak=1;

        for (int i = num; (i>=1) && (i<20) ; i--) {

            fak=fak*i;

        }
        System.out.println(num + "! = " + fak);

    }
}

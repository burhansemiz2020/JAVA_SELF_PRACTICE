package Questions_StringManipulations;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan3 sayinin
        en buyugunu bulma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci Sayi: ");
        int a= scan.nextInt();
        System.out.println("Ikinci Sayi: ");
        int b= scan.nextInt();
        System.out.println("Ucuncu Sayi: ");
        int c= scan.nextInt();

        int maks=-1;

        if (a>=b&&a>=c){
            maks=a;
        } else if (b>=a&&b>=c) {
            maks=b;

        }else {
            maks=c;
        }
        System.out.println("Maksimum Sayi: "+ maks);

    }
}

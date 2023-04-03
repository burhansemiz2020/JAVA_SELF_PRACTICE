package Questions_JavaRepeat;

import java.util.Scanner;

public class C02_Scanner_DataCasting {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin
        girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin
        yoksa girilen harfi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z'){
            System.out.println((char)(krk-32));
            System.out.println(Character.toUpperCase(krk));
            /*
            char data ascii tablosunu kullanir
            burdan buyuk A 65 kucuk a 97 aradaki
            fark 32 bu tum kucuk buyuk harflerde aynidir

             */
        }else{
            System.out.println(krk);
        }

    }
}

package Questions_WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class Q06_WhileLoopsQuestion04 {
    public static void main(String[] args) {
        /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();//random i atadigimiz da yukarda import random yazisini otomatik verdi
        int sayi= rnd.nextInt(100);
        int sayiTahmin=0;
        int sayac=1;

        while (sayi != sayiTahmin){
            System.out.println("Lutfen bir tahmin giriniz");
            sayiTahmin= scan.nextInt();
            if (sayi==sayiTahmin){//
                System.out.println("Sayiyi buldunuz TEBRIKLER");
                if (sayac<=3){
                    System.out.println("Vaowww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");

                } else {
                    System.out.println("basarisiz");
                }
                break;
            } else if (sayiTahmin<sayi) {
                System.out.println("Tahmininiz sayidan kucuk");
                sayac++;

            }else{
                System.out.println("Tahmininiz sayidan buyuk");
                sayac++;
            }
        }



    }
}

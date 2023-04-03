package Questions_JavaRepeat;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini aliniz
        kadin icin 60 yas ve uzeri
        erkek icin 65 yas uzeri emekli
        olabilirsin. Veya emekli olmak
        icin su kadar yil daha calismalisin
        yazdiriniz
        Hatali giris yapilirsa kullaniciyi uyarin
        ********
        EGER DEGISKEN SAYIMIZ BIRDEN FAZLA ISE
        DEGISKENLERDEN BIRINI ONCELIGE ALARAK
        ONA GORE BIR IF ELSE YAPISI KURULUR
        ORNEGIN BU SORUDA KADIN ERKEK SECIMINI
        ANA DEGISKEN YAPALIM
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz|n: Kadin=K veya k, Erkek=E veya e");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Yasinizi Giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='K' || cinsiyet=='k'){//kadin olanlar icin bu bolum
          if (yas<18 || yas >80) System.out.println("Gecersiz yas");
          else if (yas>=60) System.out.println("Emekli olabilirsin");
          else System.out.println("Emekli olmak icin: " +(60-yas)+ " yil calismalisin");

          }else if (cinsiyet=='E' || cinsiyet=='e'){//erkek olanlar icin bu bolum calisacak
            if (yas<18 || yas >80) System.out.println("Gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin: " +(65-yas)+ " yil calismalisin");

          }else System.out.println("yanlis cinsiyet bilgi girisi");




    }
}

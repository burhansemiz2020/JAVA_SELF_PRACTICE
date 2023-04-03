package Questions_JavaRepeat;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {
        /*
        1.Kullanicidan aldigi urun adedi ve liste fiyatini alin
        2.Musteri karti olup olmadigini sorun
        3.Karti varsa 10 urunden fazlasi icin %20, yoksa %15 indirim yapin
        4.Karti yoksa 10 urunden fazlasi icin %15, yoksa %10 indirim yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Urun adedini giriniz");
        int urunAdedi=scan.nextInt();
        System.out.println("Liste fiyatini giriniz");
        double listeFiyati=scan.nextDouble();

        System.out.println("Kartiniz var mi? :\n'E' : Evet\n'H' : Hayir");
        char kartBilgisi=scan.next().charAt(0);

        if (kartBilgisi=='E' || kartBilgisi=='e') {
            if (urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if (urunAdedi>10) System.out.println("%20 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.8);
            else System.out.println("%15 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.85);
        }
        else if (kartBilgisi=='H' || kartBilgisi=='h'){
            if (urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if (urunAdedi>10) System.out.println("%15 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.85);
            else System.out.println("%10 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.90);
        }
        else System.out.println("kart bilgisi gecersizdir");


    }
}

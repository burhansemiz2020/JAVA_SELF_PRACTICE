package Questions_JavaRepeat;

import java.util.Scanner;

public class C11_NestedIfElse {
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
        //Urun miktari ana degisken olsun
        if (urunAdedi>10){//urun sayisi 10 dan fazla
            if (kartBilgisi=='E' || kartBilgisi=='e') System.out.println("%20 indirimli fiyat: " +urunAdedi*listeFiyati*0.8);
            else if (kartBilgisi=='H' || kartBilgisi=='h') System.out.println("%15 indirimli fiyat: " +urunAdedi*listeFiyati*0.85);
            else System.out.println("Hatali Kart Bilgisi");

        } else if (urunAdedi>0) { //urun sayisi 0 ile 10 arasi
            if (kartBilgisi=='E' || kartBilgisi=='e') System.out.println("%15 indirimli fiyat: " +urunAdedi*listeFiyati*0.85);
            else if (kartBilgisi=='H' || kartBilgisi=='h') System.out.println("%10 indirimli fiyat: " +urunAdedi*listeFiyati*0.9);
            else System.out.println("Hatali Kart Bilgisi");
        }else{ //urun sayisi 0 ya da daha az
            System.out.println("Hatali urun adedi");
            /*
            Urun adedini giriniz
            20
            Liste fiyatini giriniz
            50
            Kartiniz var mi? :
            'E' : Evet
            'H' : Hayir
             H
            %15 indirimli fiyat: 850.0

               Process finished with exit code 0
             */
        }
    }
}

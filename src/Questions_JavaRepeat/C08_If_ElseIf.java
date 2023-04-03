package Questions_JavaRepeat;

import java.util.Scanner;

public class C08_If_ElseIf {
    public static void main(String[] args) {
        /*
        1.Kullanicidan aldigi urun adedi ve liste fiyatini alin
        2.Musteri karti olup olmadigini sorun
        3.Karti varsa 10 urunden fazlasi icin %20, yoksa %15 indirim yapin
        4.Karti yoksa 10 urunden fazlasi icin %15, yoksa %10 indirim yapin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Aldiginiz urun adedini giriniz");
        int urunAdedi= scanner.nextInt();

        System.out.println("liste fiyatini giriniz");
        double listeFiyati= scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi?:\nE: Evet, H:Hayir");
        char musteriKarti= scanner.next().charAt(0);
        
        if (musteriKarti=='E' && urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.8);
        } else if (musteriKarti=='E' && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.85);
                 
        } else if (musteriKarti=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.85);

        } else if (musteriKarti=='H' && urunAdedi>0) {
            System.out.println("%10 indirimli toplam fiyat: " + urunAdedi*listeFiyati*0.90);

        } else System.out.println("Hatali bilgi");

    }
}

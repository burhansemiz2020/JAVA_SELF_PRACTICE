package Questions_WiseQuarterPart02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course19_ArrayList06 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi giriniz: ");
        int girilenSayi=scan.nextInt();

        System.out.println(pozitifBolenleriListesi(girilenSayi));

    }
    public static List<Integer> pozitifBolenleriListesi(int sayi){//20
            List<Integer> pozitifBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                pozitifBolenlerListesi.add(i);
            }
            
        }return pozitifBolenlerListesi;

    }
}

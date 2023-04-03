package Questions_WhileLoops;

import java.util.Scanner;

public class Q05_WhileLoopsQuestion03 {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan Kullanicidan sifre
        isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip, kullanicinin
        yeni sifre girmesi isteyin. Gecerli bir
        sifre yazilincaya kadar bu islemi tekrar
        edin gecerli sifre yazilinca “sifreniz
        basari ile kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
        - sifrenin son karakteri sayi olmali
         */
        Scanner scan=new Scanner(System.in);
        boolean sifreDogrumu=false;
        String sifre="";
        char ilkK;
        char sonK;

        while (!sifreDogrumu){//eger sifre false ise
            System.out.println("Lutfen sifre giriniz");
            sifre= scan.nextLine();
            ilkK=sifre.charAt(0);
            sonK=sifre.charAt(sifre.length()-1);

            if (ilkK<'a' || ilkK>'z'){
                System.out.println("sifrenizin ilk harfi kucuk olmali");
            } else if (sonK<'0' || sonK>'9') {
                System.out.println("Sifrenizin son karakteri sayi olmali" );
            } else {
                System.out.println("Sifre basari ile olusturuldu");
                sifreDogrumu=true;
            }
        }

    }
}

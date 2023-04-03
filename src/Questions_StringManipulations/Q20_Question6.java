package Questions_StringManipulations;

import java.util.Scanner;

public class Q20_Question6 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim=scan.nextLine();

        int intIsim=isim.length();
        int intSoyisim=soyisim.length();
        //case 1
        System.out.println("Case 1");
        if (intIsim>intSoyisim){
            System.out.println(isim.substring(0, 1).toUpperCase()+isim.substring(1)+ " "+
            soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1)+"\n"+
                    "Si le cas 1 fonctionne, le cas 2 ne s'activera pas" );
        }
        //case 2
        System.out.println("Case 2");
        if (intSoyisim>intIsim){
            System.out.println(isim.substring(0, 1).toUpperCase()+isim.substring(1)+ " "+
            soyisim.substring(0).toUpperCase()+"\n"+
                    "Si le cas 2 fonctionne, le cas 1 ne s'activera pas");

        }

    }
}

package GrupCalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class ders03_03_23 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize

        liste olarak dondurecek bir method olusturun.
          */
        ArrayList<String> isimler = isimleriAl();
        System.out.println("Girilen isimler:");
        System.out.println(isimler);


    }

    public static ArrayList<String> isimleriAl() {
        ArrayList<String> isimler = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String isim="";
        while (!isim.equalsIgnoreCase("Q")) {
            System.out.println("Lütfen bir isim girin (Çıkış için Q):");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("Q")) {
                isimler.add(isim);

            }

        }
        return isimler;


    }
}

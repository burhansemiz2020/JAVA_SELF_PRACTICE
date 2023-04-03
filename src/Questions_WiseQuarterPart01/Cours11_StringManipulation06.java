package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours11_StringManipulation06 {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pass = scan.next();
        int flag = 0;
        //ilk harf kucuk harf olmali
        if (!(pass.charAt(0) >= 'a' && pass.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
            //son karakter rakam olmali
        }
        if (!(pass.charAt(pass.length() - 1) >= '0' && pass.charAt(pass.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag++;
            //sifre bosluk icermemeli
        }
        if ((pass.contains(" "))) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
            //uzunlugu en az 10 karakter olmali
        }
        if (pass.length() < 10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag == 0) {
            System.out.println("SUCCESSFULL");

        } else System.out.println("There is a problem");
    }
}


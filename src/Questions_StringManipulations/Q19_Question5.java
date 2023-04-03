package Questions_StringManipulations;

import java.util.Scanner;

public class Q19_Question5 {
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
        System.out.println("Entrez votre password");
        String pass = scan.nextLine();
        int flag=0;

        //Variable 1
        if (!(pass.charAt(0)>='a' && pass.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        //Variable 2
        if (!(pass.charAt(pass.length()-1)>='0' && pass.charAt(pass.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
            //if (!(pass.charAt(pass.length()-1)>=)) son karaktere goturur
        }
        //Variable 3
        if (pass.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        //Variable 4
        if (pass.length()<=9){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag==0) {
            System.out.println("SUCCESSFULL");
        }else {
            System.out.println("IL Y A UN SOUCIS CONTROLEZ VOTRE PASSWORD");
        }

    }
}

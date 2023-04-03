package Questions_StringManipulations;

import java.util.Scanner;

public class Q18_Question4 {
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
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez votre password");
        String pass=scan.nextLine();
        int flag=0;
        //1.ilk harf kucuk harf olmali
        if (pass.charAt(0)>='a' && pass.charAt(0)<='z'){
            flag++;
        } else{
            System.out.println("Ilk harf kucuk harf olmali");


        }//2. son karakter rakam olmali

        char sonHarf=pass.charAt(pass.length()-1);
        if (sonHarf>='0' && sonHarf<='9'){
            flag++;
        }else{
            System.out.println("Son karakter rakam olmali");

        }//3. sifre bosluk icermemeli

        if (pass.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else{
            flag++;

        }//4. uzunlugu en az 10 karakter olmali
        if (pass.length()>=10){
            flag++;
        }else{
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
        }
        if (flag==4){
            System.out.println("SUCCESFULL");
        }else{
            System.out.println("CONTROLEZ VOTRE PASS");

        }
            

    }
}

package Questions_StringManipulations;

import java.util.Scanner;

public class Q14_Contains {
    public static void main(String[] args) {
        //  Soru 1) Kullanicidan email adresini girmesini isteyin,
        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String mail=scan.nextLine().toLowerCase();
        //System.out.println(mail.toLowerCase());

        if (!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (mail.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        } else if (!mail.endsWith("@gmail.com")){
            System.out.println("lutfen yazimi kontol edin");
        } else{
            System.out.println("Hatali mail");
        }



    }
}

package Questions_StringManipulations;

import java.util.Scanner;

public class Q07_endsWith {
    public static void main(String[] args) {
        /*
         SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz");
        String mail= scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        } else System.out.println("Maili basarili sekilde girdiniz");
    }
}

package week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Kullanicida ad/soyad/yas/mail adresi//sifre bilgilerini alip
        sisteme kaydedildigini asagidaki formatta yazdirin.
        *****       KAYIT BAŞARILI      *****
        Adiniz          : Tarik
        Soyadiniz       : Yigit
        Yasiniz         : 42
        Mail adresiniz  : tarik@yigit.com.tr
        Sifre           :

         */

        System.out.println("Your name ?\n"+
                           "Your surname ?\n"+
                           "Your age ?\n"+
                           "Your mail adresse ?\n"+
                           "Your password ?\n");
            String title="Registration Succesfull";
            String name=scan.nextLine();
            String surname=scan.nextLine();
            int age=scan.nextInt();
            String mail=scan.nextLine();
            String password=scan.nextLine();

        System.out.println("******\t"+title.toUpperCase()+"\t******\n"+
                          "\tname: "+name+"\n"+
                          "\tsurname: "+surname+"\n"+
                          "\tage: "+age+"\n+"+
                          "\tmail: "+mail+"\n+"+
                          "\tpassword: "+password+"\n"+
                          "şeklinde sistemimize kaydınız başarıyla tamamlanmıştır."  );







    }
}

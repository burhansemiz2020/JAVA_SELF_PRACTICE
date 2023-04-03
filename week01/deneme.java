package week01;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("Mail adresinizi giriniz");
        String mail = scan.next();
        System.out.println("Sifrenizi giriniz");
        String sifre = scan.next();
        String kayit = "Kayit Basarili";

        System.out.println("******\t" + kayit.toUpperCase() + "\t*******\n"+
        "\tAdiniz:" + isim + "\n"+
        "\tSoyisminiz:" + soyisim + "\n"+
        "\tYasiniz:" + yas + "\n" +
        "\tMail adresiniz:" + mail + "\n"+
        "\tSifreniz: " + sifre + "\n"+
        "seklinde sistemimize kaydiniz basariyla tamamlanmistir!");


    }
}

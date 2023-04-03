package Questions_JavaRepeat;

import java.util.Scanner;

public class C12_If_ElseIf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi aliniz
        sayi rakam ise "girilen sayi rakam"
        sayi 2 basamakli ise "girilen sayi 2 basamakli"
        sayi 2 basamaktan buyukse "buyuk sayi"
        yazdiriniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int tamSayi = scan.nextInt();

        if (0<=tamSayi && tamSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=tamSayi && tamSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (tamSayi>=99) System.out.println("Buyuk sayi");
        else System.out.println("Hatali giris");
        /*
        Eger  if else cumleleri else ile bitmiyorsa
        tum durumlari kapsamaz
        yani bazi degerler icin hic bir
        if body si calismayabilir

        BU TUR SORULARI COZERKEN SARTLARIN
        TAMAMINI DIKKATLI YAZMAK GEREKIR
        */
    }
}

package Questions_StringManipulations;

import java.util.Scanner;

public class Q22_Question8 {
    public static void main(String[] args) {


    /*
    Soru 6 : Kullanicidan  bir String alin, String’in
        uzunlugu tek sayi ise tam ortasina "???" ekleyin,
        String’in uzunlugu cift sayi ise ortadaki harfi silin
        ve yerine "***" yazdirin.
     */
    Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=scan.next();

        if (kelime.length()%2!=0){
            System.out.println(kelime.substring(0, kelime.length()/2) +"???"
                    +kelime.substring(kelime.length()/2));

        }else if (kelime.length()%2==0){
            System.out.println(kelime.substring(0, kelime.length()/2) +"***"
                    +kelime.substring(kelime.length()/2));
        }

    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours11_StringManipulation02 {
    public static void main(String[] args) {
        /*
        Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini
        yazdirin
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.nextLine().toUpperCase();
        System.out.println("Enter text to search : ");
        String text = scan.nextLine().toUpperCase();

        int firstIndex = str.indexOf(text);
        int lastIndex = str.lastIndexOf(text);
        int secondIndex = str.indexOf(text, firstIndex + 1);

        if (firstIndex == -1) {
            System.out.println("str not include text");
        } else if (firstIndex == lastIndex) {
            System.out.println("str include text only one time");
        } else if (str.indexOf(text, secondIndex + 1) == -1) {
            System.out.println("str include text only two time");
        } else System.out.println("str include text more than two time");
        {

        }


    }

}


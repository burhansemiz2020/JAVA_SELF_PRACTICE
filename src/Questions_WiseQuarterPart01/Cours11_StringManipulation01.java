package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours11_StringManipulation01 {
    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin.
        String’in aranan metni icerip icermedigini lastIndexOf( )
        method’u kullanarak yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=scan.nextLine().toUpperCase();
        System.out.println("Enter text to search : ");
        String search=scan.nextLine().toUpperCase();
        System.out.println(str.lastIndexOf(search));
        }


    }



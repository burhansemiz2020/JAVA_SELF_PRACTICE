package Questions_WiseQuarterPart01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cours11_StringManipulation07 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
        - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scan.nextLine();
        System.out.println("Enter your surname: ");
        String surname=scan.nextLine();
        int intName=name.length();
        int intSurname=surname.length();

        if(intName>intSurname){
            System.out.println(name.substring(0,1).toUpperCase() + name.substring(1) +
                    " " + surname.substring(0,1).toUpperCase() + surname.substring(1));
        }else{
            System.out.println(name.substring(0,1).toUpperCase() + name.substring(1) +
                    " " + surname.substring(0).toUpperCase()) ;
        }
    }
}

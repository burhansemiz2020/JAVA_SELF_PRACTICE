package Questions_Methods;

import java.util.Scanner;

public class Q14_Method_Question2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scan.nextLine();
        System.out.println("Enter your surname: ");
        String surname=scan.nextLine();
        System.out.println(nameSurname(name, surname));
    }
    public static String nameSurname(String name, String surname) {

        name=name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        surname=surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();

        return name+" "+surname;


    }

}

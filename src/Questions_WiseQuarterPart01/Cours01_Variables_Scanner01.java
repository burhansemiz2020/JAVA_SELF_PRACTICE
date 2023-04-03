package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner01 {
    /*
    Soru 1- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
yazdirin.
     */
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
        System.out.println("(String)Enter your name: ");
        String name=scan.nextLine();
        System.out.println("(Integer)Enter your age: ");
        int age=scan.nextInt();
        System.out.println("(Boolean)Are your married? Yes=True//No=False");
        boolean marriage=scan.nextBoolean();
        System.out.println("***You entered the infos correctly***");
        /*
        (String)Enter your name:
        burhan semiz
        (Integer)Enter your age:
        37
        (Boolean)Are your married? True/False
        true
        ***You entered the infos correctly***
         */

    }
    }

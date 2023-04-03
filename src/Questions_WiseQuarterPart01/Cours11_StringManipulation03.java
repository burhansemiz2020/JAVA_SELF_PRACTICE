package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours11_StringManipulation03 {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = scan.nextLine().toLowerCase();

        if (str.contains("home")&&str.contains("work")) {
            System.out.println("need both home and work");
        } else if (str.contains("home")) {
            System.out.println("need home");
        } else if (str.contains("work")) {
            System.out.println("need work");
        }else System.out.println("Yo have to work hard");


    }
}
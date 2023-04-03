package Questions_StringManipulations;

import java.util.Scanner;

public class Q15_Question1 {
    public static void main(String[] args) {
       /*
       Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez une phrase");
        String phr=scan.nextLine().toLowerCase();
        
        if (phr.contains("ev") && phr.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (phr.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (phr.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calismak lazim");
        }
        scan.close();
    }
}

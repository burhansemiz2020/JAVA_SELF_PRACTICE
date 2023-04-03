package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours10_SwitchStatements04 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini
        ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        I : International S : Software T : Testing Q : Qualifications B: Board
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the a letter of the ISTQB: ");
        String letter=scan.next().toUpperCase();
        switch (letter){
            case "I":
                System.out.println("International");
                break;
            case "S":
                System.out.println("Software");
                break;
            case "T":
                System.out.println("Testing");
                break;
            case "Q":
                System.out.println("Qualifications");
                break;
            case "B":
                System.out.println("Board");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

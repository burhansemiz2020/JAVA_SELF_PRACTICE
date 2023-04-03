package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements05 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi sorun, istedigi birim
        metre veya santimetre ise cevirip yazdirin, yoksa
        “istediginiz birim sisteme kayitli degil” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the distance as km = ");
        double km=scan.nextDouble();
        System.out.println("Enter the unit: " + " for metre m: " + "for cm cm: ");
        int unit=scan.nextInt();
        double m=1;
        double cm=2;
        m=km*1000;
        cm=1*100;

        if (unit==1){
            System.out.println(m);
        } else if (unit==2) {
            System.out.println(cm);
        } else{
            System.out.println("The unit you want is not registered to the system.");
            }
        }

    }


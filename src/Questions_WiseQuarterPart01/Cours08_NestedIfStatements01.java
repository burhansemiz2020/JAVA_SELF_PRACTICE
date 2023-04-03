package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours08_NestedIfStatements01 {
    public static void main(String[] args) {
        /*
        Ornegin : Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri
        emekli olabilir. Cinsiyet ve yasini dikkate alarak
        “Emekli olabilirsin” veya “Emekli olmak icin ..
        Yil daha calisman gerekir” yazdirin.

        gender esas alinacak
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender: choice: Woman=W or w // Man=M or m");
        char gender = scan.next().toUpperCase().charAt(0);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (gender == 'W') {
            if (age >= 60 && age <= 80) {
                System.out.println("You are eligible to retire");
            } else if (age < 60 && age > 17) {
                System.out.println("For retirement you have to work " + (60-age) + " years");

            }
        } else if (gender == 'M') {
            if (age >= 65 && age <= 80) {
                System.out.println("You are eligible to retire");
            } else if (age < 65 && age > 17) {
                System.out.println("For retirement you have to work " + (65-age) + " years");

            }

        }else {
            System.out.println("Invalid info for gender");
        }
    }


}






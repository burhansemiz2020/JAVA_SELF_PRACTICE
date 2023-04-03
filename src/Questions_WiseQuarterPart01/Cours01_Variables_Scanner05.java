package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner05 {
    public static void main(String[] args) {
    /*
    Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
girilen bilgiler : J Doe, 44
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        char name = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Enter your surname: ");
        String surname = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();


        System.out.println("\n" + name + " " + surname + ", " + age);
        /*
        Enter your name:
        burhan
        Enter your surname:
        semiz
        Enter your age:
        37

        B semiz, 37
         */

    }

}

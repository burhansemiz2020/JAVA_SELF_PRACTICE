package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner03 {
    public static void main(String[] args) {


    /*
    Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
     */
    Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= scan.nextLine();
        System.out.print("Enter your surname: ");
        String surname=scan.nextLine();
        System.out.print("Enter your age: ");
        int age=scan.nextInt();
        System.out.println("*** *** ***");
        System.out.println("Your name: " +name+ "\nYour surname: " +surname+ "\nYour age: " +age+
                "\n***Your registration has been successfully completed.***");
        /*
        Enter your name: Burhan
        Enter your surname: Semiz
        Enter your age: 37
        *** *** ***
        Your name: Burhan
        Your surname: Semiz
        Your age: 37
        ***Your registration has been successfully completed.***
         */
    }
}

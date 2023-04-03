package Questions_JavaPrograms;

import java.util.Scanner;

public class Program01_Calculateur {
    public static void main(String[] args) {
        /*
        Les operations avec le switch case
        */
       Scanner scan=new Scanner(System.in);
        System.out.println("Operations");
        String Islemler=
                 "1. Addition\n"
                +"2. Soustraction\n"
                +"3. Multiplication\n"
                +"4. Division\n";
        System.out.println(Islemler);
        System.out.println("Selectionnez Operation");
        String operation=scan.nextLine();
        int a;
        int b;

        switch (operation){
            case "1":
                System.out.println("premier num: ");
                a= scan.nextInt();
                System.out.println("deuxieme num: ");
                b= scan.nextInt();
                System.out.println("Result : " +(a+b));
                break;
            case "2":
                System.out.println("premier num: ");
                a= scan.nextInt();
                System.out.println("deuxieme num: ");
                b= scan.nextInt();
                System.out.println("Result : " +(a-b));
                break;
            case "3":
                System.out.println("premier num: ");
                a= scan.nextInt();
                System.out.println("deuxieme num: ");
                b= scan.nextInt();
                System.out.println("Result : " +(a*b));
                break;
            case "4":
                System.out.println("premier num: ");
                a= scan.nextInt();
                System.out.println("deuxieme num: ");
                b= scan.nextInt();
                System.out.println("Result : " +((double)a/b));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

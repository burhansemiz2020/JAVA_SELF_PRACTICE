package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner02 {
    public static void main(String[] args) {


    /*
    Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
yazdirin.
     */
    Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number Double: ");//enter the double with comma
        double num1=scan.nextDouble();
        System.out.print("Enter a number Integer: ");
        int num2=scan.nextInt();
        System.out.println("The sum of the two numbers is= " +(num1+num2));
        System.out.println("The multiplication of the two numbers is= " + (num1*num2));
        /*
        Enter a number Double: 12,5
        Enter a number Integer: 8
        The sum of the two numbers is= 20.5
        The multiplication of the two numbers is= 100.0
         */
    }
}

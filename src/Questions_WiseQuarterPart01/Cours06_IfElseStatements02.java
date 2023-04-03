package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours06_IfElseStatements02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin,
        harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        Kullanici o veya O yazdiginda output Ocak olsun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter = scan.next().toUpperCase().charAt(0);
        /*
        January==Febuary==March==April==May==June==
        July==August==September==October==November==December
         */
        if (letter == 'J') {
            System.out.println("January" + "June" + " July");
        }
        if (letter == 'F') {
            System.out.println("Febuary");
        }
        if (letter == 'M') {
            System.out.println("March " + "May");
        }
        if (letter == 'A') {
            System.out.println("April " + "August");
        }
        if (letter == 'S') {
            System.out.println("September");
        }
        if (letter == 'O') {
            System.out.println("October");
        }
        if (letter == 'N') {
            System.out.println("November");
        }
        if (letter == 'D') {
            System.out.println("December");
        }
        /*
        Enter a letter:
        a
        April August
         */

    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours08_NestedIfStatements03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num % 2 != 0) {//ODD number
            if (num < 0) {
                System.out.println("Number is negative");

            } else if (num >= 0) {
                System.out.println("Number is positive");

            }

        } else {//EVEN number
            if (num % 10 == 0) {
                System.out.println("Number is a multiple of 10");
            } else System.out.println("Number is not a multiple of 10");
        }

    }
}

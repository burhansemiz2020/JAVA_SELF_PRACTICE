package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements01 {
    public static void main(String[] args) {
        /*
        Ornek :
        Ogrencinin notu 85 ve ustu ise AA,
        (85 ve ustu degilse) 65 ve ustu ise BB,
        (65 ve ustu de degilse) 50 ve ustu ise CC,
        (geriye kalanlar) DD
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your note: ");
        int note = scan.nextInt();

        if (note >= 85 && note <= 100) {
            System.out.println("Your note is: AA = " + note + " // You pass the exam");
        } else if (note >= 65 && note < 85) {
            System.out.println("Your note is: BB = " + note + " // You pass the exam");
        } else if (note >= 50 && note < 65) {
            System.out.println("Your note is: CC = " + note + " // You pass the exam");
        } else if (note >= 0 && note < 50) {
            System.out.println("Your note is: DD = " + note + " // You failed the exam");
        } else {
            System.out.println("You enter the invalid note");
        }
        /*
        Enter your note:
        47
        Your note is: DD = 47 // You failed the exam
         */
    }
}



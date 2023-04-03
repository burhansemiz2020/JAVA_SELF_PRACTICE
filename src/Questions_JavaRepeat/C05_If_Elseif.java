package Questions_JavaRepeat;

import java.util.Scanner;

public class C05_If_Elseif {
    public static void main(String[] args) {
         /*
        Ogrencinin notu 85 ve ustu ise AA
        65 ustu ise BB
        50 ustu ise CC
        geriye kalanlar DD
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Giriniz");
        double note= scan.nextDouble();
        if (note<0 || note >100){
            System.out.println("Gecersiz not");
        } else if (note>=85) {
            System.out.println("Notunuz AA");
        } else if (note<85 && note>=65){
            System.out.println("Notunuz BB");
        } else if (note<65 && note>=50) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz DD kaldiniz");
        }
    }
}

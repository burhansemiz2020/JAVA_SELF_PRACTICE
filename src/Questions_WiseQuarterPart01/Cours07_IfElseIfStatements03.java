package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours07_IfElseIfStatements03 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight (kg): ");
        double kg = scan.nextDouble();
        System.out.println("Enter your height (cm): ");
        double cm = scan.nextDouble();
        double bmi = (kg * 10000) / (cm * cm);//bmi equals to : body mass index

        if (bmi > 30) {
            System.out.println("ALLERTE: You're obese");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Attention: you are overweight");
        } else if (bmi>20&&bmi<=25){
            System.out.println("You re BMI is normal");
        } else {
            System.out.println("You re weak");
        }
        /*
        Dans les questions au dessus il n'y a pas d'info sur
        les exceptions par exemple si utilisateur peut entre
        le chiffre de poid numero negatif. Dans ce cas, normallement
        le modele doit allerter dans le code block ou dans le consol
        cependant dans la question il ne l'a pas demande donc a present
        on fait pas detailler.
         */
    }
}

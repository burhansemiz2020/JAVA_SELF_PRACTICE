package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours06_IfElseStatements01 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir sayi isteyin,
        sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        if (num%5==0){
            System.out.println("Exact multiple of number 5");
            /*
            Enter a number:
            25
            Exact multiple of number 5
             */
        }
    }
}

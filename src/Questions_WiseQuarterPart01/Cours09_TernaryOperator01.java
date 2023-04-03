package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator01 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan bir sayi isteyin,
        sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        System.out.println(a%5==0 ? "Sayi 5'in tam kati" : "Sayi 5'in tam kati degil");
    }
}

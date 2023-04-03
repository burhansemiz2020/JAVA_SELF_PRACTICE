package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours06_IfElseStatements03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        sayi”, 5 ile bolunebiliyorsa “Bes ile
        bolunebilen sayi” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scan.nextInt();
        if (num%3==0){
            System.out.println("Number divisible by three");
        }if (num%5==0) {
            System.out.println("Number divisible by fıve");
            /*
            Enter a number:
            21
            Number divisible by three
            ====
            Enter a number:
            25
            Number divisible by fıve
            ====
            Enter a number:
            15
            Number divisible by three
            Number divisible by fıve
             */
        }
        }
}

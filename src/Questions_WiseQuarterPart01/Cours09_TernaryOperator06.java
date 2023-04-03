package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator06 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=scan.nextInt();
        System.out.println(a>=0?a:(a*-1));
    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator04 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan iki sayi alin ve
        buyuk olmayan sayiyi yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println((a>b)?b:a);
        System.out.println(Math.min(a, b));

    }
}

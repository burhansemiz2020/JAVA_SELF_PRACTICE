package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator05 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan notunu alin 50
        veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your note: ");
        int a=scan.nextInt();
        System.out.println((a>=50)?"You passed":"You failed");
    }
}

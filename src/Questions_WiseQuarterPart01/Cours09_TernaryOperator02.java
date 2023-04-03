package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse
        “Eskenar degil” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the three lines of a triangle : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println((a==b)&&(b==c)&&(c==a)? "Equilateral triangle" : "not a equilateral triangle");
    }
}

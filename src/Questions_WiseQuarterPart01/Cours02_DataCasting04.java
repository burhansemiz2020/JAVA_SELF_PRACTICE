package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours02_DataCasting04 {
    public static void main(String[] args) {
       /*
       Soru 4- Kullanicidan iki double sayi alin,
       ilk sayiyi ikinci sayiya bolun ve bolum
       isleminin sonucununun tamsayi kismini yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num1= ");
        double num1=scan.nextDouble();
        System.out.println("Enter num2= ");
        double num2=scan.nextDouble();
        int result=((int) num1)/ ((int) num2);
        System.out.println(result);
        /*
        Enter num1=
        50
        Enter num2=
        4
        12
         */
    }
}

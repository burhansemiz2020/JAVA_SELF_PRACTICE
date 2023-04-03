package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours02_DataCasting01 {
    public static void main(String[] args) {
       /*
       Soru 1- Int olarak verilen 3 degerin ortalamasini
       double olarak yazdiran bir kod yazin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three value as integer: ");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        double numx= num1+num2+num3;
        System.out.println(numx);
        System.out.println(Double.sum(num1, num2) + num3);


    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours02_DataCasting05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir double, bir tamsayi alin,
        double sayiyi ikinci sayiya bolun ve bolum
        isleminin sonucununun tamsayi kismini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the double number: ");
        double num1=scan.nextDouble();
        System.out.println("Enter the integer number: ");
        int num2=scan.nextInt();
        int result= ((int) num1)/ ((int) num2);
        System.out.println("The result of the given question is= " +result);
        /*
        Enter the double number:
        15,8
        Enter the integer number:
        5
        The result of the given question is= 3
         */

    }
}

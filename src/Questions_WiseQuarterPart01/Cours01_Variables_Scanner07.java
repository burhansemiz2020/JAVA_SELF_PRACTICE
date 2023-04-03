package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner07 {
    public static void main(String[] args) {


    /*
    Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
     */
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number= ");
        int num1=scan.nextInt();
        System.out.println("Enter the second number= ");
        int num2=scan.nextInt();

        int temp=0;

        temp=num2;
        num2=num1;
        num1=temp;



        System.out.println("Num1= " +num1);
        System.out.println("Num2= " +num2);
            /*
            Enter the first number=
            5
            Enter the second number=
            10
            Num1= 10
            Num2= 5
             */
    }
}

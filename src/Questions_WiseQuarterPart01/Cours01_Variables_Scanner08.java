package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours01_Variables_Scanner08 {
    public static void main(String[] args) {
    /*
    Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap).
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the num1= ");
        int num1=scan.nextInt();
        System.out.println("enter the num2= ");
        int num2=scan.nextInt();

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Num1= " +num1);
        System.out.println("Num2= " +num2);

        /*
        Enter the num1=
        50
        enter the num2=
        100
        Num1= 100
        Num2= 50
         */


    }
}

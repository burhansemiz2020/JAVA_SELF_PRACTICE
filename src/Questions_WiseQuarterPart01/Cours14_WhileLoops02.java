package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours14_WhileLoops02 {
    public static void main(String[] args) {
        /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=scan.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        System.out.println(sum);


    }
}

package Questions_WhileLoops;

import java.util.Scanner;

public class Q08_WhileLoopsQuestion02 {
    public static void main(String[] args) {
        /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();

        int sum=0;
        while (num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("The sum of the numbers entered: " +sum);

    }

}

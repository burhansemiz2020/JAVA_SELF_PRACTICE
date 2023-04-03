package Questions_ForLoops;

import java.util.Scanner;

public class Q19_ForLoops_Udemy {
    public static void main(String[] args) {
        /*
        Faktoryel hesabi
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int fak=1;
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            fak*=i;

            System.out.println("Faktoryel= " + fak + " i = " +i);
        }
        System.out.println("Faktoryel= " + fak);

    }
}

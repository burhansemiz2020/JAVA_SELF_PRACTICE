package Questions_ForLoops;

import java.util.Scanner;

public class Q25_ForLoops_Udemy_FaktoriyelSorusu {
    //Bir sayi alin, sayinin faktoriyelinin yarisini yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        //int a = scan.nextInt();
        //int fak=1;
        //for (int i = 1; i <=a ; i++) {
        //    fak*=i;
//
        //}
        //fak= fak/2;
        //System.out.println(fak);
        //System.out.println("==================");
        //while dongusu ile faktoriyel hesapla cikan sayinin yarisini al
        //int b=scan.nextInt();
        //int fakt=1;
//
        //while(b>0){
        //    fakt*=b;
//
        //    b--;
//
        //}
        //System.out.println(fakt/2);
        int a=scan.nextInt();
        int sum=0;
        do {
            sum+=a%10;
            a/=10;
        }
        while(a>0);
            System.out.println(sum);

    }
}

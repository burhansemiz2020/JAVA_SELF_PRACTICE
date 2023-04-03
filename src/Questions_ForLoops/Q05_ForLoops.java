package Questions_ForLoops;

import java.util.Scanner;

public class Q05_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        bu sayinin faktoryel degerini
        hesaplayin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("20 den kucuk bir sayi giriniz");
        int sayi=scan.nextInt();


        System.out.print(sayi + "!=");
        int fak=1;

        for (int i=sayi; i>1; i--){
            fak*=i;
            System.out.print(i +"*");
        }
        System.out.print("1= " + fak);
    }
}

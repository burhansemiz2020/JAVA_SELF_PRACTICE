package Questions_ForLoops;

import java.util.Scanner;

public class Q08_ForLoops {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        Scanner scan=new Scanner(System.in);
        System.out.println("10 dan kucuk bir tamsayi giriniz: ");
        int sayi=scan.nextInt();

        System.out.print(sayi + "!=");//bu kisimda faktoryeli tanimladik
        int faktoryel=1;//atamasini yaptik


        for (int i = sayi; i >1; i--){
            faktoryel*=i;
            System.out.print(i+"*");


        }
        System.out.println("1=" + faktoryel);
        scan.close();
    }
}

package Questions_WhileLoops;

import java.util.Scanner;

public class Q03_WhileLoopsQuestion01 {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan toplanmak uzere sayilar
        isteyin toplam 500 olur veya gecerse
        toplami yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int i=0;
        int sum=0;

        while (sum<=500){
            System.out.println("Lutfen toplamak uzere sayi girin");
            i=scan.nextInt();
            sum+=i;
        }
        System.out.println("Girilen sayilarin toplami: "+ sum);
        /*
        Lutfen toplamak uzere sayi girin
        5
        Lutfen toplamak uzere sayi girin
        10
        Lutfen toplamak uzere sayi girin
        450
        Lutfen toplamak uzere sayi girin
        50
        Girilen sayilarin toplami: 515
         */



    }
}

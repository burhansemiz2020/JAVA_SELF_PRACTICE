package Questions_WhileLoops;

import java.util.Scanner;

public class Q04_WhileLoopsQuestion02 {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere sayilar
        isteyin toplam 50 olur veya gecerse
        toplami yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while (toplam<=50){
            System.out.println("Lutfen sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen degerin toplami: " +toplam);

        System.out.println("==============================");

        int start=0;
        int sum=0;

        while (sum<45){
            System.out.println("Enter a value: ");
            sum=scan.nextInt();
            sum+=start;

        }
        /*
        Faitez avec multiplication
         */
        System.out.println("The total value is: " +sum);

        System.out.println("===============================");

        int k=1;

        int total=1;

        while (total<100){
            System.out.println("Enter a value please");
            k=scan.nextInt();
            total *= k;
        }
        System.out.println("The total value is: " +total);
    }
}

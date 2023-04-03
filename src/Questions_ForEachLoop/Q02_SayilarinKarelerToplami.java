package Questions_ForEachLoop;

import java.util.Scanner;

public class Q02_SayilarinKarelerToplami {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin
        karelerini alip, karelerinin toplamini
        yazdiran bir method olusturun.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {//1. for toplam n  degeri kadar sayi atamayi for dongusu icinde saglar
            System.out.print("Sayı " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Girilen sayılar: ");//2. for degerler
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        karelerToplamiYazdir(numbers);


        }
        public static void karelerToplamiYazdir(int[]arr){
        int toplam=0;
            for (int each:arr
                 ) {
                toplam+=each*each;
            }
            System.out.println("Verilen array'deki sayilarin kareler toplami= " + toplam);
        }

    }

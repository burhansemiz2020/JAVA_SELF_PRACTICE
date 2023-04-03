package Questions_ForLoops;

import java.util.Scanner;

public class Q03_ForLoops {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aradaki tum sayilari toplamak icin iki tam sayi girin...");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int kucuk;
        int buyuk;
        if (sayi1>sayi2){
            System.out.println("Uyari");
        }
        else  {
            buyuk=sayi2;
            kucuk=sayi1;
        }
        int toplam=0;

        for (int i = sayi1; i <= sayi2; i++) {
            toplam+=i;
        }
        System.out.println("toplam : " + toplam);
        scan.close();
        //SORU
    }
}





package Questions_ForLoops;

import java.util.Scanner;

public class Q04_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum
        sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi 1'i giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Sayi 2'i giriniz");
        int sayi2=scan.nextInt();

        int kucuk;
        int buyuk;

        if (sayi1>sayi2){
            buyuk=sayi1;
            kucuk=sayi2;
        }else {
            buyuk=sayi2;
            kucuk=sayi1;
        }
        int sum=0;
        for (int i=kucuk; i<=buyuk; i++){
            sum+=i;
        }
        System.out.println("Girilen sayilarin toplami: " + sum);
        scan.close();

    }
}

package Questions_ForLoops;

import java.util.Scanner;

public class Q06_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoryel hesaplamak icin 20'dan kucuk bir tam sayi girin...");
        int sayi = scan.nextInt();

        System.out.print(sayi + "!=");
        int faktoryel=1;

        for (int i = sayi; i >1; i--) {
            faktoryel*=i;
            System.out.print(i +"*");

        }

        System.out.println("1=" + faktoryel);
        scan.close();
    }
}

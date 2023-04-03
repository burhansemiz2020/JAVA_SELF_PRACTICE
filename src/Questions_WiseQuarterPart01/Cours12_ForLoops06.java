package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops06 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        System.out.print(num + "!=");
        int fak = 1;

        for (int i = num; i > 1; i--) {
            fak *= i;
            System.out.print(i + "*");

        }
        System.out.print("1=" + fak);


    }
}

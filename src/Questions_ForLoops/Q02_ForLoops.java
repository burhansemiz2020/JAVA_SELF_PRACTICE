package Questions_ForLoops;

import java.util.Scanner;

public class Q02_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin,
        1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tamsayi girin");
        int sayi=scan.nextInt();
        for (int i= 1; i<=sayi; i++){
            if (i%7==0){
                System.out.print(i + " ");
                /*
                Pozitif bir tamsayi girin
                70
                    7 14 21 28 35 42 49 56 63 70
                 */
            }
        }
        System.out.println("\n ***** ");
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin,
        girilen sayidan 1’e sayiya kadar(1
        dahil degil) 9 ila bolunebilen sayilari yazdirin.
         */
        System.out.println("Pozitif bir tamsayi girin");
        int num=scan.nextInt();
        for (int i=num; i>1; i--){
            if (i%9==0){
                System.out.print(i + " ");
            }
        }


    }
}

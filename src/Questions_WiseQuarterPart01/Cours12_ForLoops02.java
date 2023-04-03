package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan pozitif bir tamsayi alin,
        1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        for (int i = 1; i < num ; i++) {
            if (i%7==0) {
                System.out.println(i);
            }



        }
    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops04 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri
        olarak pozitif sayilar alin, sinirlar dahil
        olarak aralarindaki tum sayilarin toplamini
        yazdirin. Bitis degeri baslangic degerinden
        kucuk olsa da program calissin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = scan.nextInt();

        int sum = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            System.out.println("sum= "+sum);

            }else {
                for (int i = num2; i <= num1; i++) {
                    sum += i;
                }
            System.out.println("sum= "+sum);

        }
    }
}

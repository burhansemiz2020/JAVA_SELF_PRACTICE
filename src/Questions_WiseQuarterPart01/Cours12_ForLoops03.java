package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a num1: ");
        int num1=scan.nextInt();
        System.out.println("Enter a num2: ");
        int num2=scan.nextInt();
        int sum=0;

        if (num1>num2){
            System.out.println("Alert");
        }else {

            for (int i=num1;i<=num2;i++){
                sum=sum+i;
            }
            System.out.println("Sum: " +sum);
        }


    }
}

package Questions_Methods;

import java.util.Scanner;

public class Q16_Method_Question4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        Girilen sayinin pozitif tam bolenleri sayisini bulup
        bize donduren bir method olusturun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sayi=scan.nextInt();



    }public static void divisorNumber(int sayi){
        int bolen=1;
        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.println("bolenler: " +bolen);
            }
            bolen++;
        }

    }

}

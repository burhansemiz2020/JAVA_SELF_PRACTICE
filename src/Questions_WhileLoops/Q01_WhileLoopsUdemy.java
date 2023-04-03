package Questions_WhileLoops;

import java.util.Scanner;

public class Q01_WhileLoopsUdemy {
    public static void main(String[] args) {
        //Kosul dogru oldugu surece calisir
        //Bu noktada for dongusu gibi true
        // oldugunda calisir
        /*
        Ancak for dongusunde arttirma azaltma
        otomatik olarak oluordu. While da ise
        bu otomatik olmuyor kullanici yapiyor

         */
        //for (int i=0; i<10; i++){
        //    System.out.println("i= " + i);

        //int i=0;
        //while(i<10){
        //    System.out.println("i = " + i);
        //    i++;

        //int i=10;
        //while(i<100) {
        //    System.out.println("i = " + i);
        //    i+=3;
//
        //}
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi=scan.nextInt();
        int fak=1;

        while (sayi>0){
            fak*=sayi;
            sayi--;
        }
        System.out.println("Faktoryel = " +fak);
        /*
        While dongulerinde sik sik sonsuz
        dongu
         */


    }
}

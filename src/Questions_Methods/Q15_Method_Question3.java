package Questions_Methods;

import java.util.Scanner;

public class Q15_Method_Question3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif
        bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak
        “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        primeNumber(num);
    }public static void primeNumber(int num){
        int flag=0;
        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                flag++;
                break;
            }

        }if (num==2){
            System.out.println("This is a prime number: " +num);
        }else if (flag==0) {
            System.out.println("This is a prime number: " +num);
        }else {
            System.out.println("This is not a prime number");
        }
    }

}

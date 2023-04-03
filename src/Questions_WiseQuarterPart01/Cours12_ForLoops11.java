package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops11 {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num=scan.nextInt();
        int count=0;

        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }

    }
}

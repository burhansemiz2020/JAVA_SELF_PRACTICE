package Questions_JavaRepeat;

import java.util.Scanner;

public class C03_Scanner_DataCasting {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini
        isteyin. Girilen karakterin buyuk harf
        olup olmadigini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez un character");
        char character1=scan.next().charAt(0);
        if (character1>='A' && character1<='Z'){
            System.out.println("Girilen Buyuk" );
        }else{
            System.out.println("Buyuk degil");
        }
    }
}

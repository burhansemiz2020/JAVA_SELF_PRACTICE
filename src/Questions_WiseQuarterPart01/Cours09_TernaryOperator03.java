package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours09_TernaryOperator03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi
        yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter=scan.next().charAt(0);
        System.out.println(((letter>='a')&&(letter<='z')?((char)(letter-32)):letter));
    }
}

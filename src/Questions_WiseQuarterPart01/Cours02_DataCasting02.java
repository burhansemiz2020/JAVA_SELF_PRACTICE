package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours02_DataCasting02 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan bir harf alin ve
        alfabede o harften sonraki 3 harfi yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter=scan.next().charAt(0);
        System.out.println((char) (letter+1)+ "\n"
            +(char)(letter+2)+ "\n" +(char)(letter+3));
        /*
        Enter a letter
           a
           b
           c
           d
         */

    }
}

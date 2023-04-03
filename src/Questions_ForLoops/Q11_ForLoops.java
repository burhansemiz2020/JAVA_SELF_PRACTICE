package Questions_ForLoops;

import java.util.Scanner;

public class Q11_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String
        isteyin ve String’i tersten yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bi yazi yaziniz");
        String str=scan.nextLine();
        for (int i=str.length()-1 ; i>=0; i--){
            System.out.print(str.substring(i,i+1));
        }
        /*
        bu soruyu tekrar et

         */
    }
}

package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops10 {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
kaydedin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Input a string : ");
        String str=scan.nextLine();

        String output="";
        for (int i = str.length()-1; i >=0 ; i--) {
            output+=str.charAt(i);

        }
        System.out.println(output);



    }
}

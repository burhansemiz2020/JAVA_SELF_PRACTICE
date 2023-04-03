package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours13_MethodCreatingUsing04 {
    public static void main(String[] args) {
        /*
        Verilen bir string i tersine
        cevirip bize donduren bir metot olusturun
         */


        System.out.println(reverseString("Java"));

    }
    public static String reverseString(String str) {

        String str1 = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1+=str.charAt(i);

        }
        return str1;

    }
}

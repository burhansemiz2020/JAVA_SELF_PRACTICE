package Questions_WiseQuarterPart01;

import java.util.Locale;
import java.util.Scanner;

public class Cours14_WhileLoops03 {
    public static void main(String[] args) {
        /*
        Soru 3- While loop kullanarak verilen
        bir String’i terse cevirip, bu halini bize
        donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz : ");
        String str = scan.nextLine();
        System.out.println(terseDondur(str));
    }

    public static String terseDondur(String str){
        String tersStr ="";
        int i = str.length()-1;

        while (i >= 0){

            tersStr += str.charAt(i);

            i--;
        }
        return tersStr;


    }


}











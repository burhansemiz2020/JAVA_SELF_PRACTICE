package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours11_StringManipulation08 {
    public static void main(String[] args) {
    /*
    Soru 6 : Kullanicidan alinan bir String alin,
    String’in uzunlugu cift sayi ise tam ortasina
    :) ekleyin, String’in uzunlugu tek sayi ise
    ortadaki harfi silin ve yerine :( yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        if (str.length()%2==0) {
            System.out.println(str.substring(0,str.length()/2) +":)"+str.substring(str.length()/2));
        }else{
            System.out.println(str.substring(0,str.length()/2)+":("+str.substring(str.length()/2+1));
        }
    }
}

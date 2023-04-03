package Questions_ForLoops;

import java.util.Scanner;

public class Q12_ForLoops {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin
        ve String’i tersine cevirip kaydedin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();



        System.out.println(tersineCevir(str));

        scan.close();
    }

    public static String tersineCevir(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0; i--) {


            tersStr+=str.substring(i, i+1);

        }


        return tersStr;
        //BU KONUYU TEKRAR ET
    }
}

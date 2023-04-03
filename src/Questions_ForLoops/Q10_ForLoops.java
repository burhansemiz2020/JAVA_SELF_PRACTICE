package Questions_ForLoops;

import java.util.Scanner;

public class Q10_ForLoops {
    public static void main(String[] args) {
        // Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();

        // Fatih




        for (int i = str.length()-1 ; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));

        }


        scan.close();

    }
}

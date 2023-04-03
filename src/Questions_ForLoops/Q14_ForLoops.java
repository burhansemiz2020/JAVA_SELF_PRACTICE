package Questions_ForLoops;

import java.util.Scanner;

public class Q14_ForLoops {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        //			Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str=scan.nextLine();
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.substring(i, i + 1);
        }
        if (tersStr.equals(str)) {
            System.out.println("Bu String bir palindrome dur");
        } else {
            System.out.println("Bu String bir palindrome degildir");
        }
        scan.close();
    }
}

package Questions_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class Q03_CiftTekSayiKelime {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.
        ****
        Question 3- Checking each element in a given String array,
         - If the length of the word is an even number, return the first half
         - If the length of the word is odd, add the second half, including the middle letter, to a new list and print it.
            Solve the question with the for each method
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "C#", "Python", "PHP"));
        for (String word : list) {
            if (word.length() % 2 == 0) {
                System.out.println(word.substring(0, word.length() / 2));
            } else {
                System.out.println(word.substring(0, word.length() / 2) + word.substring(word.length() / 2 + 1));
            }
        }

    }
}

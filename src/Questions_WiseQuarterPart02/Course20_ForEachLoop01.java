package Questions_WiseQuarterPart02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course20_ForEachLoop01 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum elemanlardan sadece 1 tane
        yapip eski array’e yeni halini atayip yazdirin.
         */
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 3}; // Orijinal dizi oluşturulur
        System.out.println(Arrays.toString(arr)); // Dizi yazdırılır

        List<Integer> uniqueArr = new ArrayList<>(); // Boş bir ArrayList oluşturulur
        for (int each : arr) { // Döngü, orijinal dizinin her bir elemanı için çalışır
            if (!uniqueArr.contains(each)) { // Eğer eleman listede yoksa
                uniqueArr.add(each); // Eleman listeye eklenir
            }
        }
        System.out.println("The numbers of the unique arr: " + uniqueArr); // Benzersiz elemanlar yazdırılır

        arr = new int[uniqueArr.size()]; // Yeni bir dizi oluşturulur, boyutu benzersiz elemanların sayısı kadardır

        System.out.println(Arrays.toString(arr)); // Yeni dizi yazdırılır

        for (int i = 0; i < arr.length; i++) { // Döngü, yeni dizinin her bir elemanı için çalışır
            arr[i] = uniqueArr.get(i); // Eleman, benzersiz elemanlar listesinden alınır ve yeni dizideki ilgili indekse yerleştir

        }
        System.out.println(Arrays.toString(arr));// ilgili indekse yerlestirilen eleman yazdirilir
    }
}

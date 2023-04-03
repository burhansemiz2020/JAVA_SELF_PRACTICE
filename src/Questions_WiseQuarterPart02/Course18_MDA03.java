package Questions_WiseQuarterPart02;

import java.util.Arrays;

public class Course18_MDA03 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen 2 katli bir array’de her bir ic
        array’deki elementleri toplayip, yeni olusturacagimiz
        tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
         */
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[] result = new int[arr.length]; // tek boyutlu dizi için yeni bir yer ayıralım

        for(int i = 0; i < arr.length; i++){ // her bir alt dizi için toplama işlemi yapalım
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){

                sum += arr[i][j];
                result[i] = sum;
            }
            // toplamı tek boyutlu dizinin uygun indeksine atayalım
        }

        System.out.println(Arrays.toString(result)); // [10, 3, 12, 10, 9] çıktısını alırız


    }
}

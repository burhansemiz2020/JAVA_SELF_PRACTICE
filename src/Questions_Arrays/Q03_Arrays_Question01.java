package Questions_Arrays;

import java.util.Arrays;

public class Q03_Arrays_Question01 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini
        2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.
         */
        int [] arr = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;

        }
        System.out.println("The new values of arr are: \n" + Arrays.toString(arr));
        /*
        The new values of arr are:
        [3, 4, 5, 6, 7, 8, 9, 10]
         */

    }
}

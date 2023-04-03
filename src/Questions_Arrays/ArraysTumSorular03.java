package Questions_Arrays;

import java.util.Arrays;

public class ArraysTumSorular03 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */
        int[] arr = {3, 4, 5, 6, 9, 11, 5, 9};
        int temp = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];

        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));

        System.out.println("================================");

        int[] a = {1, 2, 3};
        int eklenecekEleman = 10;
          /*
        Arraylerde eleman eklemek icin ikinci bir arr ye atariz
         */
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
        b[b.length - 1] = eklenecekEleman;
        System.out.println(Arrays.toString(b));
    }
}

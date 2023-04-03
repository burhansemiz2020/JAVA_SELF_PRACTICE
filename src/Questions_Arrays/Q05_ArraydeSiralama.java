package Questions_Arrays;

import java.util.Arrays;

public class Q05_ArraydeSiralama {
    public static void main(String[] args) {
        /*
        Verilen bir array i order a gore siralamak icin arrays.sort90 kullanilir
         */
        int arr[] = {3,9,6,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String [] arr1={"Hasan","Huseyin","Mehmet","Mesut","Mercan","ali"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        /*
        sort yapildiktan sonra array de bir elementin
        var olup olmadigini kontrol etmek icin
         */
        System.out.println(Arrays.binarySearch(arr1, "ali"));
    }
}

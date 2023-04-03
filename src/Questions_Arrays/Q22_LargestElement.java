package Questions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q22_LargestElement {
    public static void main(String[] args) {
        /*
        17. Write a Java program to find the second largest element in an array.
         */
        int[] arr = {54, 64, 21, 87, 96, 42, 16, 54, 86, 42, 16, 54, 86, 74, 65, 16};
        System.out.println("The list of the numbers: "+Arrays.toString(arr));
        Arrays.sort(arr);
        int in=arr.length-1;//burada sondan ikinciyi atiyoruz.
        while (arr[in]==arr[arr.length-1]){//burada atanan ikinciyi liste icerisinde degerini bulduruyoruz
            in--;
        }
        System.out.println("The second biggest number = " +arr[in]);

    }
}

package Questions_Arrays;

import java.util.Arrays;

public class Q16_ReverseInteger {
    public static void main(String[] args) {
        /*
        11. Write a Java program to reverse an array of integer values.
         */
        int[]arr={8,14,51,36,56,21,13,15,19};
        System.out.println("Arrays: " + Arrays.toString(arr));
        revInteger(arr);

    }
    public static void revInteger(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (end>start){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;

        }

    }
}

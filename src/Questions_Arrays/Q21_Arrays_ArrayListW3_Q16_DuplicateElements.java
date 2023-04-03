package Questions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21_Arrays_ArrayListW3_Q16_DuplicateElements {
    public static void main(String[] args) {
        /*
        16. Write a Java program to remove duplicate elements from an array.
        {10,22,10,20,11,22}
         */
        int[]arr={10,22,10,20,11,22};

        List<Integer> numUniqueList= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!numUniqueList.contains(arr[i])){
                numUniqueList.add(arr[i]);
            }
        }
        System.out.println(numUniqueList);
        arr = new int[numUniqueList.size()];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numUniqueList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

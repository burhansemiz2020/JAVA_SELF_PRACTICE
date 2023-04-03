package Questions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q20_Arrays_ArrayListW3_Q15_CommonElementsInt {
    public static void main(String[] args) {
        /*
        15. Write a Java program to find the common elements between two arrays of integers.
         */

        int[] arr1 = {6,5,9,7};
        int[] arr2 = {1,5,9,2};
        int[] common=commonElements(arr1, arr2);
        System.out.println("Common elements: "+ Arrays.toString(common));

    }

    public static int[] commonElements(int[] arr1, int[] arr2) {
        ArrayList<Integer>list1=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }
        ArrayList<Integer>list2=new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }
        list1.retainAll(list2);
        int [] common=new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            common[i]=list1.get(i);

        }return common;
    }


}


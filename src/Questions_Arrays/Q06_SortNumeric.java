package Questions_Arrays;

import java.util.Arrays;

public class Q06_SortNumeric {
    public static void main(String[] args) {
        //1. Write a Java program to sort a numeric array and a string array.
        int[] arrNum={15,45,87,49,3,8,91};
        String[] arrStr={"Burhan","Ahmet","Zeynep","saim","Orhan","semiz","oren"};
        Arrays.sort(arrNum);
        System.out.println("Original numeric array: " +Arrays.toString(arrNum));
        Arrays.sort(arrStr);
        System.out.println("Original string array: " +Arrays.toString(arrStr));

    }
}

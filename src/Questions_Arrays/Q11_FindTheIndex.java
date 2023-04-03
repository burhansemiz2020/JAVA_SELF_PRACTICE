package Questions_Arrays;

import java.util.Scanner;

public class Q11_FindTheIndex {
    public static void main(String[] args) {
        /*
        6. Write a Java program to find the index of an array element.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        int num=scan.nextInt();
        int [] arr={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of " + num + " is " + indexArray(arr, num));
    }
    public static int indexArray(int[]arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
                            /*
                            Enter your numbers:
                            15
                            Index position of 15 is 3
                             */

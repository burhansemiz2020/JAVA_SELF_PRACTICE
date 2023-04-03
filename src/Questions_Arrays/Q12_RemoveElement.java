package Questions_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_RemoveElement {
    public static void main(String[] args) {
        /*
        7. Write a Java program to remove a specific element from an array.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the elemnt that you want to remove: ");
        String str=scan.nextLine();
        String[]arr={"Kezban","Dursun","Temel","Deli","Veli","Ali"};
        System.out.println("Original Array: " + Arrays.toString(arr));

    }public static String removeElement(String[]arr, String str){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==str){
                return "i";
            }

        }
        return null;

    }
}

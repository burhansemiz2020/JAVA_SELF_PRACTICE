package Questions_Arrays;

import java.util.Scanner;

public class Q14_InsertElement {
    public static void main(String[] args) {
        /*
        9. Write a Java program to insert an element (specific position) into an array.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        //****
        }
        System.out.println("Enter the element to be inserted: ");
        int x=scan.nextInt();
        System.out.println("Enter the position of the element to be inserted: ");
        int pos=scan.nextInt();
        //****
        for (int i = n - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the element at the specified position
        arr[pos - 1] = x;

        System.out.println("New array after inserting the element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");



        }
    }
}

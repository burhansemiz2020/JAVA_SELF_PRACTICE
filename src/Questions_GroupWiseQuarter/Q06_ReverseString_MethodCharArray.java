package Questions_GroupWiseQuarter;

import java.util.Scanner;

public class Q06_ReverseString_MethodCharArray {
    public static void main(String[] args) {
        /*
         Write a Java program to reverse a string.
        Test Data:
        Input a string: The quick brown fox
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scan.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}

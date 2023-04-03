package Questions_String;

import java.util.Scanner;

public class Q06_CompareCharSequence {
    public static void main(String[] args) {
        /*
        Write a Java program to compare a given string to the specified character sequence.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=scan.nextLine();
        System.out.println("Enter the second string: ");
        String str2=scan.nextLine();
        System.out.println("Enter the specified character: ");
        CharSequence ch=scan.nextLine();

        System.out.println("comparing " +str1+ " and " +ch+ ": " +str1.contentEquals(ch));
        System.out.println("comparing " +str2+ " and " +ch+ ": " +str2.contentEquals(ch));
    }
}

package Questions_String;

import java.util.Scanner;

public class Q05_ContainsSequenceCharValues {
    public static void main(String[] args) {
        /*
        Write a Java program to test if a given string
        contains the specified sequence of char values.
        Enter premier string
        Enter second string
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1=scan.nextLine();
        System.out.println("Enter the second String: ");
        String str2=scan.nextLine();

        System.out.println("First String: " +str1);
        System.out.println("Second String: " +str2);

        System.out.println(str1.contains(str2));
    }
}

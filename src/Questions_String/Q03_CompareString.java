package Questions_String;

import java.util.Scanner;

public class Q03_CompareString {
    public static void main(String[] args) {
        /*
        Write a Java program to compare two strings lexicographically.
        Two strings are lexicographically equal if they are the same
        length and contain the same characters in the same positions.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1=scan.nextLine();
        System.out.println("Enter String 2: ");
        String str2=scan.nextLine();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        // Compare the two strings.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result<0){
            System.out.println("\"" +str1 + "\"" + " is less then " + "\"" + str2 + "\"");
        } else if (result==0) {
            System.out.println("\"" +str1 + "\"" + " is equal to " + "\"" + str2 + "\"");

        }else {
            System.out.println("\"" +str1 + "\"" + " is greater then " + "\"" + str2 + "\"");
        }
    }
}

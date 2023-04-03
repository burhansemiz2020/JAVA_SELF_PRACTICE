package Questions_String;

import java.util.Scanner;

public class Q04_ConcatenateString {
    public static void main(String[] args) {
        /*
        7. Write a Java program to concatenate a given string to the end of another string.
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1=scan.nextLine()+" ";
        System.out.print("Enter the second String: ");
        String str2=scan.nextLine();

        System.out.println("The method simple: " + str1+""+str2);
        //with concat
        String str3=str1.concat(str2);
        System.out.println("The concatenated string is: " + str3);
    }
}

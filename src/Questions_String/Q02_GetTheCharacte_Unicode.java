package Questions_String;

import java.util.Scanner;

public class Q02_GetTheCharacte_Unicode {
    public static void main(String[] args) {
        /*
        2. Write a Java program to get the character
        (Unicode code point) at the given index within the String.
        Original String : w3resource.com
        ou with Scanner 1 et 9 index

         */
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        System.out.println("Original String : " + str);

        int val1= str.codePointAt(1);
        int val2= str.codePointAt(9);
        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}

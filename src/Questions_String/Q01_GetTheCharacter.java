package Questions_String;

import java.util.Scanner;

public class Q01_GetTheCharacter {
    public static void main(String[] args) {
        /*
        1. Write a Java program to get the character at the given index within the String.
        Original String = Java Exercises!
        The character at position 0
        The character at position 10
         */
        String str= "Java Exercises!";
        int index1=str.charAt(0);
        int index2=str.charAt(10);

        System.out.println("The given indexes of the string are: " +(char)index1+ " , " +(char)index2);



    }
}

package W3Resources;

import java.util.Scanner;

public class Q38_CountTheLetters {
    public static void main(String[] args) {
        /*
        38. Write a Java program to count the letters, spaces,
        numbers and other characters of an input string.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String str = scan.nextLine();
        scan.close();

        int letterCount=0;
        int spaceCount=0;
        int numberCount=0;
        int otherCount=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Other count: " + otherCount);
        }


    }


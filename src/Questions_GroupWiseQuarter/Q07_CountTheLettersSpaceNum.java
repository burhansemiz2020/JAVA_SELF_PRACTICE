package Questions_GroupWiseQuarter;

import java.util.Scanner;

public class Q07_CountTheLettersSpaceNum {
    public static void main(String[] args) {
        /*
        Write a Java program to count the letters, spaces,
        numbers and other characters of an input string.
            Expected Output
            The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
            letter: 23
            space: 9
            number: 10
            other: 6
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez une phrase");
        //Phrase dois contient chiffre, lettre
        // symbol espace etc
        String str=scan.nextLine();
        count(str);
        
        
    }

    private static void count(String str) {
    }
}

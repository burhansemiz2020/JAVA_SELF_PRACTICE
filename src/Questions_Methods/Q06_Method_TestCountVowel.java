package Questions_Methods;

import java.util.Scanner;

public class Q06_Method_TestCountVowel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        int countVowel=Q06_Method_CountVowel.countVowel(str);
            System.out.println(countVowel);
        }

    }


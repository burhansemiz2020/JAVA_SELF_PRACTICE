package Questions_Methods;

import java.util.Scanner;

public class Q06_Method_CountVowel {
    /*
        4. Write a Java method to count all
        vowels in a string. Go to the editor
        Test Data:
        Input the string: w3resource
        Expected Output:
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.nextLine();
        System.out.println("Total vowel of the string: " + countVowel(str));
    }
    public static int countVowel(String str){

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' ||
                    str.charAt(i)=='i' || str.charAt(i)=='o' ||
                    str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}

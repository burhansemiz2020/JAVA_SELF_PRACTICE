package Questions_Methods;

import java.util.Scanner;

public class Q07_Method_CountWords {
    public static void main(String[] args) {
        /*
        5. Write a Java method to count all
        words in a string. Go to the editor
        Test Data:
        Input the string: The quick brown
        fox jumps over the lazy dog.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a phrase");
        String str= scan.nextLine();
        System.out.println("Number of the phrase is: " +countWords(str));

    }
    public static int countWords(String str){
        int count=0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length()-1)))){
            for (int i = 0; i < str.length() ; i++) {
                if (str.charAt(i)== ' '){
                    count++;
                }

            }
            count=count+1;
        }
        return count;// returns 0 if string starts or ends with space " ".
    }
}

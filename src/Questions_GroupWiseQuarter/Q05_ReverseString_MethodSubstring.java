package Questions_GroupWiseQuarter;

import java.util.Scanner;

public class Q05_ReverseString_MethodSubstring {
    public static void main(String[] args) {
        /*
        Write a Java program to reverse a string.
        Test Data:
        Input a string: The quick brown fox
         */
        //METHOD_1
        Scanner scan=new Scanner(System.in);
        System.out.println("Entrez une phrase pour inverse");
        String str=scan.nextLine();
            for (int i=str.length()-1; i>=0; i--){
                System.out.print("Reverse String : " + str.substring(i,i+1));
        }

    }
}

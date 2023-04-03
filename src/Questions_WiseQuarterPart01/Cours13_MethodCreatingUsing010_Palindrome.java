package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours13_MethodCreatingUsing010_Palindrome {
    public static void main(String[] args) {
        /*
        Verilen bir String in Palindrome olup olmadigini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text=scan.nextLine();

        String reverseText=Cours13_MethodCreatingUsing04.reverseString(text);

        if(text.equals(reverseText)){
            System.out.println(text+" is a palindrome");
        }else{
            System.out.println(text+" is not a palindrome");
        }

    }
}

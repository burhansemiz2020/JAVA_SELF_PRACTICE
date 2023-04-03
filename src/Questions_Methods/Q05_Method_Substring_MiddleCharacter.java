package Questions_Methods;

import java.util.Scanner;

public class Q05_Method_Substring_MiddleCharacter {
    public static void main(String[] args) {
        /*
        3. Write a Java method to display
           the middle character of a string.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a string");
        String str= scan.nextLine();

        System.out.println("The middle character in the string: " + middle(str)+"\n");
    }
    public static String middle(String str){
        int position;
        int length;
        if (str.length() % 2==0){
            position=str.length()/2-1;
            length=2;
        }
        else {
            position = str.length()/2;
            length=1;
        }
        return str.substring(position, position + length);
    }
}

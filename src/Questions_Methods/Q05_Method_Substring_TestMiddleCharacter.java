package Questions_Methods;

import java.util.Scanner;

public class Q05_Method_Substring_TestMiddleCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a string: ");
        String str=scan.nextLine();
        String middle=Q05_Method_Substring_MiddleCharacter.middle(str);
        System.out.println(middle);
    }
}

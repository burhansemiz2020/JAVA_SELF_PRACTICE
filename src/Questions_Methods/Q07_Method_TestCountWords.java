package Questions_Methods;

import java.util.Scanner;

public class Q07_Method_TestCountWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Write a sentences: ");
        String str=scan.nextLine();
        int countWords=Q07_Method_CountWords.countWords(str);
        System.out.println(countWords);

    }
}

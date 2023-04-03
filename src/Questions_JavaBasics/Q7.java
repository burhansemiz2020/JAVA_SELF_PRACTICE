package Questions_JavaBasics;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes a number as
        input and prints its multiplication table upto 10.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        System.out.println(num*1+"\n"+num*2+
                "\n"+num*3+"\n"+num*4+
                "\n"+num*4+"\n"+num*5+
                "\n"+num*6+"\n"+num*7+
                "\n"+num*8+"\n"+num*9+
                "\n"+num*10);
    }
}

package Questions_Methods;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Q10_Method_TestCountFaktoryel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        int faktoryel=Q10_Method_CountFaktoryel.countFaktoryel(num);
        System.out.println(faktoryel);
    }
}

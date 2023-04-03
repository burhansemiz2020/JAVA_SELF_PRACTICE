package Questions_Methods;

import java.util.Scanner;

public class Q08_Method_TestCountDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scan.nextInt();
        int countDigit=Q08_Method_CountDigit.countDigit(a);
        System.out.println(countDigit);

    }
}

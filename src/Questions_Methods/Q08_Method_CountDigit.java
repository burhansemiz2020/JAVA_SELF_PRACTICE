package Questions_Methods;

import java.util.Scanner;

public class Q08_Method_CountDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int digit=scan.nextInt();
        System.out.println("The sum of the digit is: " + countDigit(digit));
    }
    public static int countDigit(long n){
        int result=0;
        while (n>0){
            result+=n%10;
            n/=10;

        }
        return result;
    }
}

package Questions_Methods;

import java.util.Scanner;

public class Q10_Method_CountFaktoryel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Faktoryel of the number is: " + countFaktoryel(num));
    }

    public static int countFaktoryel(int num) {
        int faktoryel = 1;
        while (num > 0) {
            faktoryel *= num;
            num--;
        }
        return faktoryel;

    }
}

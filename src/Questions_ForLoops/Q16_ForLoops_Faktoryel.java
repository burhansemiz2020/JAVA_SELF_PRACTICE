package Questions_ForLoops;

import java.util.Scanner;

public class Q16_ForLoops_Faktoryel
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number2 = 1;
        System.out.println("20 den kucuk sayi alin");
        int sayi2 = scanner.nextInt();
        String sayi = String.valueOf(sayi2);
        scanner.nextLine();
        int a=0;
        System.out.print(sayi+"! = ");
        for (int i = sayi2; i >= 1; i--) {
            a = i;
            number2 *= i;
            if (i>1){
                System.out.print(i+" * ");
            }
        }
        System.out.print(a);
        System.out.println("= "+number2);
    }
}

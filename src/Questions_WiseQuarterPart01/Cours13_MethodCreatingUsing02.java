package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours13_MethodCreatingUsing02 {
    public static void main(String[] args) {
        /*
        Kullanicidan 10 dan kucuk iki sayi
        alip faktoryel degerlerini toplayin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int total = Cours13_MethodCreatingUsing01.countFaktoryel(num1) +
                Cours13_MethodCreatingUsing01.countFaktoryel(num2);
        System.out.println(total);

    }
}

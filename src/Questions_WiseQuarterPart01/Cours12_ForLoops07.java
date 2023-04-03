package Questions_WiseQuarterPart01;

import java.util.Scanner;

public class Cours12_ForLoops07 {
    public static void main(String[] args) {
        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip,
        rakamlar toplamini yazdirin.
        Bu soruda while
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();

        int firstDigit;
        int sum=0;

        for (int i = num; i > 0; i++) {
            firstDigit=num%10;
            sum+=firstDigit;
            num/=10;

        }
        System.out.println("The sum of the numbers entered: " +sum);
        scan.close();
    }
}
